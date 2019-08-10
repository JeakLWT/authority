package com.tangyao.authority.designmode.visitorpattern;

public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
