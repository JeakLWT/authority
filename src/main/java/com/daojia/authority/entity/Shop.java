package com.daojia.authority.entity;

import java.util.Date;

public class Shop {
    private Long shopId;

    private String shopName;

    private String shopCity;

    private Byte shopStatus;

    private String shopAddress;

    private Date createTime;

    private Date updateTime;

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopCity() {
        return shopCity;
    }

    public void setShopCity(String shopCity) {
        this.shopCity = shopCity == null ? null : shopCity.trim();
    }

    public Byte getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(Byte shopStatus) {
        this.shopStatus = shopStatus;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}