package org.example.creational_patterns.FactoryMethod.Weather;

public class Client {
    public static void main(String[] args) {
        WeatherFactory factory;
        WeatherAPI api;

        // Tùy chọn AccuWeather
        factory = new AccuWeatherFactory();
        api = factory.createWeatherAPI();
        api.getWeather();
        System.out.println(api.getWeather());
        // Tùy chọn DarkSky
        factory = new DarkSkyFactory();
        api = factory.createWeatherAPI();
        api.getWeather();
        System.out.println(api.getWeather());

    }
}
