package com.daojia.authority.util;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: weitao.liu
 * @Date: 2019/1/3 11:05
 * @Description:
 */
public class MyThreadPool {
    private static ThreadPoolExecutor threadPoolExecutor;

    private MyThreadPool(ThreadPoolExecutor threadPoolExecutor) {
        this.threadPoolExecutor = threadPoolExecutor;
    }

    public static ThreadPoolExecutor instanceThreadPool(){
        if(threadPoolExecutor==null){
            System.out.println("instanceThreadPool start.............................");
            synchronized (ThreadPoolExecutor.class){
                if(threadPoolExecutor==null){
                    threadPoolExecutor=new ThreadPoolExecutor(10,20,60,TimeUnit.SECONDS,new LinkedBlockingDeque<>());
                }else {
                    return threadPoolExecutor;
                }
            }
        }
        return threadPoolExecutor;
    }

}
