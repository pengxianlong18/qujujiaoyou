package cn.codefit.quju.auth.security.exception;

import cn.codefit.quju.base.enums.ResponseCode;
import cn.codefit.quju.base.exception.WechatLoginException;
import cn.codefit.quju.base.exception.QujuException;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.hutool.core.exceptions.ExceptionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.rpc.RpcException;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.common.exceptions.InvalidClientException;
import org.springframework.security.oauth2.common.exceptions.InvalidGrantException;
import org.springframework.security.oauth2.common.exceptions.UnsupportedGrantTypeException;
import org.springframework.security.oauth2.provider.NoSuchClientException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionTranslator {

    @ExceptionHandler(NoSuchClientException.class)
    public CommonResponse handleError(NoSuchClientException e) {
        log.warn("exception-info", e);
        return CommonResponse.error("非法的客户端");
    }

    /**
     * 自定义异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(QujuException.class)
    public CommonResponse handleError(QujuException e) {
        log.error("exception-info", e);
        return CommonResponse.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(InvalidClientException.class)
    public CommonResponse handleError(InvalidClientException e) {
        log.warn("exception-info", e);
        return CommonResponse.error("当前模式-不支持此授权方式");
    }

    @ExceptionHandler(UnsupportedGrantTypeException.class)
    public CommonResponse handleError(UnsupportedGrantTypeException e) {
        log.warn("exception-info", e);
        return CommonResponse.error("未知的授权方式");
    }


    @ExceptionHandler(UsernameNotFoundException.class)
    public CommonResponse handleError(UsernameNotFoundException e) {
        log.warn("exception-info", e);
        return CommonResponse.error(ResponseCode.USER_NOT_EXIST);
    }


    @ExceptionHandler(InvalidGrantException.class)
    public CommonResponse handleError(InvalidGrantException e) {
        log.warn("exception-info", e);
        String message = ExceptionUtil.getMessage(e);
//        return CommonResponse.error("凭证错误");
        return CommonResponse.error(message);
    }

    @ExceptionHandler(DisabledException.class)
    public CommonResponse handleError(DisabledException e) {
        log.warn("exception-info", e);
        return CommonResponse.error(ResponseCode.ERR_USER_LOGIN_NO_STATUS);
    }

    @ExceptionHandler(LockedException.class)
    public CommonResponse handleError(LockedException e) {
        log.warn("exception-info", e);
        return CommonResponse.error(ResponseCode.ERR_USER_LOGIN_LOCK);
    }

    @ExceptionHandler(AccountExpiredException.class)
    public CommonResponse handleError(AccountExpiredException e) {
        log.warn("exception-info", e);
        return CommonResponse.error(ResponseCode.ERR_USER_LOGIN_EXPIRE);
    }

    /**
     * 小程序登录异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(WechatLoginException.class)
    public CommonResponse handleError(WechatLoginException e) {
        log.warn("exception-info", e);
        return CommonResponse.error(e.getCode(), e.getMessage());
    }

    /**
     * rpc调用异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(RpcException.class)
    public CommonResponse handleError(RpcException e) {
        log.warn("exception-info", e);
        String message = ExceptionUtil.getMessage(e);
        return CommonResponse.error(message);
    }

    /**
     * 如果由于凭据无效而拒绝身份验证请求，则抛出。*对于抛出的这个异常，它意味着帐户既没有被锁定也没有被禁用
     *
     * @param e
     * @return
     */
    @ExceptionHandler(BadCredentialsException.class)
    public CommonResponse handleError(BadCredentialsException e) {
        log.warn("exception-info", e);
        String message = ExceptionUtil.getMessage(e);
        return CommonResponse.error(message);
    }


    /**
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public CommonResponse handleError(Exception e) {
        log.warn("exception-info", e);
        String message = ExceptionUtil.getMessage(e);
        return CommonResponse.error(message);
    }


}
