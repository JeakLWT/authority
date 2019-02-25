package com.daojia.authority.thread;

import com.daojia.authority.util.MyThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ThreadPoolExecutor;

public class MyComplettionService {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadPoolExecutor threadPoolExecutor = MyThreadPool.instanceThreadPool();
        List callableList=new ArrayList<Callable>();
        CompletionService completionService1 = new CompletionService("name1",1000);
        CompletionService completionService2 = new CompletionService("name2",3000);
        CompletionService completionService3 = new CompletionService("name3",2000);
        callableList.add(completionService1);
        callableList.add(completionService2);
        callableList.add(completionService3);

        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(threadPoolExecutor);
        for (int i = 0; i < callableList.size(); i++) {
            executorCompletionService.submit((Callable) callableList.get(i));
        }
        for (int i = 0; i <3 ; i++) {
            System.out.println("第"+i+"个打印"+executorCompletionService.take().get());
        }


    }
}
