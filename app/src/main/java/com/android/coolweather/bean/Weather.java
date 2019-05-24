package com.android.coolweather.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by zhangqi on 2019/5/24
 */
public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
