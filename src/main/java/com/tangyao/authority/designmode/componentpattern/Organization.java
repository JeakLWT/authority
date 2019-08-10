package com.tangyao.authority.designmode.componentpattern;

public abstract class Organization {
    private String name;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Organization(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    protected void add(Organization organization){
        throw new UnsupportedOperationException();
    }

    protected void remove(Organization organization){
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}
