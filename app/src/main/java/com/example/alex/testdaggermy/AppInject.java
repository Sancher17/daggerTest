package com.example.alex.testdaggermy;

import android.app.Application;

import com.example.alex.testdaggermy.mySimple.DaggerAppComponent;

public class AppInject extends Application {

    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }


    public static AppComponent getComponent(){
        return component;
    }
}
