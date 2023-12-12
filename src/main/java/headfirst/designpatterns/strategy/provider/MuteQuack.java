package headfirst.designpatterns.strategy.provider;

import headfirst.designpatterns.strategy.contract.QuackableInterface;

public class MuteQuack implements QuackableInterface {
    @Override
    public String quack() {
        return "Neither i can quack nor squeak!";
    }
}
