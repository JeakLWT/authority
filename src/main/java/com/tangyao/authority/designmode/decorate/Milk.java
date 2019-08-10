package com.tangyao.authority.designmode.decorate;

public class Milk extends Decorater{
    protected Milk(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(2);
    }
}
