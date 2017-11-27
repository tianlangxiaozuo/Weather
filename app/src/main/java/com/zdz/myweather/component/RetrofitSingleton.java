package com.zdz.myweather.component;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by 14553 on 2017/11/24.
 */

public class RetrofitSingleton {

    private static final String TAG =RetrofitSingleton.class.getSimpleName();

    private static ApiInterface sApiService = null;
    private static Retrofit sRetrofit = null;
    private static OkHttpClient sOkHttpClient = null;
    private void init(){
        initOkHttp();
        initRetrofit();
        sApiService =sRetrofit.create(ApiInterface.class);
    }
    private RetrofitSingleton(){
        init();
    }
    private static RetrofitSingleton getInstance(){
        return
    }

}
