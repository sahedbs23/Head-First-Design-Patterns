package headfirst.designpatterns.strategy.provider;

import headfirst.designpatterns.strategy.contract.QuackableInterface;

public class Squeak implements QuackableInterface {
    @Override
    public String quack() {
        return "I can Squeak! Squeak! Squeak!";
    }
}
