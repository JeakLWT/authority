package com.daojia.authority.listener.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: weitao.liu
 * @Date: 2018/12/17 15:14
 * @Description:
 */
public class AuthorityEvent extends ApplicationEvent {
    public AuthorityEvent(Object source) {
        super(source);
    }

    public void authoritySay(){
        System.out.println("监听器开始工作了");
    }
}
