package com.tangyao.authority.thread;

import java.util.concurrent.Callable;

/**
 * @Author: weitao.liu
 * @Date: 2019/1/12 15:14
 * @Description:
 */
public class CallableFuture implements Callable<String> {
    @Override
    public String  call() throws Exception {
        return "hello";
    }
}
