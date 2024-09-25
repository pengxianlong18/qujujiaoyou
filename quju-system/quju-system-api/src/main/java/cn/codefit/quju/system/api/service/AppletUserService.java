package cn.codefit.quju.system.api.service;


import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.api.dto.AppletUserDto;
import cn.codefit.quju.system.api.vo.AppletUserVo;
import com.github.pagehelper.PageInfo;

public interface AppletUserService {


    /**
     * 分页查询用户信息接口
     *
     * @param param
     * @return
     */
    CommonResponse<PageInfo<AppletUserDto>> queryAppletUserDtoList(AppletUserVo param);

    /**
     * 导出用户信息接口
     *
     * @param param
     * @return
     */
    CommonResponse<String> exprotAppletUserDtoList(AppletUserVo param);

}
