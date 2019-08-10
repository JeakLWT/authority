package com.tangyao.authority.controller;

import com.tangyao.authority.annotation.Authority;
import com.tangyao.authority.annotation.LoginRequired;
import com.tangyao.authority.util.MyAnnotationUtils;
import com.tangyao.authority.util.MyThreadPool;
import io.swagger.annotations.Api;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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
    public String getMyAuthorityPass(HttpServletRequest request) {

        System.out.println("--------------"+request.getSession().getId());
        AnnotationUtils annotationUtils=new AnnotationUtils() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            @Override
            public String toString() {
                return super.toString();
            }

            @Override
            protected void finalize() throws Throwable {
                super.finalize();
            }
        };
        MyThreadPool.instanceThreadPool();
        System.out.println("权限测试");
        return  "hello";
    }
}
