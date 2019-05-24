package com.android.coolweather.bean;

/**
 * Created by zhangqi on 2019/5/24
 */
public class AQI {

    public AQICity city;

    public class AQICity {
        public String api;
        public String pm25;
    }
}
