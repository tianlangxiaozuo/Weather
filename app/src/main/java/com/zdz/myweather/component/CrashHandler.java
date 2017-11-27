package com.zdz.myweather.component;

import android.content.Context;
import android.os.Build;
import android.util.Log;

import com.zdz.myweather.common.utils.VersionUtil;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Created by 14553 on 2017/11/24.
 * <p>
 * 捕获程序崩溃信息
 */

public class CrashHandler implements Thread.UncaughtExceptionHandler {
    private static final String TAG = CrashHandler.class.getSimpleName();

    private static Thread.UncaughtExceptionHandler mDefaultHandler = null;

    private Context mContext = null;

    public CrashHandler(Context context) {
        this.mContext = context;
    }

    /**
     * 初始化,设置CrashHandler为程序的默认处理器
     */
    public static void init(CrashHandler crashHandler) {
        mDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(crashHandler);
    }

    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        System.out.println(ex.toString());

        Log.e(TAG, "uncaughtException: " + ex.toString());
        Log.e(TAG, "uncaughtException: " + collcetCrashDeviceInfo());
        Log.e(TAG, "uncaughtException: " +getCrashInfo(ex));
    }

    /**
     * 得到程序崩溃详细信息
     *
     * */
    private  String getCrashInfo(Throwable ex){
        Writer result = new StringWriter();
        PrintWriter printWriter = new PrintWriter(result);
        ex.setStackTrace(ex.getStackTrace());
        ex.printStackTrace(printWriter);
        return  result.toString();
    }

    /**
     * 收集程序崩溃的设备信息
     */
    private String collcetCrashDeviceInfo() {
        String versionName = VersionUtil.getVersion(mContext);
        String model = Build.MODEL;
        String androidVersion = Build.VERSION.RELEASE;
        String manufacturer = Build.MANUFACTURER;
        return versionName + "   " + model + "   " + androidVersion + "  " + manufacturer;
    }
}
