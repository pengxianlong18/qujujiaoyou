package cn.codefit.quju.system.service.service.impl;

import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.enums.ConstantEnum;
import cn.codefit.quju.base.enums.FeeTypeEnum;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.base.util.DateUtil;
import cn.codefit.quju.base.util.EncryptUtil;
import cn.codefit.quju.system.api.dto.BasActivityDto;
import cn.codefit.quju.system.api.service.BasActivityService;
import cn.codefit.quju.system.api.vo.BasActivityVo;
import cn.codefit.quju.system.service.biz.dao.BasActivityBizMapper;
import cn.codefit.quju.system.service.biz.export.EasyExcelBizService;
import cn.codefit.quju.system.service.biz.export.entity.BasActivityExportDto;
import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 订单相关接口
 * 查询、导出等
 */
@DubboService(version = Constant.VERSION, interfaceClass = BasActivityService.class)
@RequestMapping(value = "/activity")
@RestController
@Slf4j
public class BasActivityServiceImpl implements BasActivityService {

    @Autowired
    private BasActivityBizMapper basActivityBizMapper;


    @Autowired
    private EasyExcelBizService easyExcelBizService;


    /**
     * 分页查询活动信息接口
     *
     * @param param
     * @return
     */
    @Override
    @RequestMapping(value = "/queryBasActivityDtoList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public CommonResponse<PageInfo<BasActivityDto>> queryBasActivityDtoList(@RequestBody BasActivityVo param) {

        Map<String, Object> map = BeanUtil.copyProperties(param, Map.class);
        map.put("isDeleted", ConstantEnum.IS_DELETE_NO.getCode());
        int pageNum = param.getPageNum();
        int pageSize = param.getPageSize();
//        PageHelper.startPage(pageNum,pageSize);
        List<BasActivityDto> list = basActivityBizMapper.selectByCondition(map);
        list.forEach(item -> {
            item.setContact(EncryptUtil.mobileEncrypt(item.getContact()));
        });

        PageInfo<BasActivityDto> pageInfo = new PageInfo(list);
        if (CollectionUtils.isEmpty(list)) {
            return CommonResponse.success(new PageInfo<>(new ArrayList<>()));
        }
        return CommonResponse.success(pageInfo);
    }

    /**
     * 导出活动信息接口
     *
     * @param param
     * @return
     */
    @Override
    @RequestMapping(value = "/exprotBasActivityDtoList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public CommonResponse<String> exprotBasActivityDtoList(@RequestBody BasActivityVo param) {
        String fileName = "活动信息导出_" + DateUtil.timeStamp();
        CommonResponse<String> commonResponse = easyExcelBizService.exportExcel(fileName, param, BasActivityExportDto.class, (queryParam, pageNo, pageSize) -> {
            queryParam.setPageNum(pageNo);
            queryParam.setPageSize(pageSize);
            CommonResponse<PageInfo<BasActivityDto>> commonResponseData = queryBasActivityDtoList(queryParam);
            PageInfo<BasActivityDto> pageInfo = commonResponseData.getData();
            List<BasActivityExportDto> activityExportDtos = BeanUtil.copyToList(pageInfo.getList(), BasActivityExportDto.class);
            activityExportDtos.forEach(item -> {
                item.setCostTypeStr(FeeTypeEnum.getByValue(item.getCostType()).getDescription());
            });
            PageInfo<BasActivityExportDto> exportDtoPageInfo = new PageInfo<>(activityExportDtos);
            exportDtoPageInfo.setPages(pageInfo.getPages());
            exportDtoPageInfo.setPageSize(pageInfo.getPageSize());
            exportDtoPageInfo.setPageNum(pageInfo.getPageNum());
            return exportDtoPageInfo;
        });
        return commonResponse;
    }
}
