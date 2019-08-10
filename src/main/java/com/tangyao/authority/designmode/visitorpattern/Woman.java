package com.tangyao.authority.designmode.visitorpattern;

public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
