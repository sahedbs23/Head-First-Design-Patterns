package com.moral.sahed.HeadFirstDesignPatterns.concrete;

import com.moral.sahed.HeadFirstDesignPatterns.interfaces.QuackableInterface;

public class Quack implements QuackableInterface {
    @Override
    public String quack() {
        return "I can quack! Quack! Quack!";
    }
}
