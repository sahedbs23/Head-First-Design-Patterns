package com.moral.sahed.HeadFirstDesignPatterns.concrete;

import com.moral.sahed.HeadFirstDesignPatterns.interfaces.FlyableInterface;

public class FlyRockerPowered implements FlyableInterface {
    @Override
    public String fly() {
        return "I am flying with a rocket!";
    }
}
