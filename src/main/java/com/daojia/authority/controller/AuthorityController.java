package com.daojia.authority.controller;

import com.daojia.authority.annotation.Authority;
import com.daojia.authority.annotation.LoginRequired;
import com.daojia.authority.util.MyThreadPool;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: weitao.liu
 * @Date: 2018/12/8 11:38
 * @Description:
 */
@Api(value = "权限验证页")
@RestController(value = "hello")
@RequestMapping("/authorityController")
public class AuthorityController {

    @Authority
    @RequestMapping("/getMyAuthorityPass")
    @LoginRequired
    public String getMyAuthorityPass() {
        MyThreadPool.instanceThreadPool();
        System.out.println("权限测试");
        return  "hello";
    }
}
