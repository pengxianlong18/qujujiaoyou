package cn.codefit.quju.auth.security.handler;

import cn.codefit.quju.base.enums.ResponseCode;
import cn.codefit.quju.base.rpc.CommonResponse;
import com.alibaba.fastjson.JSONObject;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义-身份验证失败后处理逻辑
 */
@Component
public class MyUsernamePasswordAuthenticationFailureHandler implements AuthenticationFailureHandler {


    /**
     * 当用户未通过身份验证时调用。
     *
     * @param request
     * @param response
     * @param exception
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException {
        System.out.println("exception = " + exception);
        response.setContentType("text/html; charset=UTF-8");
        if (exception.getClass().getClass().isInstance(AuthenticationServiceException.class)) {
            response.getWriter().write(CommonResponse.error(ResponseCode.ONLY_POST).toString());
        } else if (exception.getClass().getClass().isInstance(InternalAuthenticationServiceException.class)) {
            response.getWriter().write(JSONObject.toJSONString(CommonResponse.error(ResponseCode.USER_NOT_EXIST)));
        }
    }
}
