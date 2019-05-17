package com.tangyao.authority.dto;

import com.tangyao.authority.service.CommonInterface;

/**
 * @Author: weitao.liu
 * @Date: 2018/12/18 9:11
 * @Description:
 */
public class BannerDto<T> implements CommonInterface {
    private String bannerName;
    private String location;
    private double price;
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
