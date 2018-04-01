package com.example.alex.testdaggermy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    public final static String TAG = "car";
//    @Inject Body body;
//    @Inject Wheels wheels;
//    Engine engine;
    Car carNoDagger;  //without Dagger
    @Inject Car carDagger; //with Dagger

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        /**Case1 - without Dagger */
//        Body body = new Body();
//        Wheels wheels = new Wheels();
//        Engine engine = new Engine();
//
//        carNoDagger = new Car(body, wheels, engine);
//        carNoDagger.print();
//
//        /**Case2 - without Dagger new way - inner classes */
//        carNoDagger = new Car(new Body(),new Wheels(), new Engine());
//        carNoDagger.print();

        /**Case3 - with Dagger */
        AppInject.getComponent().inject(this);
        carDagger.print();

        //        Log.d(TAG, "onCreate: " +   body.toString());
//        Log.d(TAG, "onCreate: " +   wheels.toString());
//        Log.d(TAG, "onCreate: " +   engine.toString());

//        body.print();
//        engine.print();
    }
}
