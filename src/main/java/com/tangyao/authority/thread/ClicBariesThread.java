package com.tangyao.authority.thread;

import java.util.concurrent.BrokenBarrierException;

/**
 * @Author: weitao.liu
 * @Date: 2019/1/12 14:35
 * @Description:
 */
public class ClicBariesThread implements Runnable {
    private ClicBareisService bareisService;

    public ClicBariesThread(ClicBareisService bareisService) {
        this.bareisService = bareisService;
    }

    @Override
    public void run() {
        try {
            bareisService.get();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
