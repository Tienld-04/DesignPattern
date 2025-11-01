package org.example.creational_patterns.FactoryMethod.Weather;

public class DarkSkyFactory extends WeatherFactory {
    @Override
    public WeatherAPI createWeatherAPI() {
        return new DarkSkyAPI();
    }
}
