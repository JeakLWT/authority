package com.tangyao.authority.thread;

/**
 * @Author: weitao.liu
 * @Date: 2019/1/10 11:13
 * @Description:
 */
public class SamphoreThread implements Runnable{
    private RepeatService repeatService;

    public SamphoreThread(RepeatService repeatService) {
        this.repeatService = repeatService;
    }

    @Override
    public void run() {
        try {
            repeatService.set();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
