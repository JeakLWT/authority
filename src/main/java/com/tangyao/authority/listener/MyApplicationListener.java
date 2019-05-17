package com.tangyao.authority.listener;

import com.tangyao.authority.listener.event.AuthorityEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: weitao.liu
 * @Date: 2018/12/17 14:36
 * @Description:
 */
@Component
public class MyApplicationListener implements ApplicationListener<AuthorityEvent> {
    private static boolean isStart = false;

    @Override
    public void onApplicationEvent(AuthorityEvent authorityEvent) {
        if(!isStart){
            authorityEvent.authoritySay();
            System.out.println("MyApplicationListener ................");
            isStart=true;
        }
    }
}
