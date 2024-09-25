package cn.codefit.quju.system.service.biz;


import cn.codefit.quju.system.api.dto.SysOauthClientDto;
import cn.codefit.quju.system.api.vo.SysOauthClientVo;
import cn.codefit.quju.system.model.po.SysOauthClient;

import java.util.List;


/**
 *
 */
public interface SysOauthClientBizService {


    /**
     * 根据id获取OAuth2客户端认证信息
     *
     * @param clientId
     * @return
     */
    SysOauthClient selectOAuth2ClientById(String clientId);

    /**
     * 获取oauth2客户端列表
     *
     * @return
     */
    List<SysOauthClientDto> querySysOauthClienList(SysOauthClientVo param);
}
