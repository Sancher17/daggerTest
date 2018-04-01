package com.example.alex.testdaggermy;

import android.util.Log;

import javax.inject.Inject;

import static com.example.alex.testdaggermy.MainActivity.TAG;

public class Car {

    /**Case1 - without Dagger */
//    Body body;
//    Wheels wheels;
//    Engine engine;
//
//    public Car(Body body, Wheels wheels, Engine engine){
//        this.body = body;
//        this.wheels = wheels;
//        this.engine = engine;
//    }


     /**Case2 - with Dagger */
    @Inject Body body;
    @Inject Wheels wheels;
    @Inject Engine engine;

    @Inject
    public Car(){
    }

    public void print(){
        Log.d(TAG, "print Car: "
                + body.toString()+ " / "
                + wheels.toString()+ " / "
                + engine.toString());
    }
}
