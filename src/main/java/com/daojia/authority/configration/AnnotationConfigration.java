package com.daojia.authority.configration;

import com.daojia.authority.intercepter.AuthorityIntercepter;
import com.daojia.authority.intercepter.SessionInterceptor;
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
        interceptorRegistration.addPathPatterns("/**");
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
