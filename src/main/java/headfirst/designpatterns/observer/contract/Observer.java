package headfirst.designpatterns.observer.contract;

public interface Observer {
    // TODO:: User an interface instead of specific params.
    public void update(float temp, float humidity, float pressure);
}
