package com.zdz.myweather.modules.main.domain;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by 14553 on 2017/11/27.
 */

public class BasicEntity implements Serializable{
    @SerializedName("city")
    public String city;
}
