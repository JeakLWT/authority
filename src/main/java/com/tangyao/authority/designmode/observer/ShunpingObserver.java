package com.tangyao.authority.designmode.observer;

public class ShunpingObserver implements Observer {
    @Override
    public void update(float temperature, float humity, float press) {
        System.out.println("ShunpingObserver temperature="+temperature);
        System.out.println("ShunpingObserver humity="+humity);
        System.out.println("ShunpingObserver press="+press);
    }
}
