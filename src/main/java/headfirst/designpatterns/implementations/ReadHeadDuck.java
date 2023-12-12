package headfirst.designpatterns.implementations;

import headfirst.designpatterns.Duck;
import headfirst.designpatterns.concrete.FlyNoWay;
import headfirst.designpatterns.concrete.Quack;

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
