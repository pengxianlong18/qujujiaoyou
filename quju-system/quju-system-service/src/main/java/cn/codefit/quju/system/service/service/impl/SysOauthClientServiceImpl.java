package cn.codefit.quju.system.service.service.impl;

import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.enums.ResponseCode;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.api.dto.SysOauthClientDto;
import cn.codefit.quju.system.api.service.SysOauthClientService;
import cn.codefit.quju.system.api.vo.SysOauthClientVo;
import cn.codefit.quju.system.model.po.SysOauthClient;
import cn.codefit.quju.system.service.biz.SysOauthClientBizService;
import cn.hutool.core.bean.BeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * oauth2客户端服务
 */
@DubboService(version = Constant.VERSION, interfaceClass = SysOauthClientService.class)
@RequestMapping(value = "/client")
@RestController
@Slf4j
public class SysOauthClientServiceImpl implements SysOauthClientService {

    @Autowired
    private SysOauthClientBizService sysOauthClientBizService;

    /**
     * 根据id获取OAuth2客户端认证信息
     *
     * @param clientId
     * @return
     */
    @Override
    @RequestMapping(value = "/selectOAuth2ClientById", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public CommonResponse<SysOauthClientDto> selectOAuth2ClientById(@RequestParam String clientId) {
        //查询用户信息
        SysOauthClient sysOauthClient = sysOauthClientBizService.selectOAuth2ClientById(clientId);
        if (sysOauthClient == null) {
            return CommonResponse.error(ResponseCode.CLIENT_NOT_EXIST);
        }
        SysOauthClientDto sysOauthClientDto = BeanUtil.copyProperties(sysOauthClient, SysOauthClientDto.class);
        return CommonResponse.success(sysOauthClientDto);
    }

    /**
     * 获取oauth2客户端列表
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/querySysOauthClienList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public CommonResponse<List<SysOauthClientDto>> querySysOauthClienList(@RequestBody SysOauthClientVo param) {
        List<SysOauthClientDto> list = sysOauthClientBizService.querySysOauthClienList(param);
        return CommonResponse.success(list);
    }


}
