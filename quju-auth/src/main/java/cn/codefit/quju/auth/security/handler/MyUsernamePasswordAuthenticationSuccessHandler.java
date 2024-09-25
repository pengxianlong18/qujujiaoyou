package cn.codefit.quju.auth.security.handler;

import cn.codefit.quju.base.rpc.CommonResponse;
import com.alibaba.fastjson.JSONObject;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义-成功身份验证后处理逻辑
 */
@Component
public class MyUsernamePasswordAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    /**
     * 当用户通过身份验证时调用。
     *
     * @param request
     * @param response
     * @param authentication 在此期间创建认证内容。
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        response.setContentType("text/html; charset=UTF-8");
        System.out.println("request = " + request);
        response.getWriter().write(JSONObject.toJSONString(CommonResponse.success(authentication.getPrincipal())));
    }
}
