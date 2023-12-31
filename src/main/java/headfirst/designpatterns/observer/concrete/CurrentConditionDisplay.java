package headfirst.designpatterns.observer.concrete;

import headfirst.designpatterns.observer.contract.DisplayElement;
import headfirst.designpatterns.observer.contract.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;
    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update() {
        this.temperature = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        display();
    }
    @Override
    public void display() {
        System.out.printf("Current conditions : Temperature %.1f F degree and %.1f humidity%n", temperature,humidity);
    }
}
