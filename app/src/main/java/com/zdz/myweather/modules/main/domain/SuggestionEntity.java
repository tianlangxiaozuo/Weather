package com.zdz.myweather.modules.main.domain;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by 14553 on 2017/11/27.
 */

public class SuggestionEntity implements Serializable {

    @SerializedName("comf")
    public ComEntity comf;

    @SerializedName("cw")
    public CwEntity cw;

    @SerializedName("drsg")
    public DrsgEntity drsg;

    @SerializedName("flu")
    public FluEntity flu;

    @SerializedName("sport")
    public SportEntity sport;

    @SerializedName("trav")
    public TravEntity trav;

    @SerializedName("uv")
    public UvEntity uv;

    public static class ComEntity implements Serializable {
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String txt;
    }

    public static class CwEntity implements Serializable {
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String txt;
    }

    public static class DrsgEntity implements Serializable {
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String txt;
    }

    public static class FluEntity implements Serializable {
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String txt;
    }

    public static class SportEntity implements Serializable {
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String txt;
    }

    public static class TravEntity implements Serializable {
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String txt;
    }

    public static class UvEntity implements Serializable {
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String txt;
    }

}
