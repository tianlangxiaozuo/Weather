package com.zdz.myweather.modules.main.domain;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 14553 on 2017/11/24.
 */

public class Weather implements Serializable {

    @SerializedName("api")
    public AqiEntity aqi;

    @SerializedName("basic")
    public BasicEntity basic;

    @SerializedName("now")
    public NowEntity now;

    @SerializedName("status")
    public String status;

    @SerializedName("suggestion")
    public SuggestionEntity suggestion;

    @SerializedName("daily_forecast")
    public List<DailyForecastEntity> dailyForecast;
    @SerializedName("hourly_forecast")
    public List<HourlyForecastEntiy> hourlyForecast;

    public boolean isValid() {
        return aqi != null && now != null && basic != null && suggestion != null;
    }
}
