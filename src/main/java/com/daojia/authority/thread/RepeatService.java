package com.daojia.authority.thread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: weitao.liu
 * @Date: 2019/1/10 11:00
 * @Description:
 */
public class RepeatService {
   volatile private Semaphore semaphore=new Semaphore(10);
   volatile private ReentrantLock lock=new ReentrantLock();
   private Condition condition=lock.newCondition();

   public void set() throws InterruptedException {
       semaphore.acquire();
       System.out.println(Thread.currentThread().getName()+"+++++++++++++++++++=");
       lock.lock();
       Thread.sleep(2000);
       System.out.println(Thread.currentThread().getName()+"=================");
       semaphore.release();
      // condition.await();
       System.out.println(Thread.currentThread().getName()+"*********************");
       lock.unlock();

   }

}
