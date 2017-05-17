package com.example.mateusz.themetestproject;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;


public class MainApp extends Application {

    static {
        AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_AUTO);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

}
