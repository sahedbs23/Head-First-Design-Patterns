package headfirst.designpatterns.decorator.concrete;

import headfirst.designpatterns.decorator.contract.Beverage;
import headfirst.designpatterns.decorator.contract.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
