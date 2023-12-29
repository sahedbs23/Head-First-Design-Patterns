package headfirst.designpatterns.observer.concrete;

import headfirst.designpatterns.observer.contract.DisplayElement;
import headfirst.designpatterns.observer.contract.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float humidity;
    private float pressure;
    private WeatherData weatherData;
    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.printf("Let's find out! %.1f %.1f%n", humidity, pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
