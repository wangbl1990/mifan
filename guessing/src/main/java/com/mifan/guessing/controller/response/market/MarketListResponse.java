package com.mifan.guessing.controller.response.market;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel
public class MarketListResponse {

    @ApiModelProperty( name = "eventId" , value = "开放市场ID" )
    private String marketId;
    @ApiModelProperty( name = "ruleType" , value = "规则类型" )
    private String ruleType;
    @ApiModelProperty( name = "periodType" , value = "赛事ID" )
    private String periodType;
    @ApiModelProperty( name = "periodValue" , value = "赛事ID" )
    private String periodValue;
    @ApiModelProperty( name = "periodBegin" , value = "赛事ID" )
    private String periodBegin;
    @ApiModelProperty( name = "periodEnd" , value = "赛事ID" )
    private String periodEnd;
    @ApiModelProperty( name = "quotaAppetite" , value = "赛事ID" )
    private String quotaAppetite;
    @ApiModelProperty( name = "bettingDelay" , value = "赛事ID" )
    private String bettingDelay;
    @ApiModelProperty( name = "openResult" , value = "赛事ID" )
    private String openResult;
    @ApiModelProperty( name = "verifyResult" , value = "赛事ID" )
    private String verifyResult;
    @ApiModelProperty( name = "settledResult" , value = "赛事ID" )
    private String settledResult;
    @ApiModelProperty( name = "selectionResponseList" , value = "市场子项列表" )
    private List<MarketSelectionResponse> selectionResponseList;

    public List<MarketSelectionResponse> getSelectionResponseList() {
        return selectionResponseList;
    }

    public void setSelectionResponseList(List<MarketSelectionResponse> selectionResponseList) {
        this.selectionResponseList = selectionResponseList;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public String getPeriodValue() {
        return periodValue;
    }

    public void setPeriodValue(String periodValue) {
        this.periodValue = periodValue;
    }

    public String getPeriodBegin() {
        return periodBegin;
    }

    public void setPeriodBegin(String periodBegin) {
        this.periodBegin = periodBegin;
    }

    public String getPeriodEnd() {
        return periodEnd;
    }

    public void setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
    }

    public String getQuotaAppetite() {
        return quotaAppetite;
    }

    public void setQuotaAppetite(String quotaAppetite) {
        this.quotaAppetite = quotaAppetite;
    }

    public String getBettingDelay() {
        return bettingDelay;
    }

    public void setBettingDelay(String bettingDelay) {
        this.bettingDelay = bettingDelay;
    }

    public String getOpenResult() {
        return openResult;
    }

    public void setOpenResult(String openResult) {
        this.openResult = openResult;
    }

    public String getVerifyResult() {
        return verifyResult;
    }

    public void setVerifyResult(String verifyResult) {
        this.verifyResult = verifyResult;
    }

    public String getSettledResult() {
        return settledResult;
    }

    public void setSettledResult(String settledResult) {
        this.settledResult = settledResult;
    }
}
