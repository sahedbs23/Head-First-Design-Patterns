package com.sahed.designpatterns.concrete;

import com.sahed.designpatterns.interfaces.QuackableInterface;

public class Squeak implements QuackableInterface {
    @Override
    public String quack() {
        return "I can Squeak! Squeak! Squeak!";
    }
}
