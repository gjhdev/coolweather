package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by askj on 2017-12-20.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public  Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_id")
        public String info;
    }

}
