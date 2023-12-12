package com.moral.sahed.HeadFirstDesignPatterns.concrete;

import com.moral.sahed.HeadFirstDesignPatterns.interfaces.QuackableInterface;

public class Squeak implements QuackableInterface {
    @Override
    public String quack() {
        return "I can Squeak! Squeak! Squeak!";
    }
}
