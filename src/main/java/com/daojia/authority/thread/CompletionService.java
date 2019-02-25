package com.daojia.authority.thread;

import java.util.concurrent.Callable;

public class CompletionService implements Callable<String>{
    private String name;
    private long sleepValue;

    public CompletionService(String name, long sleepValue) {
        this.name = name;
        this.sleepValue = sleepValue;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(sleepValue);
        return "hello"+name+sleepValue;
    }
}
