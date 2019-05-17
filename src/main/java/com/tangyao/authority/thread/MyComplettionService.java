package com.tangyao.authority.thread;

import com.tangyao.authority.util.MyThreadPool;

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
        CompletionServiceThread completionService1 = new CompletionServiceThread("name1",1000);
        CompletionServiceThread completionService2 = new CompletionServiceThread("name2",3000);
        CompletionServiceThread completionService3 = new CompletionServiceThread("name3",2000);
        CompletionExceptionThread completionExceptionThread=new CompletionExceptionThread("name4",500);
        callableList.add(completionService1);
        callableList.add(completionService2);
        callableList.add(completionService3);
        callableList.add(completionExceptionThread);

        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(threadPoolExecutor);
        for (int i = 0; i < callableList.size(); i++) {
            try {
                executorCompletionService.submit((Callable) callableList.get(i));
            }catch (Exception e){
                System.out.println("执行线程异常处理");
            }

        }
        for (int i = 0; i <3 ; i++) {
            try {
                System.out.println("第"+i+"个打印"+executorCompletionService.take().get());
            }catch (Exception e){
                System.out.println("获取结果异常处理");
            }

        }


    }
}
