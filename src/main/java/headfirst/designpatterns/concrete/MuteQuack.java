package headfirst.designpatterns.concrete;

import headfirst.designpatterns.interfaces.QuackableInterface;

public class MuteQuack implements QuackableInterface {
    @Override
    public String quack() {
        return "Neither i can quack nor squeak!";
    }
}
