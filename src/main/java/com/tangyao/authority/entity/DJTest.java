package com.tangyao.authority.entity;

public class DJTest {
    private String wokerId;

    private String wokerName;

    private Integer wokerAge;

    public String getWokerId() {
        return wokerId;
    }

    public void setWokerId(String wokerId) {
        this.wokerId = wokerId == null ? null : wokerId.trim();
    }

    public String getWokerName() {
        return wokerName;
    }

    public void setWokerName(String wokerName) {
        this.wokerName = wokerName == null ? null : wokerName.trim();
    }

    public Integer getWokerAge() {
        return wokerAge;
    }

    public void setWokerAge(Integer wokerAge) {
        this.wokerAge = wokerAge;
    }
}