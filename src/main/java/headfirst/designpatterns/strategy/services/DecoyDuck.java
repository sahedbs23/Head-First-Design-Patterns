package headfirst.designpatterns.strategy.services;

import headfirst.designpatterns.strategy.contract.Duck;
import headfirst.designpatterns.strategy.provider.FlyNoWay;
import headfirst.designpatterns.strategy.provider.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        quackBehaviour = new MuteQuack();
        flyBehaviour = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println(getClass().getSimpleName() + " : looks like a decoy duck");
    }
}
