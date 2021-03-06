package com.example.app;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

import com.example.app_common.CommonModule;

/**
 * @author xp
 */
public class MyApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
    @Override
    public void onCreate() {
        super.onCreate();
        CommonModule.init(this);
    }

}
