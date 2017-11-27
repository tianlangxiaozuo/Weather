package com.zdz.myweather.modules.main.domain;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by 14553 on 2017/11/24.
 */

public class AqiEntity implements Serializable{
    @SerializedName("city")
    public CityEntity city;
}
