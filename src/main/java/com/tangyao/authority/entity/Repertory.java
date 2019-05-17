package com.tangyao.authority.entity;

import java.util.Date;

public class Repertory {
    private Long repertoryId;

    private Long comboId;

    private Integer number;

    private Date createTime;

    private Date updateTime;

    public Long getRepertoryId() {
        return repertoryId;
    }

    public void setRepertoryId(Long repertoryId) {
        this.repertoryId = repertoryId;
    }

    public Long getComboId() {
        return comboId;
    }

    public void setComboId(Long comboId) {
        this.comboId = comboId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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