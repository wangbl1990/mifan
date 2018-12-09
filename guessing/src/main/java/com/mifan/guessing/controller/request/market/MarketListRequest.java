package com.mifan.guessing.controller.request.market;

import com.mifan.guessing.controller.request.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class MarketListRequest extends BaseRequest {

    @ApiModelProperty( name = "eventId" , value = "赛事ID" )
    private String envetId;

    public String getEnvetId() {
        return envetId;
    }

    public void setEnvetId(String envetId) {
        this.envetId = envetId;
    }
}
