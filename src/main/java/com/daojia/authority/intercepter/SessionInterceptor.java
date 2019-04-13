package com.daojia.authority.intercepter;

import org.springframework.util.CollectionUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 * @Author: weitao.liu
 * @Date: 2018/12/10 14:31
 * @Description:
 */
public class SessionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Cookie[] cookies = request.getCookies();

        if(cookies!=null&&!CollectionUtils.isEmpty(Arrays.asList(cookies))){
            for (Cookie cookie:cookies) {
                cookie.setValue("cookies");
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        System.out.println("SessionInterceptor .................complete");

    }
}
