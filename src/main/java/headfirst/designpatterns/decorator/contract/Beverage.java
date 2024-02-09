package headfirst.designpatterns.decorator.contract;

abstract public class Beverage {
    public String description;
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
