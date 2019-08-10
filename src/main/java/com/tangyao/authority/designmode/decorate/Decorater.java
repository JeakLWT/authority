package com.tangyao.authority.designmode.decorate;

public class Decorater extends Drink {
    private Drink drink;

    protected Decorater(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDesc() {
        return super.getDesc()+super.getPrice()+"&&"+drink.getDesc()+drink.getPrice();
    }

    @Override
    public double cost() {

        return super.getPrice()+drink.cost();
    }

}
