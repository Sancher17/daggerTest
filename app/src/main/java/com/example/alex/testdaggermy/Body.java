package com.example.alex.testdaggermy;

import android.util.Log;

import javax.inject.Inject;

import static com.example.alex.testdaggermy.MainActivity.TAG;

public class Body {

    private String name = "body";

    @Inject
    public Body() {
    }


    @Override
    public String toString() {
        return name;
    }

    public void print(){
        Log.d(TAG, "print: "+name);
    }
}
