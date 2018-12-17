package com.daojia.authority.intercepter;


import com.alibaba.fastjson.JSON;
import com.daojia.authority.annotation.Authority;
import com.daojia.authority.entity.DJTest;
import com.daojia.authority.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;


/**
 * @Author: weitao.liu
 * @Date: 2018/12/8 11:19
 * @Description:
 */
public class AuthorityIntercepter implements HandlerInterceptor {

    @Resource
    private AuthorityService authorityService;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        DJTest djtest = authorityService.getDjtest();
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        Annotation[] annotations = method.getAnnotations();
        List<Annotation> annotationsList = Arrays.asList(annotations);
        for (Annotation annotation : annotationsList) {
            if (annotation.annotationType().equals(Authority.class)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("AuthorityIntercepter ................complelte");
    }
}
