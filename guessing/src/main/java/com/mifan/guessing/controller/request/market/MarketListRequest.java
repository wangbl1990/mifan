package com.mifan.guessing.controller.request.market;

import com.mifan.guessing.controller.request.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class MarketListRequest extends BaseRequest {

    @ApiModelProperty( name = "eventId" , value = "赛事ID" )
    private String envetId;

}
