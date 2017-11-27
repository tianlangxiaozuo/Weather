package com.zdz.myweather.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;

import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by 14553 on 2017/11/24.
 */

public abstract class BaseActivity extends RxAppCompatActivity {

    private static String TAG = BaseActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        ButterKnife.bind(this);
    }

    protected abstract int layoutId();

    public static void setDayTheme(AppCompatActivity activity) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        activity.getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        //调用 recreate()设置生效
        activity.recreate();
    }

    public static void setNightTheme(AppCompatActivity activity) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        activity.getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        //设置recreate() 设置生效
        activity.recreate();
    }

    public void setTheme(AppCompatActivity activity) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
        activity.getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
        activity.recreate();
    }
}
