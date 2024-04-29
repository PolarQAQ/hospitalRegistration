package registration.hospitalregistration.Filter;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.util.StringUtil;
import org.junit.platform.commons.util.StringUtils;
import registration.hospitalregistration.Utils.JwtUtil;
import registration.hospitalregistration.Utils.Result;

import java.io.IOException;

@Slf4j
//@WebFilter(urlPatterns = "/*")//判断拦截哪些请求，这里是拦截所有
public class DemoFilter implements Filter {
    /**
     * @param filterConfig
     * @throws ServletException
     */
    @Override//初始化方法，只会被调用一次
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("Filter初始方法执行了");
    }

    /**
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter请求被拦截");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        1.获取请求url
        String url = request.getRequestURL().toString();

        log.info("请求的url:{}", url);

        if (url.contains("/login")) {
            log.info("登录页面，放行");
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        String jwt = request.getHeader("token");
        if (jwt.isEmpty()) {
            log.info("请求中无token，返回登录信息");
            Result error = Result.error("NOT_LOGIN");
            String notLogin = JSONObject.toJSONString(error);
            response.getWriter().write(notLogin);
            return;
        }

        try {
            JwtUtil.parseJWT(jwt);
        } catch (Exception e) {
            e.printStackTrace();
            log.info("令牌解析失败，返回未登录错误信息");
            Result error = Result.error("NOT_LOGIN");
            String notLogin = JSONObject.toJSONString(error);
            response.getWriter().write(notLogin);
            return;
        }

        System.out.println("token正确，Filter请求被放行");
        filterChain.doFilter(request,response);
    }

    /**
     *
     */
    @Override//销毁方法，只会调用一次
    public void destroy() {
        System.out.println("Filter销毁方法执行了");
        Filter.super.destroy();
    }
}
