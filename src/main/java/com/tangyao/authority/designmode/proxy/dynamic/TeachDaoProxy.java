package com.tangyao.authority.designmode.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TeachDaoProxy {
    private ITeachDao target;

    public TeachDaoProxy(ITeachDao iTeachDao) {
        this.target = iTeachDao;
    }

    public Object getProxyInstance(){
      return  Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("dynamic start ~ ~");
                Object result = method.invoke(target, args);
                System.out.println("dynamic end~ ~");
                return result;
            }
        });
    }
}
