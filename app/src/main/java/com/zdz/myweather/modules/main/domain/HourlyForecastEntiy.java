package com.zdz.myweather.modules.main.domain;

import android.support.v4.view.ViewCompat;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by 14553 on 2017/11/27.
 */

public class HourlyForecastEntiy implements Serializable {

    @SerializedName("date")
    public String date;

    @SerializedName("hum")
    public String hum;

    @SerializedName("pop")
    public String pop;

    @SerializedName("pres")
    public String pres;

    @SerializedName("tmp")
    public String tmp;

    @SerializedName("wind")
    public WindEntity wind;
}
