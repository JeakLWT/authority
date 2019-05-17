package com.tangyao.authority.entity;

import java.util.Date;

public class Comment {
    private Long commentId;

    private Long orderId;

    private Long shopId;

    private Long userId;

    private Long dresserId;

    private Long photographerId;

    private Long receptionistId;

    private Long retoucherId;

    private Integer dresserScore;

    private String dresserComment;

    private Integer photographerScore;

    private String photographerComment;

    private Integer receptionistScore;

    private String receptionistComment;

    private Integer retoucherScore;

    private String retoucherComment;

    private Date createTime;

    private Date updateTime;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDresserId() {
        return dresserId;
    }

    public void setDresserId(Long dresserId) {
        this.dresserId = dresserId;
    }

    public Long getPhotographerId() {
        return photographerId;
    }

    public void setPhotographerId(Long photographerId) {
        this.photographerId = photographerId;
    }

    public Long getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(Long receptionistId) {
        this.receptionistId = receptionistId;
    }

    public Long getRetoucherId() {
        return retoucherId;
    }

    public void setRetoucherId(Long retoucherId) {
        this.retoucherId = retoucherId;
    }

    public Integer getDresserScore() {
        return dresserScore;
    }

    public void setDresserScore(Integer dresserScore) {
        this.dresserScore = dresserScore;
    }

    public String getDresserComment() {
        return dresserComment;
    }

    public void setDresserComment(String dresserComment) {
        this.dresserComment = dresserComment == null ? null : dresserComment.trim();
    }

    public Integer getPhotographerScore() {
        return photographerScore;
    }

    public void setPhotographerScore(Integer photographerScore) {
        this.photographerScore = photographerScore;
    }

    public String getPhotographerComment() {
        return photographerComment;
    }

    public void setPhotographerComment(String photographerComment) {
        this.photographerComment = photographerComment == null ? null : photographerComment.trim();
    }

    public Integer getReceptionistScore() {
        return receptionistScore;
    }

    public void setReceptionistScore(Integer receptionistScore) {
        this.receptionistScore = receptionistScore;
    }

    public String getReceptionistComment() {
        return receptionistComment;
    }

    public void setReceptionistComment(String receptionistComment) {
        this.receptionistComment = receptionistComment == null ? null : receptionistComment.trim();
    }

    public Integer getRetoucherScore() {
        return retoucherScore;
    }

    public void setRetoucherScore(Integer retoucherScore) {
        this.retoucherScore = retoucherScore;
    }

    public String getRetoucherComment() {
        return retoucherComment;
    }

    public void setRetoucherComment(String retoucherComment) {
        this.retoucherComment = retoucherComment == null ? null : retoucherComment.trim();
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