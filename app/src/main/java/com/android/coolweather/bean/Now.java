package com.android.coolweather.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhangqi on 2019/5/24
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }

}
