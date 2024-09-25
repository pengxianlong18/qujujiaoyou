package cn.codefit.quju.system.api.service;


import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.api.dto.BasActivityDto;
import cn.codefit.quju.system.api.vo.BasActivityVo;
import com.github.pagehelper.PageInfo;

public interface BasActivityService {


    /**
     * 分页查询活动信息接口
     *
     * @param param
     * @return
     */
    CommonResponse<PageInfo<BasActivityDto>> queryBasActivityDtoList(BasActivityVo param);

    /**
     * 导出活动信息接口
     *
     * @param param
     * @return
     */
    CommonResponse<String> exprotBasActivityDtoList(BasActivityVo param);

}
