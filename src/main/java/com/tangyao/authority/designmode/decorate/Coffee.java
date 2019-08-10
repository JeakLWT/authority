package com.tangyao.authority.designmode.decorate;

public class Coffee extends Drink{

    @Override
    public double cost() {
        return super.getPrice();
    }
}
