package com.tangyao.authority.thread;

import java.util.concurrent.Callable;

public class CompletionExceptionThread implements Callable {
    private String name;
    private long sleepValue;

    public CompletionExceptionThread(String name, long sleepValue) {
        this.name = name;
        this.sleepValue = sleepValue;
    }

    @Override
    public Object call() throws Exception {
        int i=1/0;
        return null;
    }
}
