package com.zdz.myweather.base;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatDelegate;

import com.zdz.myweather.BuildConfig;
import com.zdz.myweather.component.CrashHandler;

import im.fir.sdk.FIR;

/**
 * Created by 14553 on 2017/11/24.
 */

public class BaseApplication extends Application {
    private static final String TAG =BaseActivity.class.getSimpleName();

    private static String sCacheDir;
    private static Context sAppContext;

    //TODO:夜间模式, UI 有些没有适配好 暂时放弃夜间模式

    static {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sAppContext=getApplicationContext();
        CrashHandler.init(new CrashHandler(getApplicationContext()));
        if (!BuildConfig.DEBUG){
            FIR.init(this);
        }else {
            Watcher.getInstance
        }
    }
}
