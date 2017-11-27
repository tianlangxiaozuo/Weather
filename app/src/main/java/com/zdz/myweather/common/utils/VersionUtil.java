package com.zdz.myweather.common.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * Created by 14553 on 2017/11/24.
 */

public class VersionUtil {

    public static String getVersion(Context context){
        try{
            PackageManager manager=context.getPackageManager();
            PackageInfo info=manager.getPackageInfo(context.getPackageName(),0);
            return info.versionName;
        }catch (Exception e){
            e.printStackTrace();
            return "找不到版本好";
        }
    }

    /**
     * @return 版本号
     * */
    public static int getVersionCode(Context context){
        try {
            PackageManager manager=context.getPackageManager();
            PackageInfo info = manager.getPackageInfo(context.getPackageName(),0);
            return info.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void checkVersion(Context context){
        Retro
    }

}
