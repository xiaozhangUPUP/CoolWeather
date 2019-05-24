package com.android.coolweather.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhangqi on 2019/5/24
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
