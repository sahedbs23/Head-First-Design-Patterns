package headfirst.designpatterns.decorator.concrete;

import headfirst.designpatterns.decorator.contract.Beverage;
import headfirst.designpatterns.decorator.contract.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
