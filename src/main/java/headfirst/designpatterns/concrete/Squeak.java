package headfirst.designpatterns.concrete;

import headfirst.designpatterns.interfaces.QuackableInterface;

public class Squeak implements QuackableInterface {
    @Override
    public String quack() {
        return "I can Squeak! Squeak! Squeak!";
    }
}
