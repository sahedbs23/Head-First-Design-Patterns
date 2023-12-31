package headfirst.designpatterns.observer.concrete;

import headfirst.designpatterns.observer.contract.DisplayElement;
import headfirst.designpatterns.observer.contract.Observer;

public class HeadIndexDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public HeadIndexDisplay(WeatherData weatherData) {
        this.weatherData =weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Heat Index is %.4f%n", calculateHeatIndex());
    }

    @Override
    public void update() {
        temperature = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        display();
    }

    private double calculateHeatIndex() {
        return -42.379 + 2.04901523 * temperature + 10.14333127 * humidity
                - .22475541 * temperature * humidity - .00683783 * temperature * temperature
                - .05481717 * humidity * humidity + .00122874 * temperature * temperature * humidity
                + .00085282 * temperature * humidity * humidity
                - .00000199 * temperature * temperature * humidity * humidity;
    }
}
