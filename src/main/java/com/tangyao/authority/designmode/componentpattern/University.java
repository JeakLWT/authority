package com.tangyao.authority.designmode.componentpattern;


import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class University extends Organization {

    List<Organization> list = new CopyOnWriteArrayList();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(Organization organization) {
        list.add(organization);
    }

    @Override
    protected void remove(Organization organization) {
        list.remove(organization);
    }

    @Override
    public void print() {
        System.out.println("----------" + getName() + "---------------");
        if (!CollectionUtils.isEmpty(list)) {
            for (Organization organization : list) {
                organization.print();
            }

        }
    }


}
