package headfirst.designpatterns.observer.concrete;

import headfirst.designpatterns.observer.contract.DisplayElement;
import headfirst.designpatterns.observer.contract.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private WeatherData weatherData;
    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.printf("Average/Max/Min temperature : %.1f/%.1f/%.1f%n", temperature, temperature,temperature);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemp();
        display();
    }
}
