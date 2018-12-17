package com.daojia.authority.controller;

import com.daojia.authority.annotation.Authority;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: weitao.liu
 * @Date: 2018/12/8 11:38
 * @Description:
 */
@RestController
@RequestMapping("/authorityController")
public class AuthorityController {

    @Authority
    @RequestMapping("/getMyAuthorityPass")
    public String getMyAuthorityPass() {
        System.out.println("权限测试");
        return null;
    }
}
