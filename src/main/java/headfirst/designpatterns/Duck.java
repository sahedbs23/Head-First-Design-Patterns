package headfirst.designpatterns;

import headfirst.designpatterns.interfaces.FlyableInterface;
import headfirst.designpatterns.interfaces.QuackableInterface;

public abstract class Duck {
    protected QuackableInterface quackBehaviour;

    protected FlyableInterface flyBehaviour;

    public String performQuack(){
        return quackBehaviour.quack();
    }
    public String performFly(){
        return flyBehaviour.fly();
    }

    public Duck setFlyBehaviour(FlyableInterface flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
        return this;
    }

    public abstract void display();
}
