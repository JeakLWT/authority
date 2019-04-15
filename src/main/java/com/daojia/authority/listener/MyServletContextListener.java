package com.daojia.authority.listener;

import com.daojia.authority.entity.DJTest;
import com.daojia.authority.service.AuthorityService;
import com.daojia.authority.util.MyThreadPool;
import com.daojia.authority.util.SpringContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author: weitao.liu
 * @Date: 2019/2/11 11:24
 * @Description:
 */
@Component
public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
       // AuthorityService authorityService = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext()).getBean(AuthorityService.class);
        MyThreadPool.instanceThreadPool();
        System.out.println("ServletContextListener .....................start");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
