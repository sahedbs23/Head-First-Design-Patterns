package com.moral.sahed.HeadFirstDesignPatterns.concrete;

import com.moral.sahed.HeadFirstDesignPatterns.interfaces.FlyableInterface;

public class FlyNoWay implements FlyableInterface {
    @Override
    public String fly() {
        return "I can't fly!";
    }
}
