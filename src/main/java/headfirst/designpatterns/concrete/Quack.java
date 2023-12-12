package headfirst.designpatterns.concrete;

import headfirst.designpatterns.interfaces.QuackableInterface;

public class Quack implements QuackableInterface {
    @Override
    public String quack() {
        return "I can quack! Quack! Quack!";
    }
}
