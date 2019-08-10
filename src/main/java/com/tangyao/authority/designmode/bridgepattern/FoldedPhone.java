package com.tangyao.authority.designmode.bridgepattern;

public class FoldedPhone extends Phone{


    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void call(){
        super.call();
        System.out.println("滑盖手机");

    }

}
