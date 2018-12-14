package com.mifan.guessing.controller.response.event;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class EventTypeResponse implements Serializable {

    @ApiModelProperty( name = "eventType" , value = "赛事类型" )
    private String eventType;//赛事ID




}
