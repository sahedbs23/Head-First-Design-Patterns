package headfirst.designpatterns.strategy.services;

import headfirst.designpatterns.strategy.contract.Duck;
import headfirst.designpatterns.strategy.provider.FlyNoWay;
import headfirst.designpatterns.strategy.provider.Quack;

public class ReadHeadDuck extends Duck {
    public ReadHeadDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println(getClass().getSimpleName() + " : looks like a Read Head Duck!");
    }
}
