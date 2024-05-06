package registration.hospitalregistration.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import registration.hospitalregistration.interceptor.LoginCheckInterceptor;

//@Configuration//配置类
public class WebConfig implements WebMvcConfigurer {

    private final LoginCheckInterceptor loginCheckInterceptor;

    public WebConfig(LoginCheckInterceptor loginCheckInterceptor) {
        this.loginCheckInterceptor = loginCheckInterceptor;
    }

    /**
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //addPathPatterns("/**")是指所有请求都拦截
       registry.addInterceptor(loginCheckInterceptor).addPathPatterns("/**");
    }
}
