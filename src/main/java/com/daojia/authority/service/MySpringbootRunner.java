package com.daojia.authority.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Author: weitao.liu
 * @Date: 2018/12/19 11:15
 * @Description:
 */
@Component
public class MySpringbootRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("自定义runner启动了");
    }
}
