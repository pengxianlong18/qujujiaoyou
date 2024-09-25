package cn.codefit.quju.system.service.service.impl;

import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.enums.ConstantEnum;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.base.util.DateUtil;
import cn.codefit.quju.system.api.dto.BasOrderDto;
import cn.codefit.quju.system.api.service.BasOrderService;
import cn.codefit.quju.system.api.vo.BasOrderVo;
import cn.codefit.quju.system.service.biz.dao.BasOrderBizMapper;
import cn.codefit.quju.system.service.biz.export.EasyExcelBizService;
import cn.codefit.quju.system.service.biz.export.entity.BasOrderExportDto;
import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
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
@DubboService(version = Constant.VERSION, interfaceClass = BasOrderService.class)
@RequestMapping(value = "/order")
@RestController
@Slf4j
public class BasOrderServiceImpl implements BasOrderService {

    @Autowired
    private BasOrderBizMapper basOrderBizMapper;
    @Autowired
    private EasyExcelBizService easyExcelBizService;


    /**
     * 分页查询订单信息接口
     *
     * @param param
     * @return
     */
    @Override
    @RequestMapping(value = "/queryBasOrderDtoList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public CommonResponse<PageInfo<BasOrderDto>> queryBasOrderDtoList(@RequestBody BasOrderVo param) {

        Map<String, Object> map = BeanUtil.copyProperties(param, Map.class);
        map.put("isDeleted", ConstantEnum.IS_DELETE_NO.getCode());
        int pageNum = param.getPageNum();
        int pageSize = param.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<BasOrderDto> list = basOrderBizMapper.selectByCondition(map);
        PageInfo<BasOrderDto> pageInfo = new PageInfo(list);
        if (CollectionUtils.isEmpty(list)) {
            return CommonResponse.success(new PageInfo<>(new ArrayList<>()));
        }
        return CommonResponse.success(pageInfo);
    }

    /**
     * 导出订单信息接口
     *
     * @param param
     * @return
     */
    @Override
    @RequestMapping(value = "/exprotBasOrderDtoList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public CommonResponse<String> exprotBasOrderDtoList(@RequestBody BasOrderVo param) {
        String fileName = "订单信息导出_" + DateUtil.timeStamp();
        CommonResponse<String> commonResponse = easyExcelBizService.exportComplexExcel(fileName, param, BasOrderExportDto.class, (queryParam, pageNo, pageSize) -> {
            queryParam.setPageNum(pageNo);
            queryParam.setPageSize(pageSize);
            CommonResponse<PageInfo<BasOrderDto>> commonResponseData = queryBasOrderDtoList(queryParam);
            PageInfo<BasOrderDto> pageInfo = commonResponseData.getData();
            List<BasOrderExportDto> basOrderExportDtos = BeanUtil.copyToList(pageInfo.getList(), BasOrderExportDto.class);
            basOrderExportDtos.forEach(item -> {
                item.setTradeStatusStr("未支付");
                if (StringUtils.isNotBlank(item.getTradeStatus()) && item.getTradeStatus().equals("SUCCESS")) {
                    item.setTradeStatusStr("支付成功");
                }
            });
            PageInfo<BasOrderExportDto> exportDtoPageInfo = new PageInfo<>(basOrderExportDtos);
            exportDtoPageInfo.setPages(pageInfo.getPages());
            exportDtoPageInfo.setPageSize(pageInfo.getPageSize());
            exportDtoPageInfo.setPageNum(pageInfo.getPageNum());
            return exportDtoPageInfo;
        });
        return commonResponse;
    }
}
