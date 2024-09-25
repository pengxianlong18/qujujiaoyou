package cn.codefit.quju.app.api.service;

import cn.codefit.quju.app.api.dto.AppletUserDto;
import cn.codefit.quju.app.api.dto.ValidIdentityDto;
import cn.codefit.quju.app.api.dto.WxLogin2Dto;
import cn.codefit.quju.app.api.vo.AppletUserVo;
import cn.codefit.quju.app.api.vo.QrCodeVo;
import cn.codefit.quju.app.api.vo.ValidIdentityVo;
import cn.codefit.quju.app.api.vo.WeiXinLgoinVo;
import cn.codefit.quju.base.rpc.CommonResponse;

/**
 */
public interface AppletUserService {


    /**
     * 通过微信授权登录接口
     * @param weiXinLgoinReq
     * @return
     */
    CommonResponse<WxLogin2Dto> weixinLogin(WeiXinLgoinVo weiXinLgoinReq) ;

    /**
     * 绑定手机号接口
     * @param phoneCode 动态令牌
     * @return
     */
    CommonResponse<AppletUserDto> bindingPhone(String phoneCode) ;

    /**
     * 新增一个小程序用户
     * @param appletUserVo
     */
    CommonResponse<Boolean> saveAppletUser(AppletUserVo appletUserVo) ;

    /**
     *根据openId查询用户信息
     * @param openId
     * @return
     */
    CommonResponse<AppletUserDto> getAppletUserByOpenId(String openId) ;



    /**
     * 校验当前用户是否关注过公众号
     * @return
     */
    CommonResponse<Boolean> isAttentionGzh() ;



    /**
     *  获取小程序access_token
     * @return
     */
    CommonResponse<String> getAccessToken() ;

    /**
     *获取小程序二维码
     * @param code
     * @return
     */
    CommonResponse<String> getCode(QrCodeVo code) ;

    /**
     * 发布活动-判断是否实名
     * @return
     */
    CommonResponse<Boolean> isValidIdentity() ;


    /**
     * 发布活动 - 提交实名认证
     * @param validIdentityReq
     * @return
     */
    CommonResponse<ValidIdentityDto> validIdentity(ValidIdentityVo validIdentityReq) ;


    /**
     *资料-获取个人资料
     * @param id
     * @return
     */
    CommonResponse<AppletUserDto> getUser(Integer id) ;

    /**
     *资料-更新用户信息
     * @param appletUserVo
     * @return
     */
    CommonResponse<AppletUserDto> modifyUserInfo(AppletUserVo appletUserVo) ;



}
