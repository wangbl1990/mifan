package com.mifan.guessing.controller.response.market;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class MarketSelectionResponse {

    @ApiModelProperty( name = "selectionId" , value = "子项ID" )
    private String selectionId;
    @ApiModelProperty( name = "backOdds" , value = "赛事ID" )
    private String backOdds;
    @ApiModelProperty( name = "lastBackOdds" , value = "赛事ID" )
    private String lastBackOdds;
    @ApiModelProperty( name = "maxStakeLimit" , value = "赛事ID" )
    private String maxStakeLimit;

    public String getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(String selectionId) {
        this.selectionId = selectionId;
    }

    public String getBackOdds() {
        return backOdds;
    }

    public void setBackOdds(String backOdds) {
        this.backOdds = backOdds;
    }

    public String getLastBackOdds() {
        return lastBackOdds;
    }

    public void setLastBackOdds(String lastBackOdds) {
        this.lastBackOdds = lastBackOdds;
    }

    public String getMaxStakeLimit() {
        return maxStakeLimit;
    }

    public void setMaxStakeLimit(String maxStakeLimit) {
        this.maxStakeLimit = maxStakeLimit;
    }
}
