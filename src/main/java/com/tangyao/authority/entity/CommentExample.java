package com.tangyao.authority.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Long value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Long value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Long value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Long value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Long value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Long> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Long> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Long value1, Long value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Long value1, Long value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDresserIdIsNull() {
            addCriterion("dresser_id is null");
            return (Criteria) this;
        }

        public Criteria andDresserIdIsNotNull() {
            addCriterion("dresser_id is not null");
            return (Criteria) this;
        }

        public Criteria andDresserIdEqualTo(Long value) {
            addCriterion("dresser_id =", value, "dresserId");
            return (Criteria) this;
        }

        public Criteria andDresserIdNotEqualTo(Long value) {
            addCriterion("dresser_id <>", value, "dresserId");
            return (Criteria) this;
        }

        public Criteria andDresserIdGreaterThan(Long value) {
            addCriterion("dresser_id >", value, "dresserId");
            return (Criteria) this;
        }

        public Criteria andDresserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dresser_id >=", value, "dresserId");
            return (Criteria) this;
        }

        public Criteria andDresserIdLessThan(Long value) {
            addCriterion("dresser_id <", value, "dresserId");
            return (Criteria) this;
        }

        public Criteria andDresserIdLessThanOrEqualTo(Long value) {
            addCriterion("dresser_id <=", value, "dresserId");
            return (Criteria) this;
        }

        public Criteria andDresserIdIn(List<Long> values) {
            addCriterion("dresser_id in", values, "dresserId");
            return (Criteria) this;
        }

        public Criteria andDresserIdNotIn(List<Long> values) {
            addCriterion("dresser_id not in", values, "dresserId");
            return (Criteria) this;
        }

        public Criteria andDresserIdBetween(Long value1, Long value2) {
            addCriterion("dresser_id between", value1, value2, "dresserId");
            return (Criteria) this;
        }

        public Criteria andDresserIdNotBetween(Long value1, Long value2) {
            addCriterion("dresser_id not between", value1, value2, "dresserId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdIsNull() {
            addCriterion("photographer_id is null");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdIsNotNull() {
            addCriterion("photographer_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdEqualTo(Long value) {
            addCriterion("photographer_id =", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdNotEqualTo(Long value) {
            addCriterion("photographer_id <>", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdGreaterThan(Long value) {
            addCriterion("photographer_id >", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("photographer_id >=", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdLessThan(Long value) {
            addCriterion("photographer_id <", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdLessThanOrEqualTo(Long value) {
            addCriterion("photographer_id <=", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdIn(List<Long> values) {
            addCriterion("photographer_id in", values, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdNotIn(List<Long> values) {
            addCriterion("photographer_id not in", values, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdBetween(Long value1, Long value2) {
            addCriterion("photographer_id between", value1, value2, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdNotBetween(Long value1, Long value2) {
            addCriterion("photographer_id not between", value1, value2, "photographerId");
            return (Criteria) this;
        }

        public Criteria andReceptionistIdIsNull() {
            addCriterion("receptionist_id is null");
            return (Criteria) this;
        }

        public Criteria andReceptionistIdIsNotNull() {
            addCriterion("receptionist_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionistIdEqualTo(Long value) {
            addCriterion("receptionist_id =", value, "receptionistId");
            return (Criteria) this;
        }

        public Criteria andReceptionistIdNotEqualTo(Long value) {
            addCriterion("receptionist_id <>", value, "receptionistId");
            return (Criteria) this;
        }

        public Criteria andReceptionistIdGreaterThan(Long value) {
            addCriterion("receptionist_id >", value, "receptionistId");
            return (Criteria) this;
        }

        public Criteria andReceptionistIdGreaterThanOrEqualTo(Long value) {
            addCriterion("receptionist_id >=", value, "receptionistId");
            return (Criteria) this;
        }

        public Criteria andReceptionistIdLessThan(Long value) {
            addCriterion("receptionist_id <", value, "receptionistId");
            return (Criteria) this;
        }

        public Criteria andReceptionistIdLessThanOrEqualTo(Long value) {
            addCriterion("receptionist_id <=", value, "receptionistId");
            return (Criteria) this;
        }

        public Criteria andReceptionistIdIn(List<Long> values) {
            addCriterion("receptionist_id in", values, "receptionistId");
            return (Criteria) this;
        }

        public Criteria andReceptionistIdNotIn(List<Long> values) {
            addCriterion("receptionist_id not in", values, "receptionistId");
            return (Criteria) this;
        }

        public Criteria andReceptionistIdBetween(Long value1, Long value2) {
            addCriterion("receptionist_id between", value1, value2, "receptionistId");
            return (Criteria) this;
        }

        public Criteria andReceptionistIdNotBetween(Long value1, Long value2) {
            addCriterion("receptionist_id not between", value1, value2, "receptionistId");
            return (Criteria) this;
        }

        public Criteria andRetoucherIdIsNull() {
            addCriterion("retoucher_id is null");
            return (Criteria) this;
        }

        public Criteria andRetoucherIdIsNotNull() {
            addCriterion("retoucher_id is not null");
            return (Criteria) this;
        }

        public Criteria andRetoucherIdEqualTo(Long value) {
            addCriterion("retoucher_id =", value, "retoucherId");
            return (Criteria) this;
        }

        public Criteria andRetoucherIdNotEqualTo(Long value) {
            addCriterion("retoucher_id <>", value, "retoucherId");
            return (Criteria) this;
        }

        public Criteria andRetoucherIdGreaterThan(Long value) {
            addCriterion("retoucher_id >", value, "retoucherId");
            return (Criteria) this;
        }

        public Criteria andRetoucherIdGreaterThanOrEqualTo(Long value) {
            addCriterion("retoucher_id >=", value, "retoucherId");
            return (Criteria) this;
        }

        public Criteria andRetoucherIdLessThan(Long value) {
            addCriterion("retoucher_id <", value, "retoucherId");
            return (Criteria) this;
        }

        public Criteria andRetoucherIdLessThanOrEqualTo(Long value) {
            addCriterion("retoucher_id <=", value, "retoucherId");
            return (Criteria) this;
        }

        public Criteria andRetoucherIdIn(List<Long> values) {
            addCriterion("retoucher_id in", values, "retoucherId");
            return (Criteria) this;
        }

        public Criteria andRetoucherIdNotIn(List<Long> values) {
            addCriterion("retoucher_id not in", values, "retoucherId");
            return (Criteria) this;
        }

        public Criteria andRetoucherIdBetween(Long value1, Long value2) {
            addCriterion("retoucher_id between", value1, value2, "retoucherId");
            return (Criteria) this;
        }

        public Criteria andRetoucherIdNotBetween(Long value1, Long value2) {
            addCriterion("retoucher_id not between", value1, value2, "retoucherId");
            return (Criteria) this;
        }

        public Criteria andDresserScoreIsNull() {
            addCriterion("dresser_score is null");
            return (Criteria) this;
        }

        public Criteria andDresserScoreIsNotNull() {
            addCriterion("dresser_score is not null");
            return (Criteria) this;
        }

        public Criteria andDresserScoreEqualTo(Integer value) {
            addCriterion("dresser_score =", value, "dresserScore");
            return (Criteria) this;
        }

        public Criteria andDresserScoreNotEqualTo(Integer value) {
            addCriterion("dresser_score <>", value, "dresserScore");
            return (Criteria) this;
        }

        public Criteria andDresserScoreGreaterThan(Integer value) {
            addCriterion("dresser_score >", value, "dresserScore");
            return (Criteria) this;
        }

        public Criteria andDresserScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("dresser_score >=", value, "dresserScore");
            return (Criteria) this;
        }

        public Criteria andDresserScoreLessThan(Integer value) {
            addCriterion("dresser_score <", value, "dresserScore");
            return (Criteria) this;
        }

        public Criteria andDresserScoreLessThanOrEqualTo(Integer value) {
            addCriterion("dresser_score <=", value, "dresserScore");
            return (Criteria) this;
        }

        public Criteria andDresserScoreIn(List<Integer> values) {
            addCriterion("dresser_score in", values, "dresserScore");
            return (Criteria) this;
        }

        public Criteria andDresserScoreNotIn(List<Integer> values) {
            addCriterion("dresser_score not in", values, "dresserScore");
            return (Criteria) this;
        }

        public Criteria andDresserScoreBetween(Integer value1, Integer value2) {
            addCriterion("dresser_score between", value1, value2, "dresserScore");
            return (Criteria) this;
        }

        public Criteria andDresserScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("dresser_score not between", value1, value2, "dresserScore");
            return (Criteria) this;
        }

        public Criteria andDresserCommentIsNull() {
            addCriterion("dresser_comment is null");
            return (Criteria) this;
        }

        public Criteria andDresserCommentIsNotNull() {
            addCriterion("dresser_comment is not null");
            return (Criteria) this;
        }

        public Criteria andDresserCommentEqualTo(String value) {
            addCriterion("dresser_comment =", value, "dresserComment");
            return (Criteria) this;
        }

        public Criteria andDresserCommentNotEqualTo(String value) {
            addCriterion("dresser_comment <>", value, "dresserComment");
            return (Criteria) this;
        }

        public Criteria andDresserCommentGreaterThan(String value) {
            addCriterion("dresser_comment >", value, "dresserComment");
            return (Criteria) this;
        }

        public Criteria andDresserCommentGreaterThanOrEqualTo(String value) {
            addCriterion("dresser_comment >=", value, "dresserComment");
            return (Criteria) this;
        }

        public Criteria andDresserCommentLessThan(String value) {
            addCriterion("dresser_comment <", value, "dresserComment");
            return (Criteria) this;
        }

        public Criteria andDresserCommentLessThanOrEqualTo(String value) {
            addCriterion("dresser_comment <=", value, "dresserComment");
            return (Criteria) this;
        }

        public Criteria andDresserCommentLike(String value) {
            addCriterion("dresser_comment like", value, "dresserComment");
            return (Criteria) this;
        }

        public Criteria andDresserCommentNotLike(String value) {
            addCriterion("dresser_comment not like", value, "dresserComment");
            return (Criteria) this;
        }

        public Criteria andDresserCommentIn(List<String> values) {
            addCriterion("dresser_comment in", values, "dresserComment");
            return (Criteria) this;
        }

        public Criteria andDresserCommentNotIn(List<String> values) {
            addCriterion("dresser_comment not in", values, "dresserComment");
            return (Criteria) this;
        }

        public Criteria andDresserCommentBetween(String value1, String value2) {
            addCriterion("dresser_comment between", value1, value2, "dresserComment");
            return (Criteria) this;
        }

        public Criteria andDresserCommentNotBetween(String value1, String value2) {
            addCriterion("dresser_comment not between", value1, value2, "dresserComment");
            return (Criteria) this;
        }

        public Criteria andPhotographerScoreIsNull() {
            addCriterion("photographer_score is null");
            return (Criteria) this;
        }

        public Criteria andPhotographerScoreIsNotNull() {
            addCriterion("photographer_score is not null");
            return (Criteria) this;
        }

        public Criteria andPhotographerScoreEqualTo(Integer value) {
            addCriterion("photographer_score =", value, "photographerScore");
            return (Criteria) this;
        }

        public Criteria andPhotographerScoreNotEqualTo(Integer value) {
            addCriterion("photographer_score <>", value, "photographerScore");
            return (Criteria) this;
        }

        public Criteria andPhotographerScoreGreaterThan(Integer value) {
            addCriterion("photographer_score >", value, "photographerScore");
            return (Criteria) this;
        }

        public Criteria andPhotographerScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("photographer_score >=", value, "photographerScore");
            return (Criteria) this;
        }

        public Criteria andPhotographerScoreLessThan(Integer value) {
            addCriterion("photographer_score <", value, "photographerScore");
            return (Criteria) this;
        }

        public Criteria andPhotographerScoreLessThanOrEqualTo(Integer value) {
            addCriterion("photographer_score <=", value, "photographerScore");
            return (Criteria) this;
        }

        public Criteria andPhotographerScoreIn(List<Integer> values) {
            addCriterion("photographer_score in", values, "photographerScore");
            return (Criteria) this;
        }

        public Criteria andPhotographerScoreNotIn(List<Integer> values) {
            addCriterion("photographer_score not in", values, "photographerScore");
            return (Criteria) this;
        }

        public Criteria andPhotographerScoreBetween(Integer value1, Integer value2) {
            addCriterion("photographer_score between", value1, value2, "photographerScore");
            return (Criteria) this;
        }

        public Criteria andPhotographerScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("photographer_score not between", value1, value2, "photographerScore");
            return (Criteria) this;
        }

        public Criteria andPhotographerCommentIsNull() {
            addCriterion("photographer_comment is null");
            return (Criteria) this;
        }

        public Criteria andPhotographerCommentIsNotNull() {
            addCriterion("photographer_comment is not null");
            return (Criteria) this;
        }

        public Criteria andPhotographerCommentEqualTo(String value) {
            addCriterion("photographer_comment =", value, "photographerComment");
            return (Criteria) this;
        }

        public Criteria andPhotographerCommentNotEqualTo(String value) {
            addCriterion("photographer_comment <>", value, "photographerComment");
            return (Criteria) this;
        }

        public Criteria andPhotographerCommentGreaterThan(String value) {
            addCriterion("photographer_comment >", value, "photographerComment");
            return (Criteria) this;
        }

        public Criteria andPhotographerCommentGreaterThanOrEqualTo(String value) {
            addCriterion("photographer_comment >=", value, "photographerComment");
            return (Criteria) this;
        }

        public Criteria andPhotographerCommentLessThan(String value) {
            addCriterion("photographer_comment <", value, "photographerComment");
            return (Criteria) this;
        }

        public Criteria andPhotographerCommentLessThanOrEqualTo(String value) {
            addCriterion("photographer_comment <=", value, "photographerComment");
            return (Criteria) this;
        }

        public Criteria andPhotographerCommentLike(String value) {
            addCriterion("photographer_comment like", value, "photographerComment");
            return (Criteria) this;
        }

        public Criteria andPhotographerCommentNotLike(String value) {
            addCriterion("photographer_comment not like", value, "photographerComment");
            return (Criteria) this;
        }

        public Criteria andPhotographerCommentIn(List<String> values) {
            addCriterion("photographer_comment in", values, "photographerComment");
            return (Criteria) this;
        }

        public Criteria andPhotographerCommentNotIn(List<String> values) {
            addCriterion("photographer_comment not in", values, "photographerComment");
            return (Criteria) this;
        }

        public Criteria andPhotographerCommentBetween(String value1, String value2) {
            addCriterion("photographer_comment between", value1, value2, "photographerComment");
            return (Criteria) this;
        }

        public Criteria andPhotographerCommentNotBetween(String value1, String value2) {
            addCriterion("photographer_comment not between", value1, value2, "photographerComment");
            return (Criteria) this;
        }

        public Criteria andReceptionistScoreIsNull() {
            addCriterion("receptionist_score is null");
            return (Criteria) this;
        }

        public Criteria andReceptionistScoreIsNotNull() {
            addCriterion("receptionist_score is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionistScoreEqualTo(Integer value) {
            addCriterion("receptionist_score =", value, "receptionistScore");
            return (Criteria) this;
        }

        public Criteria andReceptionistScoreNotEqualTo(Integer value) {
            addCriterion("receptionist_score <>", value, "receptionistScore");
            return (Criteria) this;
        }

        public Criteria andReceptionistScoreGreaterThan(Integer value) {
            addCriterion("receptionist_score >", value, "receptionistScore");
            return (Criteria) this;
        }

        public Criteria andReceptionistScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("receptionist_score >=", value, "receptionistScore");
            return (Criteria) this;
        }

        public Criteria andReceptionistScoreLessThan(Integer value) {
            addCriterion("receptionist_score <", value, "receptionistScore");
            return (Criteria) this;
        }

        public Criteria andReceptionistScoreLessThanOrEqualTo(Integer value) {
            addCriterion("receptionist_score <=", value, "receptionistScore");
            return (Criteria) this;
        }

        public Criteria andReceptionistScoreIn(List<Integer> values) {
            addCriterion("receptionist_score in", values, "receptionistScore");
            return (Criteria) this;
        }

        public Criteria andReceptionistScoreNotIn(List<Integer> values) {
            addCriterion("receptionist_score not in", values, "receptionistScore");
            return (Criteria) this;
        }

        public Criteria andReceptionistScoreBetween(Integer value1, Integer value2) {
            addCriterion("receptionist_score between", value1, value2, "receptionistScore");
            return (Criteria) this;
        }

        public Criteria andReceptionistScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("receptionist_score not between", value1, value2, "receptionistScore");
            return (Criteria) this;
        }

        public Criteria andReceptionistCommentIsNull() {
            addCriterion("receptionist_comment is null");
            return (Criteria) this;
        }

        public Criteria andReceptionistCommentIsNotNull() {
            addCriterion("receptionist_comment is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionistCommentEqualTo(String value) {
            addCriterion("receptionist_comment =", value, "receptionistComment");
            return (Criteria) this;
        }

        public Criteria andReceptionistCommentNotEqualTo(String value) {
            addCriterion("receptionist_comment <>", value, "receptionistComment");
            return (Criteria) this;
        }

        public Criteria andReceptionistCommentGreaterThan(String value) {
            addCriterion("receptionist_comment >", value, "receptionistComment");
            return (Criteria) this;
        }

        public Criteria andReceptionistCommentGreaterThanOrEqualTo(String value) {
            addCriterion("receptionist_comment >=", value, "receptionistComment");
            return (Criteria) this;
        }

        public Criteria andReceptionistCommentLessThan(String value) {
            addCriterion("receptionist_comment <", value, "receptionistComment");
            return (Criteria) this;
        }

        public Criteria andReceptionistCommentLessThanOrEqualTo(String value) {
            addCriterion("receptionist_comment <=", value, "receptionistComment");
            return (Criteria) this;
        }

        public Criteria andReceptionistCommentLike(String value) {
            addCriterion("receptionist_comment like", value, "receptionistComment");
            return (Criteria) this;
        }

        public Criteria andReceptionistCommentNotLike(String value) {
            addCriterion("receptionist_comment not like", value, "receptionistComment");
            return (Criteria) this;
        }

        public Criteria andReceptionistCommentIn(List<String> values) {
            addCriterion("receptionist_comment in", values, "receptionistComment");
            return (Criteria) this;
        }

        public Criteria andReceptionistCommentNotIn(List<String> values) {
            addCriterion("receptionist_comment not in", values, "receptionistComment");
            return (Criteria) this;
        }

        public Criteria andReceptionistCommentBetween(String value1, String value2) {
            addCriterion("receptionist_comment between", value1, value2, "receptionistComment");
            return (Criteria) this;
        }

        public Criteria andReceptionistCommentNotBetween(String value1, String value2) {
            addCriterion("receptionist_comment not between", value1, value2, "receptionistComment");
            return (Criteria) this;
        }

        public Criteria andRetoucherScoreIsNull() {
            addCriterion("retoucher_score is null");
            return (Criteria) this;
        }

        public Criteria andRetoucherScoreIsNotNull() {
            addCriterion("retoucher_score is not null");
            return (Criteria) this;
        }

        public Criteria andRetoucherScoreEqualTo(Integer value) {
            addCriterion("retoucher_score =", value, "retoucherScore");
            return (Criteria) this;
        }

        public Criteria andRetoucherScoreNotEqualTo(Integer value) {
            addCriterion("retoucher_score <>", value, "retoucherScore");
            return (Criteria) this;
        }

        public Criteria andRetoucherScoreGreaterThan(Integer value) {
            addCriterion("retoucher_score >", value, "retoucherScore");
            return (Criteria) this;
        }

        public Criteria andRetoucherScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("retoucher_score >=", value, "retoucherScore");
            return (Criteria) this;
        }

        public Criteria andRetoucherScoreLessThan(Integer value) {
            addCriterion("retoucher_score <", value, "retoucherScore");
            return (Criteria) this;
        }

        public Criteria andRetoucherScoreLessThanOrEqualTo(Integer value) {
            addCriterion("retoucher_score <=", value, "retoucherScore");
            return (Criteria) this;
        }

        public Criteria andRetoucherScoreIn(List<Integer> values) {
            addCriterion("retoucher_score in", values, "retoucherScore");
            return (Criteria) this;
        }

        public Criteria andRetoucherScoreNotIn(List<Integer> values) {
            addCriterion("retoucher_score not in", values, "retoucherScore");
            return (Criteria) this;
        }

        public Criteria andRetoucherScoreBetween(Integer value1, Integer value2) {
            addCriterion("retoucher_score between", value1, value2, "retoucherScore");
            return (Criteria) this;
        }

        public Criteria andRetoucherScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("retoucher_score not between", value1, value2, "retoucherScore");
            return (Criteria) this;
        }

        public Criteria andRetoucherCommentIsNull() {
            addCriterion("retoucher_comment is null");
            return (Criteria) this;
        }

        public Criteria andRetoucherCommentIsNotNull() {
            addCriterion("retoucher_comment is not null");
            return (Criteria) this;
        }

        public Criteria andRetoucherCommentEqualTo(String value) {
            addCriterion("retoucher_comment =", value, "retoucherComment");
            return (Criteria) this;
        }

        public Criteria andRetoucherCommentNotEqualTo(String value) {
            addCriterion("retoucher_comment <>", value, "retoucherComment");
            return (Criteria) this;
        }

        public Criteria andRetoucherCommentGreaterThan(String value) {
            addCriterion("retoucher_comment >", value, "retoucherComment");
            return (Criteria) this;
        }

        public Criteria andRetoucherCommentGreaterThanOrEqualTo(String value) {
            addCriterion("retoucher_comment >=", value, "retoucherComment");
            return (Criteria) this;
        }

        public Criteria andRetoucherCommentLessThan(String value) {
            addCriterion("retoucher_comment <", value, "retoucherComment");
            return (Criteria) this;
        }

        public Criteria andRetoucherCommentLessThanOrEqualTo(String value) {
            addCriterion("retoucher_comment <=", value, "retoucherComment");
            return (Criteria) this;
        }

        public Criteria andRetoucherCommentLike(String value) {
            addCriterion("retoucher_comment like", value, "retoucherComment");
            return (Criteria) this;
        }

        public Criteria andRetoucherCommentNotLike(String value) {
            addCriterion("retoucher_comment not like", value, "retoucherComment");
            return (Criteria) this;
        }

        public Criteria andRetoucherCommentIn(List<String> values) {
            addCriterion("retoucher_comment in", values, "retoucherComment");
            return (Criteria) this;
        }

        public Criteria andRetoucherCommentNotIn(List<String> values) {
            addCriterion("retoucher_comment not in", values, "retoucherComment");
            return (Criteria) this;
        }

        public Criteria andRetoucherCommentBetween(String value1, String value2) {
            addCriterion("retoucher_comment between", value1, value2, "retoucherComment");
            return (Criteria) this;
        }

        public Criteria andRetoucherCommentNotBetween(String value1, String value2) {
            addCriterion("retoucher_comment not between", value1, value2, "retoucherComment");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}