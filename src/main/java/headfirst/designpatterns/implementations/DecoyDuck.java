package headfirst.designpatterns.implementations;

import headfirst.designpatterns.Duck;
import headfirst.designpatterns.concrete.FlyNoWay;
import headfirst.designpatterns.concrete.MuteQuack;

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
