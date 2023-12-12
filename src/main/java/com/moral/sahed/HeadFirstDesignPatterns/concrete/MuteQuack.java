package com.moral.sahed.HeadFirstDesignPatterns.concrete;

import com.moral.sahed.HeadFirstDesignPatterns.interfaces.QuackableInterface;

public class MuteQuack implements QuackableInterface {
    @Override
    public String quack() {
        return "Neither i can quack nor squeak!";
    }
}
