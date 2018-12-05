package com.mifan.guessing.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class TradeOrder {
    private String id;

    private String orderId;

    private String outOrderId;

    private String vendorPlayerId;

    private String eventId;

    private String marketId;

    private String selectionId;

    private BigDecimal requestAmount;

    private BigDecimal requestPrice;

    private BigDecimal fillAmount;

    private BigDecimal fillPrice;

    private String placedResult;

    private String status;

    private Date submittedTime;

    private String settledResult;

    private Date settledTime;

    private BigDecimal pnL;

    private BigDecimal netReturn;

    private BigDecimal netPnL;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOutOrderId() {
        return outOrderId;
    }

    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId == null ? null : outOrderId.trim();
    }

    public String getVendorPlayerId() {
        return vendorPlayerId;
    }

    public void setVendorPlayerId(String vendorPlayerId) {
        this.vendorPlayerId = vendorPlayerId == null ? null : vendorPlayerId.trim();
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId == null ? null : eventId.trim();
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId == null ? null : marketId.trim();
    }

    public String getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(String selectionId) {
        this.selectionId = selectionId == null ? null : selectionId.trim();
    }

    public BigDecimal getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(BigDecimal requestAmount) {
        this.requestAmount = requestAmount;
    }

    public BigDecimal getRequestPrice() {
        return requestPrice;
    }

    public void setRequestPrice(BigDecimal requestPrice) {
        this.requestPrice = requestPrice;
    }

    public BigDecimal getFillAmount() {
        return fillAmount;
    }

    public void setFillAmount(BigDecimal fillAmount) {
        this.fillAmount = fillAmount;
    }

    public BigDecimal getFillPrice() {
        return fillPrice;
    }

    public void setFillPrice(BigDecimal fillPrice) {
        this.fillPrice = fillPrice;
    }

    public String getPlacedResult() {
        return placedResult;
    }

    public void setPlacedResult(String placedResult) {
        this.placedResult = placedResult == null ? null : placedResult.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getSubmittedTime() {
        return submittedTime;
    }

    public void setSubmittedTime(Date submittedTime) {
        this.submittedTime = submittedTime;
    }

    public String getSettledResult() {
        return settledResult;
    }

    public void setSettledResult(String settledResult) {
        this.settledResult = settledResult == null ? null : settledResult.trim();
    }

    public Date getSettledTime() {
        return settledTime;
    }

    public void setSettledTime(Date settledTime) {
        this.settledTime = settledTime;
    }

    public BigDecimal getPnL() {
        return pnL;
    }

    public void setPnL(BigDecimal pnL) {
        this.pnL = pnL;
    }

    public BigDecimal getNetReturn() {
        return netReturn;
    }

    public void setNetReturn(BigDecimal netReturn) {
        this.netReturn = netReturn;
    }

    public BigDecimal getNetPnL() {
        return netPnL;
    }

    public void setNetPnL(BigDecimal netPnL) {
        this.netPnL = netPnL;
    }
}