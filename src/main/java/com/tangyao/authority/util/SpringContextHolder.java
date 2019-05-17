package com.tangyao.authority.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Author: weitao.liu
 * @Date: 2018/12/17 15:40
 * @Description:
 */
@Component
public class SpringContextHolder implements ApplicationContextAware {

    public  static ApplicationContext applicationContext=null;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
