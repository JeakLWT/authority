package com.tangyao.authority.designmode.visitorpattern;

public class Client {
    public static void main(String[] args) {
        DataStructure dataStructure=new DataStructure();
        dataStructure.attach(new Man());
        dataStructure.attach(new Woman());
        dataStructure.doAction(new Success());

        System.out.println("========================");

        dataStructure.doAction(new Fail());
    }
}
