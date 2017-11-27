package com.zdz.myweather.component;

import java.util.Observable;

import retrofit2.http.GET;

/**
 * Created by 14553 on 2017/11/24.
 */

public interface ApiInterface {

    String HOST = "https://free-api.heweather.com/v5/";

    @GET("weater")
    Observable<wea>
}
