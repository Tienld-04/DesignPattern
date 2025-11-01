package org.example.creational_patterns.FactoryMethod.Weather;

public class AccuWeatherFactory extends WeatherFactory {
    @Override
    public WeatherAPI createWeatherAPI() {
        return new AccuWeatherAPI();
    }
}
