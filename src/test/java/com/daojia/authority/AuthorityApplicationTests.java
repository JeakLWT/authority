package com.daojia.authority;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.daojia.authority.dto.BannerDto;
import com.daojia.authority.dto.TabDto;
import com.daojia.authority.entity.DJTest;
import com.daojia.authority.service.AuthorityService;
import com.daojia.authority.service.CommonInterface;
import com.daojia.authority.thread.*;
import com.daojia.authority.util.SpringContextHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorityApplicationTests {

    @Autowired
    private AuthorityService authorityService;

    @Test
    public void contextLoads() {
    }


    @Test
    public void testSpring(){
        ApplicationContext applicationContext = SpringContextHolder.applicationContext;
        AuthorityService bean = applicationContext.getBean(AuthorityService.class);
        System.out.println(bean.getClass());
    }


    @Test
    public void testConmmonInterface(){
        List<CommonInterface> commonInterfaces=new ArrayList<>();
        BannerDto bannerDto = new BannerDto();
        TabDto tabDto = new TabDto();
        commonInterfaces.add(bannerDto);
        commonInterfaces.add(tabDto);
        System.out.println(JSONObject.toJSONString(commonInterfaces,SerializerFeature.WriteMapNullValue));

    }

    @Test
    public void testSemph() throws InterruptedException {
        RepeatService repeatService=new RepeatService();
        for (int i=0;i<10;i++){
            new Thread(new SamphoreThread(repeatService)).start();
        }

        Thread.sleep(20000);
    }


    @Test
    public void testClicBaries() throws Exception {
        CyclicBarrier cyclicBarrier=new CyclicBarrier(3);
        ClicBareisService clicBareisService = new ClicBareisService(cyclicBarrier);
        for (int i=0;i<3;i++){
            new Thread(new ClicBariesThread(clicBareisService)).start();
        }

        Thread.sleep(10000);
        FutureTask<String> stringFutureTask = new FutureTask<>(new CallableFuture());
       ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 100, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(5));
       threadPoolExecutor.execute(stringFutureTask);
       System.out.println(stringFutureTask.get(1L,TimeUnit.SECONDS));
    }


    @Test
    public void testService(){
        DJTest djtest = authorityService.getDjtest();
    }
}
