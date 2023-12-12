package headfirst.designpatterns.strategy.contract;

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

    /**
     * @param quackBehaviour
     * @return Duck
     */
    public Duck setQuackBehaviour(QuackableInterface quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
        return this;
    }

    public abstract void display();
}
