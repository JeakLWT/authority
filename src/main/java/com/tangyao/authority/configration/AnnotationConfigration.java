package com.tangyao.authority.configration;

import com.tangyao.authority.intercepter.AuthorityIntercepter;
import com.tangyao.authority.intercepter.SessionInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: weitao.liu
 * @Date: 2018/12/8 11:32
 * @Description:
 */
@Configuration
public class AnnotationConfigration implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(authorityIntercepter());
        InterceptorRegistration sessionIntercepter = registry.addInterceptor(sessionInterceptor());
        interceptorRegistration.order(2);
        sessionIntercepter.order(1);
        sessionIntercepter.addPathPatterns("/**");
        sessionIntercepter.excludePathPatterns("/");
        sessionIntercepter.excludePathPatterns("");
        interceptorRegistration.addPathPatterns("/**");
        interceptorRegistration.excludePathPatterns("/");
        interceptorRegistration.excludePathPatterns("");
        interceptorRegistration.excludePathPatterns("http://localhost/swagger-ui.html");
    }

    @Bean
    public AuthorityIntercepter authorityIntercepter(){
        return new AuthorityIntercepter();
    }

    @Bean
    public SessionInterceptor sessionInterceptor(){
        return new SessionInterceptor();
    }


}
