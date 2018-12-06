package com.mifan.guessing.controller.response.event;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@ApiModel
public class EventDetailResponse {

    @ApiModelProperty( name = "id" , value = "赛事ID" )
    private String id;//赛事ID
    @ApiModelProperty( name = "eventId" , value = "滚球赛事ID" )
    private String eventId;//滚球赛事ID
    @ApiModelProperty( name = "sportId" , value = "运动项目ID" )
    private String sportId;//运动项目ID
    @ApiModelProperty( name = "eventName" , value = "赛事名称" )
    private String eventName;//赛事名称
    @ApiModelProperty( name = "eventTime" , value = "赛事时间" )
    private Date eventTime;//赛事时间
    @ApiModelProperty( name = "competitionName" , value = "赛事类型" )
    private String competitionName;//赛事类型
    @ApiModelProperty( name = "seasonName" , value = "赛事ID" )
    private String seasonName;
    @ApiModelProperty( name = "roundName" , value = "赛事ID" )
    private String roundName;
    @ApiModelProperty( name = "homeTeamName" , value = "主队名称" )
    private String homeTeamName;//主队名称
    @ApiModelProperty( name = "awayTeamName" , value = "客队名称" )
    private String awayTeamName;//客队名称
    @ApiModelProperty( name = "homeTeamScore" , value = "主队得分" )
    private String homeTeamScore;//主队得分
    @ApiModelProperty( name = "awayTeamScore" , value = "客队得分" )
    private String awayTeamScore;//客队得分
    @ApiModelProperty( name = "state" , value = "赛事ID" )
    private String state;
    @ApiModelProperty( name = "stage" , value = "赛事ID" )
    private String stage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getSportId() {
        return sportId;
    }

    public void setSportId(String sportId) {
        this.sportId = sportId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getRoundName() {
        return roundName;
    }

    public void setRoundName(String roundName) {
        this.roundName = roundName;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public String getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(String homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public String getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(String awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }
}
