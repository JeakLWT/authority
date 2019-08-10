package com.tangyao.authority.designmode.bridgepattern;

public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void call(){
        this.brand.call();
    }

}
