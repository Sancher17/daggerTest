package com.example.alex.testdaggermy;


import com.example.alex.testdaggermy.MainActivity;

import dagger.Component;

/**
 * created on 01.04.2018
 */
@Component
public interface AppComponent {

    void inject(MainActivity mainActivity);



}
