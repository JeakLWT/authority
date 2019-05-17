package com.tangyao.authority.thread;

public class SimpleThreadA implements Runnable {
    private SimpleService simpleThread;

    public SimpleThreadA(SimpleService simpleThread) {
        this.simpleThread = simpleThread;
    }

    @Override
    public void run() {
        try {
            simpleThread.multiThreadOperate("a","aa");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
