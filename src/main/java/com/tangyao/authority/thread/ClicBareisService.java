package com.tangyao.authority.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Author: weitao.liu
 * @Date: 2019/1/12 14:35
 * @Description:
 */
public class ClicBareisService {

    private CyclicBarrier cyclicBarrier;

    public ClicBareisService(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    public void get() throws BrokenBarrierException, InterruptedException {
        System.out.println("cyclicBarrier。。。。。"+Thread.currentThread().getName());
        Thread.sleep(2000);
        cyclicBarrier.await();
        System.out.println("==============");
        cyclicBarrier.await();
        System.out.println("*******************");

    }
}
