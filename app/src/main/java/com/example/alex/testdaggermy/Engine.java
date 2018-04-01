package com.example.alex.testdaggermy;

import android.util.Log;

import javax.inject.Inject;

import static com.example.alex.testdaggermy.MainActivity.TAG;

public class Engine {

    private String name = "engine";

    @Inject
    public Engine() {
    }

    public void print(){
        Log.d(TAG, "print: "+ name);
    }


    @Override
    public String toString() {
        return name;
    }
}
