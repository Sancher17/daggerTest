package com.example.alex.testdaggermy;

import javax.inject.Inject;

public class Wheels {

    private String name = "wheels";

    @Inject
    public Wheels() {
    }


    @Override
    public String toString() {
        return name;
    }
}
