package com.tangyao.authority.thread;

import java.util.concurrent.Semaphore;

public class SimpleService {
    private static String oriuserName;
    private static String oripassword;
    private static Semaphore semaphore=new Semaphore(1);

    public static void multiThreadOperate(String userName,String password) throws InterruptedException {
        semaphore.acquire();
        oriuserName=userName;
        System.out.println("------------------------------"+userName);
        if(userName.equals("a")){
            Thread.sleep(5000);
        }
        System.out.println("********************************");
        oripassword=password;

        System.out.println("userName="+oriuserName+"    password="+oripassword);
    }
}
