package com.tangyao.authority.designmode.proxy.dynamic;

public class Client {
    public static void main(String[] args) {
        TeachDaoProxy teachDaoProxy=new TeachDaoProxy(new TeachDao());
        ITeachDao proxyInstance = (ITeachDao) teachDaoProxy.getProxyInstance();
        proxyInstance.teach();

    }
}
