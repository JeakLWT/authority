package com.tangyao.authority.designmode.visitorpattern;

public class Success extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人通过");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人通过");
    }
}
