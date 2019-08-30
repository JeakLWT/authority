package com.tangyao.authority;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tangyao.authority.controller.AuthorityController;
import com.tangyao.authority.dto.BannerDto;
import com.tangyao.authority.dto.TabDto;
import com.tangyao.authority.entity.DJTest;
import com.tangyao.authority.service.AuthorityService;
import com.tangyao.authority.service.CommonInterface;
import com.tangyao.authority.thread.*;
import com.tangyao.authority.util.FdfsUtil;
import com.tangyao.authority.util.RedisUtil;
import com.tangyao.authority.util.SpringContextHolder;
import com.tangyao.authority.thread.*;
import com.tangyao.authority.wechat.AesException;
import com.tangyao.authority.wechat.WXBizMsgCrypt;
import org.csource.common.MyException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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




    @Test
    public void testThread() throws InterruptedException {
       new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   SimpleService.multiThreadOperate("a","aa");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }).start();

       new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   SimpleService.multiThreadOperate("b","bb");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }).start();

       Thread.sleep(6000);

    }

    @Test
    public void test000() throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println( formatter.format(1553309633000l)+"-------");
    }

    @Test
    public void test0001(){
        Controller annotation = AnnotationUtils.getAnnotation(AuthorityController.class, Controller.class);
        Class<AuthorityController> authorityControllerClass = AuthorityController.class;
        String value = annotation.value();
        System.out.println("");


    }

    @Test
    public void testFdfs() throws IOException, MyException {
        FdfsUtil.FdfsUploadFile();

    }

    @Test
    public void testRedis(){
       // RedisUtil.setKey("test1","testValue1");
        String test = RedisUtil.getKey("test1");
        System.out.println(test);


    }

    @Test
    public void testAes() throws AesException {

        WXBizMsgCrypt wxBizMsgCrypt = new WXBizMsgCrypt("E0jVoQ6J6jg3fa65AjdsdXlsYaobd4py", "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFG", "skgjhdjhl");

        String encryptMsg = wxBizMsgCrypt.encryptMsg("dfshfglsdjg", "5653434", "hkshkgf");
        System.out.println(encryptMsg);
    }


    /*
    * ## 家政服务数据格式文档
### 一、类目type
| key | 说明 | define |
| --- | --- | --- |
| type | 类型编号 | 11045 |


### 搜索模式：地区(可选) + 家政关键词+预约/预订(可选)
| key | 类型 | 示例 |
| --- | --- | --- |
|keyword|string|保姆|
|city|string|广州市|
|gps_province|string|广东省|
|gps_city|string|广州市|
|gps_district|string|海珠区|


### 地区(可选) + 家政关键词+预约/预订(可选) 返回数据字段定义
小程序后台需要根据自己的服务场景，data里面的数据按照以下定义的数据字段进行返回：
| key | 类型 | 含义 | 说明 |
| --- | --- | --- | --- |
|err_code|integer|返回值|0代表正确，非0代表错误<br> 请按如下规范返回错误码并且前端显示提示语：<br> -1: 无结果 -2: 参数不对 -3: 系统错误|
|err_msg|string|提示信息|针对于返回码的描述信息|
|jump_url|string|跳转路径|pages/result/result|
|img_url|string|图片|https://xxx|
|service_name|string|服务名称|保姆服务|
|type|array|类型|["白班保姆","住家保姆"]|
|skil_list|array|技能|["洗衣服","打扫卫生"]|
|price|string|价格|4000元起|
|license_list|array|证书|["身份证","健康证"]|
    *
    *
    *
    * */








}
