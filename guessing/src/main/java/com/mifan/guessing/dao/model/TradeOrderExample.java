package com.mifan.guessing.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradeOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TradeOrderExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdIsNull() {
            addCriterion("out_order_id is null");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdIsNotNull() {
            addCriterion("out_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdEqualTo(String value) {
            addCriterion("out_order_id =", value, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdNotEqualTo(String value) {
            addCriterion("out_order_id <>", value, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdGreaterThan(String value) {
            addCriterion("out_order_id >", value, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("out_order_id >=", value, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdLessThan(String value) {
            addCriterion("out_order_id <", value, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdLessThanOrEqualTo(String value) {
            addCriterion("out_order_id <=", value, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdLike(String value) {
            addCriterion("out_order_id like", value, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdNotLike(String value) {
            addCriterion("out_order_id not like", value, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdIn(List<String> values) {
            addCriterion("out_order_id in", values, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdNotIn(List<String> values) {
            addCriterion("out_order_id not in", values, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdBetween(String value1, String value2) {
            addCriterion("out_order_id between", value1, value2, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdNotBetween(String value1, String value2) {
            addCriterion("out_order_id not between", value1, value2, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andVendorPlayerIdIsNull() {
            addCriterion("vendor_player_id is null");
            return (Criteria) this;
        }

        public Criteria andVendorPlayerIdIsNotNull() {
            addCriterion("vendor_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andVendorPlayerIdEqualTo(String value) {
            addCriterion("vendor_player_id =", value, "vendorPlayerId");
            return (Criteria) this;
        }

        public Criteria andVendorPlayerIdNotEqualTo(String value) {
            addCriterion("vendor_player_id <>", value, "vendorPlayerId");
            return (Criteria) this;
        }

        public Criteria andVendorPlayerIdGreaterThan(String value) {
            addCriterion("vendor_player_id >", value, "vendorPlayerId");
            return (Criteria) this;
        }

        public Criteria andVendorPlayerIdGreaterThanOrEqualTo(String value) {
            addCriterion("vendor_player_id >=", value, "vendorPlayerId");
            return (Criteria) this;
        }

        public Criteria andVendorPlayerIdLessThan(String value) {
            addCriterion("vendor_player_id <", value, "vendorPlayerId");
            return (Criteria) this;
        }

        public Criteria andVendorPlayerIdLessThanOrEqualTo(String value) {
            addCriterion("vendor_player_id <=", value, "vendorPlayerId");
            return (Criteria) this;
        }

        public Criteria andVendorPlayerIdLike(String value) {
            addCriterion("vendor_player_id like", value, "vendorPlayerId");
            return (Criteria) this;
        }

        public Criteria andVendorPlayerIdNotLike(String value) {
            addCriterion("vendor_player_id not like", value, "vendorPlayerId");
            return (Criteria) this;
        }

        public Criteria andVendorPlayerIdIn(List<String> values) {
            addCriterion("vendor_player_id in", values, "vendorPlayerId");
            return (Criteria) this;
        }

        public Criteria andVendorPlayerIdNotIn(List<String> values) {
            addCriterion("vendor_player_id not in", values, "vendorPlayerId");
            return (Criteria) this;
        }

        public Criteria andVendorPlayerIdBetween(String value1, String value2) {
            addCriterion("vendor_player_id between", value1, value2, "vendorPlayerId");
            return (Criteria) this;
        }

        public Criteria andVendorPlayerIdNotBetween(String value1, String value2) {
            addCriterion("vendor_player_id not between", value1, value2, "vendorPlayerId");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNull() {
            addCriterion("event_id is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("event_id is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(String value) {
            addCriterion("event_id =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(String value) {
            addCriterion("event_id <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(String value) {
            addCriterion("event_id >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(String value) {
            addCriterion("event_id >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(String value) {
            addCriterion("event_id <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(String value) {
            addCriterion("event_id <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLike(String value) {
            addCriterion("event_id like", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotLike(String value) {
            addCriterion("event_id not like", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<String> values) {
            addCriterion("event_id in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<String> values) {
            addCriterion("event_id not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(String value1, String value2) {
            addCriterion("event_id between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(String value1, String value2) {
            addCriterion("event_id not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andMarketIdIsNull() {
            addCriterion("market_id is null");
            return (Criteria) this;
        }

        public Criteria andMarketIdIsNotNull() {
            addCriterion("market_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarketIdEqualTo(String value) {
            addCriterion("market_id =", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotEqualTo(String value) {
            addCriterion("market_id <>", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdGreaterThan(String value) {
            addCriterion("market_id >", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdGreaterThanOrEqualTo(String value) {
            addCriterion("market_id >=", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdLessThan(String value) {
            addCriterion("market_id <", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdLessThanOrEqualTo(String value) {
            addCriterion("market_id <=", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdLike(String value) {
            addCriterion("market_id like", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotLike(String value) {
            addCriterion("market_id not like", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdIn(List<String> values) {
            addCriterion("market_id in", values, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotIn(List<String> values) {
            addCriterion("market_id not in", values, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdBetween(String value1, String value2) {
            addCriterion("market_id between", value1, value2, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotBetween(String value1, String value2) {
            addCriterion("market_id not between", value1, value2, "marketId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdIsNull() {
            addCriterion("selection_id is null");
            return (Criteria) this;
        }

        public Criteria andSelectionIdIsNotNull() {
            addCriterion("selection_id is not null");
            return (Criteria) this;
        }

        public Criteria andSelectionIdEqualTo(String value) {
            addCriterion("selection_id =", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdNotEqualTo(String value) {
            addCriterion("selection_id <>", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdGreaterThan(String value) {
            addCriterion("selection_id >", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdGreaterThanOrEqualTo(String value) {
            addCriterion("selection_id >=", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdLessThan(String value) {
            addCriterion("selection_id <", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdLessThanOrEqualTo(String value) {
            addCriterion("selection_id <=", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdLike(String value) {
            addCriterion("selection_id like", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdNotLike(String value) {
            addCriterion("selection_id not like", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdIn(List<String> values) {
            addCriterion("selection_id in", values, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdNotIn(List<String> values) {
            addCriterion("selection_id not in", values, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdBetween(String value1, String value2) {
            addCriterion("selection_id between", value1, value2, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdNotBetween(String value1, String value2) {
            addCriterion("selection_id not between", value1, value2, "selectionId");
            return (Criteria) this;
        }

        public Criteria andRequestAmountIsNull() {
            addCriterion("request_amount is null");
            return (Criteria) this;
        }

        public Criteria andRequestAmountIsNotNull() {
            addCriterion("request_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRequestAmountEqualTo(BigDecimal value) {
            addCriterion("request_amount =", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountNotEqualTo(BigDecimal value) {
            addCriterion("request_amount <>", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountGreaterThan(BigDecimal value) {
            addCriterion("request_amount >", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("request_amount >=", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountLessThan(BigDecimal value) {
            addCriterion("request_amount <", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("request_amount <=", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountIn(List<BigDecimal> values) {
            addCriterion("request_amount in", values, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountNotIn(List<BigDecimal> values) {
            addCriterion("request_amount not in", values, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("request_amount between", value1, value2, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("request_amount not between", value1, value2, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestPriceIsNull() {
            addCriterion("request_price is null");
            return (Criteria) this;
        }

        public Criteria andRequestPriceIsNotNull() {
            addCriterion("request_price is not null");
            return (Criteria) this;
        }

        public Criteria andRequestPriceEqualTo(BigDecimal value) {
            addCriterion("request_price =", value, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceNotEqualTo(BigDecimal value) {
            addCriterion("request_price <>", value, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceGreaterThan(BigDecimal value) {
            addCriterion("request_price >", value, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("request_price >=", value, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceLessThan(BigDecimal value) {
            addCriterion("request_price <", value, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("request_price <=", value, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceIn(List<BigDecimal> values) {
            addCriterion("request_price in", values, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceNotIn(List<BigDecimal> values) {
            addCriterion("request_price not in", values, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("request_price between", value1, value2, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("request_price not between", value1, value2, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andFillAmountIsNull() {
            addCriterion("fill_amount is null");
            return (Criteria) this;
        }

        public Criteria andFillAmountIsNotNull() {
            addCriterion("fill_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFillAmountEqualTo(BigDecimal value) {
            addCriterion("fill_amount =", value, "fillAmount");
            return (Criteria) this;
        }

        public Criteria andFillAmountNotEqualTo(BigDecimal value) {
            addCriterion("fill_amount <>", value, "fillAmount");
            return (Criteria) this;
        }

        public Criteria andFillAmountGreaterThan(BigDecimal value) {
            addCriterion("fill_amount >", value, "fillAmount");
            return (Criteria) this;
        }

        public Criteria andFillAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fill_amount >=", value, "fillAmount");
            return (Criteria) this;
        }

        public Criteria andFillAmountLessThan(BigDecimal value) {
            addCriterion("fill_amount <", value, "fillAmount");
            return (Criteria) this;
        }

        public Criteria andFillAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fill_amount <=", value, "fillAmount");
            return (Criteria) this;
        }

        public Criteria andFillAmountIn(List<BigDecimal> values) {
            addCriterion("fill_amount in", values, "fillAmount");
            return (Criteria) this;
        }

        public Criteria andFillAmountNotIn(List<BigDecimal> values) {
            addCriterion("fill_amount not in", values, "fillAmount");
            return (Criteria) this;
        }

        public Criteria andFillAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fill_amount between", value1, value2, "fillAmount");
            return (Criteria) this;
        }

        public Criteria andFillAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fill_amount not between", value1, value2, "fillAmount");
            return (Criteria) this;
        }

        public Criteria andFillPriceIsNull() {
            addCriterion("fill_price is null");
            return (Criteria) this;
        }

        public Criteria andFillPriceIsNotNull() {
            addCriterion("fill_price is not null");
            return (Criteria) this;
        }

        public Criteria andFillPriceEqualTo(BigDecimal value) {
            addCriterion("fill_price =", value, "fillPrice");
            return (Criteria) this;
        }

        public Criteria andFillPriceNotEqualTo(BigDecimal value) {
            addCriterion("fill_price <>", value, "fillPrice");
            return (Criteria) this;
        }

        public Criteria andFillPriceGreaterThan(BigDecimal value) {
            addCriterion("fill_price >", value, "fillPrice");
            return (Criteria) this;
        }

        public Criteria andFillPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fill_price >=", value, "fillPrice");
            return (Criteria) this;
        }

        public Criteria andFillPriceLessThan(BigDecimal value) {
            addCriterion("fill_price <", value, "fillPrice");
            return (Criteria) this;
        }

        public Criteria andFillPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fill_price <=", value, "fillPrice");
            return (Criteria) this;
        }

        public Criteria andFillPriceIn(List<BigDecimal> values) {
            addCriterion("fill_price in", values, "fillPrice");
            return (Criteria) this;
        }

        public Criteria andFillPriceNotIn(List<BigDecimal> values) {
            addCriterion("fill_price not in", values, "fillPrice");
            return (Criteria) this;
        }

        public Criteria andFillPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fill_price between", value1, value2, "fillPrice");
            return (Criteria) this;
        }

        public Criteria andFillPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fill_price not between", value1, value2, "fillPrice");
            return (Criteria) this;
        }

        public Criteria andPlacedResultIsNull() {
            addCriterion("placed_result is null");
            return (Criteria) this;
        }

        public Criteria andPlacedResultIsNotNull() {
            addCriterion("placed_result is not null");
            return (Criteria) this;
        }

        public Criteria andPlacedResultEqualTo(String value) {
            addCriterion("placed_result =", value, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultNotEqualTo(String value) {
            addCriterion("placed_result <>", value, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultGreaterThan(String value) {
            addCriterion("placed_result >", value, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultGreaterThanOrEqualTo(String value) {
            addCriterion("placed_result >=", value, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultLessThan(String value) {
            addCriterion("placed_result <", value, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultLessThanOrEqualTo(String value) {
            addCriterion("placed_result <=", value, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultLike(String value) {
            addCriterion("placed_result like", value, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultNotLike(String value) {
            addCriterion("placed_result not like", value, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultIn(List<String> values) {
            addCriterion("placed_result in", values, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultNotIn(List<String> values) {
            addCriterion("placed_result not in", values, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultBetween(String value1, String value2) {
            addCriterion("placed_result between", value1, value2, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultNotBetween(String value1, String value2) {
            addCriterion("placed_result not between", value1, value2, "placedResult");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeIsNull() {
            addCriterion("submitted_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeIsNotNull() {
            addCriterion("submitted_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeEqualTo(Date value) {
            addCriterion("submitted_time =", value, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeNotEqualTo(Date value) {
            addCriterion("submitted_time <>", value, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeGreaterThan(Date value) {
            addCriterion("submitted_time >", value, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submitted_time >=", value, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeLessThan(Date value) {
            addCriterion("submitted_time <", value, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeLessThanOrEqualTo(Date value) {
            addCriterion("submitted_time <=", value, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeIn(List<Date> values) {
            addCriterion("submitted_time in", values, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeNotIn(List<Date> values) {
            addCriterion("submitted_time not in", values, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeBetween(Date value1, Date value2) {
            addCriterion("submitted_time between", value1, value2, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeNotBetween(Date value1, Date value2) {
            addCriterion("submitted_time not between", value1, value2, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSettledResultIsNull() {
            addCriterion("settled_result is null");
            return (Criteria) this;
        }

        public Criteria andSettledResultIsNotNull() {
            addCriterion("settled_result is not null");
            return (Criteria) this;
        }

        public Criteria andSettledResultEqualTo(String value) {
            addCriterion("settled_result =", value, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultNotEqualTo(String value) {
            addCriterion("settled_result <>", value, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultGreaterThan(String value) {
            addCriterion("settled_result >", value, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultGreaterThanOrEqualTo(String value) {
            addCriterion("settled_result >=", value, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultLessThan(String value) {
            addCriterion("settled_result <", value, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultLessThanOrEqualTo(String value) {
            addCriterion("settled_result <=", value, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultLike(String value) {
            addCriterion("settled_result like", value, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultNotLike(String value) {
            addCriterion("settled_result not like", value, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultIn(List<String> values) {
            addCriterion("settled_result in", values, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultNotIn(List<String> values) {
            addCriterion("settled_result not in", values, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultBetween(String value1, String value2) {
            addCriterion("settled_result between", value1, value2, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultNotBetween(String value1, String value2) {
            addCriterion("settled_result not between", value1, value2, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledTimeIsNull() {
            addCriterion("settled_time is null");
            return (Criteria) this;
        }

        public Criteria andSettledTimeIsNotNull() {
            addCriterion("settled_time is not null");
            return (Criteria) this;
        }

        public Criteria andSettledTimeEqualTo(Date value) {
            addCriterion("settled_time =", value, "settledTime");
            return (Criteria) this;
        }

        public Criteria andSettledTimeNotEqualTo(Date value) {
            addCriterion("settled_time <>", value, "settledTime");
            return (Criteria) this;
        }

        public Criteria andSettledTimeGreaterThan(Date value) {
            addCriterion("settled_time >", value, "settledTime");
            return (Criteria) this;
        }

        public Criteria andSettledTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("settled_time >=", value, "settledTime");
            return (Criteria) this;
        }

        public Criteria andSettledTimeLessThan(Date value) {
            addCriterion("settled_time <", value, "settledTime");
            return (Criteria) this;
        }

        public Criteria andSettledTimeLessThanOrEqualTo(Date value) {
            addCriterion("settled_time <=", value, "settledTime");
            return (Criteria) this;
        }

        public Criteria andSettledTimeIn(List<Date> values) {
            addCriterion("settled_time in", values, "settledTime");
            return (Criteria) this;
        }

        public Criteria andSettledTimeNotIn(List<Date> values) {
            addCriterion("settled_time not in", values, "settledTime");
            return (Criteria) this;
        }

        public Criteria andSettledTimeBetween(Date value1, Date value2) {
            addCriterion("settled_time between", value1, value2, "settledTime");
            return (Criteria) this;
        }

        public Criteria andSettledTimeNotBetween(Date value1, Date value2) {
            addCriterion("settled_time not between", value1, value2, "settledTime");
            return (Criteria) this;
        }

        public Criteria andPnLIsNull() {
            addCriterion("pn_l is null");
            return (Criteria) this;
        }

        public Criteria andPnLIsNotNull() {
            addCriterion("pn_l is not null");
            return (Criteria) this;
        }

        public Criteria andPnLEqualTo(BigDecimal value) {
            addCriterion("pn_l =", value, "pnL");
            return (Criteria) this;
        }

        public Criteria andPnLNotEqualTo(BigDecimal value) {
            addCriterion("pn_l <>", value, "pnL");
            return (Criteria) this;
        }

        public Criteria andPnLGreaterThan(BigDecimal value) {
            addCriterion("pn_l >", value, "pnL");
            return (Criteria) this;
        }

        public Criteria andPnLGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pn_l >=", value, "pnL");
            return (Criteria) this;
        }

        public Criteria andPnLLessThan(BigDecimal value) {
            addCriterion("pn_l <", value, "pnL");
            return (Criteria) this;
        }

        public Criteria andPnLLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pn_l <=", value, "pnL");
            return (Criteria) this;
        }

        public Criteria andPnLIn(List<BigDecimal> values) {
            addCriterion("pn_l in", values, "pnL");
            return (Criteria) this;
        }

        public Criteria andPnLNotIn(List<BigDecimal> values) {
            addCriterion("pn_l not in", values, "pnL");
            return (Criteria) this;
        }

        public Criteria andPnLBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pn_l between", value1, value2, "pnL");
            return (Criteria) this;
        }

        public Criteria andPnLNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pn_l not between", value1, value2, "pnL");
            return (Criteria) this;
        }

        public Criteria andNetReturnIsNull() {
            addCriterion("net_return is null");
            return (Criteria) this;
        }

        public Criteria andNetReturnIsNotNull() {
            addCriterion("net_return is not null");
            return (Criteria) this;
        }

        public Criteria andNetReturnEqualTo(BigDecimal value) {
            addCriterion("net_return =", value, "netReturn");
            return (Criteria) this;
        }

        public Criteria andNetReturnNotEqualTo(BigDecimal value) {
            addCriterion("net_return <>", value, "netReturn");
            return (Criteria) this;
        }

        public Criteria andNetReturnGreaterThan(BigDecimal value) {
            addCriterion("net_return >", value, "netReturn");
            return (Criteria) this;
        }

        public Criteria andNetReturnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("net_return >=", value, "netReturn");
            return (Criteria) this;
        }

        public Criteria andNetReturnLessThan(BigDecimal value) {
            addCriterion("net_return <", value, "netReturn");
            return (Criteria) this;
        }

        public Criteria andNetReturnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("net_return <=", value, "netReturn");
            return (Criteria) this;
        }

        public Criteria andNetReturnIn(List<BigDecimal> values) {
            addCriterion("net_return in", values, "netReturn");
            return (Criteria) this;
        }

        public Criteria andNetReturnNotIn(List<BigDecimal> values) {
            addCriterion("net_return not in", values, "netReturn");
            return (Criteria) this;
        }

        public Criteria andNetReturnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_return between", value1, value2, "netReturn");
            return (Criteria) this;
        }

        public Criteria andNetReturnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_return not between", value1, value2, "netReturn");
            return (Criteria) this;
        }

        public Criteria andNetPnLIsNull() {
            addCriterion("net_pn_l is null");
            return (Criteria) this;
        }

        public Criteria andNetPnLIsNotNull() {
            addCriterion("net_pn_l is not null");
            return (Criteria) this;
        }

        public Criteria andNetPnLEqualTo(BigDecimal value) {
            addCriterion("net_pn_l =", value, "netPnL");
            return (Criteria) this;
        }

        public Criteria andNetPnLNotEqualTo(BigDecimal value) {
            addCriterion("net_pn_l <>", value, "netPnL");
            return (Criteria) this;
        }

        public Criteria andNetPnLGreaterThan(BigDecimal value) {
            addCriterion("net_pn_l >", value, "netPnL");
            return (Criteria) this;
        }

        public Criteria andNetPnLGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("net_pn_l >=", value, "netPnL");
            return (Criteria) this;
        }

        public Criteria andNetPnLLessThan(BigDecimal value) {
            addCriterion("net_pn_l <", value, "netPnL");
            return (Criteria) this;
        }

        public Criteria andNetPnLLessThanOrEqualTo(BigDecimal value) {
            addCriterion("net_pn_l <=", value, "netPnL");
            return (Criteria) this;
        }

        public Criteria andNetPnLIn(List<BigDecimal> values) {
            addCriterion("net_pn_l in", values, "netPnL");
            return (Criteria) this;
        }

        public Criteria andNetPnLNotIn(List<BigDecimal> values) {
            addCriterion("net_pn_l not in", values, "netPnL");
            return (Criteria) this;
        }

        public Criteria andNetPnLBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_pn_l between", value1, value2, "netPnL");
            return (Criteria) this;
        }

        public Criteria andNetPnLNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_pn_l not between", value1, value2, "netPnL");
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