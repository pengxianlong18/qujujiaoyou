package cn.codefit.quju.system.api.service;


import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.api.dto.BasOrderDto;
import cn.codefit.quju.system.api.vo.BasOrderVo;
import com.github.pagehelper.PageInfo;

public interface BasOrderService {


    /**
     * 分页查询订单信息接口
     *
     * @param param
     * @return
     */
    CommonResponse<PageInfo<BasOrderDto>> queryBasOrderDtoList(BasOrderVo param);

    /**
     * 导出订单信息接口
     *
     * @param param
     * @return
     */
    CommonResponse<String> exprotBasOrderDtoList(BasOrderVo param);

}
