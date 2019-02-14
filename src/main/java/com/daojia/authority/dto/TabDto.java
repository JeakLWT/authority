package com.daojia.authority.dto;

import com.daojia.authority.service.CommonInterface;

/**
 * @Author: weitao.liu
 * @Date: 2018/12/18 9:14
 * @Description:
 */
public class TabDto<T> implements CommonInterface {
    private String type;
    private String tabName;
    private String location;
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
