package cn.codefit.quju.auth.security.userdetails.client;

import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.constant.PasswordEncoderTypeEnum;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.api.dto.SysOauthClientDto;
import cn.codefit.quju.system.api.service.SysOauthClientService;
import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.NoSuchClientException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

/**
 * OAuth2 客户端信息
 */
@Service
@RequiredArgsConstructor
public class ClientDetailsServiceImpl implements ClientDetailsService {

    @DubboReference(version =  Constant.VERSION)
    private SysOauthClientService sysOauthClientService;



    /**
     * @Cacheable 缓存
     * @param clientId
     * @return
     * @throws ClientRegistrationException
     */
    @Override
    @Cacheable(cacheNames = "aouth2", key = "'oauth-client:'+#clientId")
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        CommonResponse<SysOauthClientDto> result=sysOauthClientService.selectOAuth2ClientById(clientId);
        if(CommonResponse.isSuccess(result)){
            SysOauthClientDto sysOauthClientDto=result.getData();
            BaseClientDetails clientDetails = new BaseClientDetails(
                    sysOauthClientDto.getClientId(),
                    sysOauthClientDto.getResourceIds(),
                    sysOauthClientDto.getScope(),
                    sysOauthClientDto.getAuthorizedGrantTypes(),
                    sysOauthClientDto.getAuthorities(),
                    sysOauthClientDto.getWebServerRedirectUri()
            );
            clientDetails.setClientSecret(PasswordEncoderTypeEnum.NOOP.getPrefix() + sysOauthClientDto.getClientSecret());
            clientDetails.setAccessTokenValiditySeconds(sysOauthClientDto.getAccessTokenValidity());
            clientDetails.setRefreshTokenValiditySeconds(sysOauthClientDto.getRefreshTokenValidity());
            return clientDetails;
        } else {
            throw new NoSuchClientException("非法客户端,id: " + clientId);
        }
    }


}
