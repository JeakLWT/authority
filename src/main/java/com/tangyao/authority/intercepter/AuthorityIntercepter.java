package com.tangyao.authority.intercepter;


import com.alibaba.fastjson.JSON;
import com.tangyao.authority.annotation.Authority;
import com.tangyao.authority.entity.DJTest;
import com.tangyao.authority.service.AuthorityService;
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
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>"+requestURL.toString());
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        DJTest djtest = authorityService.getDjtest();
        System.out.println(JSON.toJSONString(djtest));
        if(handler instanceof HandlerMethod){
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            Annotation[] annotations = method.getAnnotations();
            List<Annotation> annotationsList = Arrays.asList(annotations);
            for (Annotation annotation : annotationsList) {
                if (annotation.annotationType().equals(Authority.class)) {
                    Authority authority = (Authority) annotation;
                    String value = authority.value();
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("AuthorityIntercepter ................complelte");
    }
}
