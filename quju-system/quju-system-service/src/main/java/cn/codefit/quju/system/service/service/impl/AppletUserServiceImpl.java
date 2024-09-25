package cn.codefit.quju.system.service.service.impl;

import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.enums.ConstantEnum;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.base.util.DateUtil;
import cn.codefit.quju.system.api.dto.AppletUserDto;
import cn.codefit.quju.system.api.service.AppletUserService;
import cn.codefit.quju.system.api.vo.AppletUserVo;
import cn.codefit.quju.system.service.biz.dao.ApletUserBizMapper;
import cn.codefit.quju.system.service.biz.export.EasyExcelBizService;
import cn.codefit.quju.system.service.biz.export.entity.AppletUserExportDto;
import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageHelper;
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
 * 小程序用户相关接口
 * 查询、导出等
 */
@DubboService(version = Constant.VERSION, interfaceClass = AppletUserService.class)
@RequestMapping(value = "/appletUser")
@RestController
@Slf4j
public class AppletUserServiceImpl implements AppletUserService {

    @Autowired
    private ApletUserBizMapper apletUserBizMapper;

    @Autowired
    private EasyExcelBizService easyExcelBizService;


    /**
     * 分页查询用户信息接口
     *
     * @param param
     * @return
     */
    @Override
    @RequestMapping(value = "/queryAppletUserDtoList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public CommonResponse<PageInfo<AppletUserDto>> queryAppletUserDtoList(@RequestBody AppletUserVo param) {
        Map<String, Object> map = BeanUtil.copyProperties(param, Map.class);
        map.put("isDeleted", ConstantEnum.IS_DELETE_NO.getCode());
        int pageNum = param.getPageNum();
        int pageSize = param.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<AppletUserDto> list = apletUserBizMapper.selectByExample(map);
        PageInfo<AppletUserDto> pageInfo = new PageInfo(list);
        if (CollectionUtils.isEmpty(list)) {
            return CommonResponse.success(new PageInfo<>(new ArrayList<>()));
        }
        return CommonResponse.success(pageInfo);
    }

    /**
     * 导出用户信息接口
     *
     * @param param
     * @return
     */
    @Override
    @RequestMapping(value = "/exprotAppletUserDtoList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public CommonResponse<String> exprotAppletUserDtoList(@RequestBody AppletUserVo param) {
        String fileName = "用户信息导出_" + DateUtil.timeStamp();
        CommonResponse<String> commonResponse = easyExcelBizService.exportExcel(fileName, param,
                AppletUserExportDto.class, (queryParam, pageNo, pageSize) -> {
                    queryParam.setPageNum(pageNo);
                    queryParam.setPageSize(pageSize);
                    CommonResponse<PageInfo<AppletUserDto>> commonResponseData = queryAppletUserDtoList(queryParam);
                    PageInfo<AppletUserDto> pageInfo = commonResponseData.getData();
                    List<AppletUserExportDto> appletUserExportDtos = BeanUtil.copyToList(pageInfo.getList(), AppletUserExportDto.class);
                    PageInfo<AppletUserExportDto> exportDtoPageInfo = new PageInfo<>(appletUserExportDtos);
                    exportDtoPageInfo.setPages(pageInfo.getPages());
                    exportDtoPageInfo.setPageSize(pageInfo.getPageSize());
                    exportDtoPageInfo.setPageNum(pageInfo.getPageNum());
                    return exportDtoPageInfo;
                });
        return commonResponse;
    }
}
