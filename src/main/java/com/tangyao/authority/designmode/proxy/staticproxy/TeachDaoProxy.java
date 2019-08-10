package com.tangyao.authority.designmode.proxy.staticproxy;

public class TeachDaoProxy {
    private ITeachDao iTeachDao;

    public TeachDaoProxy(ITeachDao iTeachDao) {
        this.iTeachDao = iTeachDao;
    }
    public void teach() {
        System.out.println("before target working");
        iTeachDao.teach();
        System.out.println("after target working");
    }
}
