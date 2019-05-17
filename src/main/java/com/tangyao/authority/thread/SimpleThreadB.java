package com.tangyao.authority.thread;


public class SimpleThreadB implements Runnable {
    private SimpleService simpleThread;

    public SimpleThreadB(SimpleService simpleThread) {
        this.simpleThread = simpleThread;
    }

    @Override
    public void run() {
        try {
            simpleThread.multiThreadOperate("b","bb");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

