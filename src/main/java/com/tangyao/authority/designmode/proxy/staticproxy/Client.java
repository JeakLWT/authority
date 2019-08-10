package com.tangyao.authority.designmode.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        TeachDaoProxy teachDaoProxy=new TeachDaoProxy(new TeachDao());
        teachDaoProxy.teach();
    }
}
