package com.tangyao.authority.designmode.observer;

public class TangxianObserver implements Observer{
    @Override
    public void update(float temperature, float humity, float press) {
        System.out.println("TangxianObserver temperature="+temperature);
        System.out.println("TangxianObserver humity="+humity);
        System.out.println("TangxianObserver press="+press);

    }
}
