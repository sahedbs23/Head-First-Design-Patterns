package headfirst.designpatterns.strategy.provider;

import headfirst.designpatterns.strategy.contract.QuackableInterface;

public class Quack implements QuackableInterface {
    @Override
    public String quack() {
        return "I can quack! Quack! Quack!";
    }
}
