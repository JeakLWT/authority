package com.daojia.authority;

import com.daojia.authority.service.AuthorityService;
import com.daojia.authority.util.SpringContextHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorityApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Test
    public void testSpring(){
        ApplicationContext applicationContext = SpringContextHolder.applicationContext;
        AuthorityService bean = applicationContext.getBean(AuthorityService.class);
        System.out.println(bean.getClass());
    }

}
