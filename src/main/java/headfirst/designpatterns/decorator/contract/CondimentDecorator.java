package headfirst.designpatterns.decorator.contract;

abstract public class CondimentDecorator extends Beverage {
    public Beverage beverage;
    abstract public String getDescription();
}
