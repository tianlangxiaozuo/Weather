package com.zdz.myweather.modules.main.domain;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by 14553 on 2017/11/27.
 */

public class TmpEntity implements Serializable{
    @SerializedName("max")
    public String max;
    @SerializedName("min")
    public String min;
}
