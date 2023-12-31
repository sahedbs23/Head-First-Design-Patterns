package headfirst.designpatterns.observer;

import headfirst.designpatterns.observer.concrete.*;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeadIndexDisplay headIndexDisplay = new HeadIndexDisplay(weatherData);
        weatherData.setMeasurement(80,65,30.4f);
        weatherData.setMeasurement(82,70,27.4f);
        weatherData.setMeasurement(78,90,29.4f);
    }

}
