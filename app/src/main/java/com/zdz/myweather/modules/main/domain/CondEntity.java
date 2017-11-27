package com.zdz.myweather.modules.main.domain;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by 14553 on 2017/11/27.
 */

public class CondEntity implements Serializable {
    @SerializedName("code")
    public String code;
    @SerializedName("txt")
    public String txt;
    @SerializedName("txt_d")
    public String txtDay;
}
