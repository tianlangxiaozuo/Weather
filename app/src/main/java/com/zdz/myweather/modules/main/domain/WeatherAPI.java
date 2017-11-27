package com.zdz.myweather.modules.main.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 14553 on 2017/11/24.
 */

public class WeatherAPI {

    @SerializedName("HeWeaher5")
    @Expose
    public List<Weather> mWeathers = null;

}
