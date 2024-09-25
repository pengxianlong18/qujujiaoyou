package cn.codefit.quju.system.api.service;

import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.api.dto.SysOauthClientDto;
import cn.codefit.quju.system.api.vo.SysOauthClientVo;

import java.util.List;

/**
 *
 */
public interface SysOauthClientService {

    /**
     * 根据id获取OAuth2客户端认证信息
     *
     * @param clientId
     * @return
     */
    CommonResponse<SysOauthClientDto> selectOAuth2ClientById(String clientId);

    /**
     * 获取oauth2客户端列表
     *
     * @return
     */
    CommonResponse<List<SysOauthClientDto>> querySysOauthClienList(SysOauthClientVo param);


}
