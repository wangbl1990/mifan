package com.mifan.guessing.controller.request.event;

import com.mifan.guessing.controller.request.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class EventDetailRequest extends BaseRequest{

    @ApiModelProperty( name = "eventId" , value = "赛事ID" )
    private String eventId;//赛事ID

}
