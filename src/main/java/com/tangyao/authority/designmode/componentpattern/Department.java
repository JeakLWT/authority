package com.tangyao.authority.designmode.componentpattern;

public class Department extends Organization{

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void print() {
        System.out.println("----------"+getName()+"------------");
    }
}
