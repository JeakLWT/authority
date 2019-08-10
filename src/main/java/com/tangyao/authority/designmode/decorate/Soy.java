package com.tangyao.authority.designmode.decorate;

public class Soy extends Decorater{
    protected Soy(Drink drink) {
        super(drink);
        setDesc("豆浆");
        setPrice(1);
    }
}
