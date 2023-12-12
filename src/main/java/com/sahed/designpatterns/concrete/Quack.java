package com.sahed.designpatterns.concrete;

import com.sahed.designpatterns.interfaces.QuackableInterface;

public class Quack implements QuackableInterface {
    @Override
    public String quack() {
        return "I can quack! Quack! Quack!";
    }
}
