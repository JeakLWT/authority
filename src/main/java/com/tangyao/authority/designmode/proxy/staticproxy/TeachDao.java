package com.tangyao.authority.designmode.proxy.staticproxy;

public class TeachDao  implements ITeachDao{
    @Override
    public void teach() {
        System.out.println("target begin working");
    }
}
