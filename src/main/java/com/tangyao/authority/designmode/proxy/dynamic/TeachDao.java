package com.tangyao.authority.designmode.proxy.dynamic;

public class TeachDao implements ITeachDao{
    @Override
    public void teach() {
        System.out.println("我是动态代理～～");
    }
}
