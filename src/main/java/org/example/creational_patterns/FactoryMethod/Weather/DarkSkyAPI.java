package org.example.creational_patterns.FactoryMethod.Weather;

public class DarkSkyAPI implements WeatherAPI {
    @Override
    public String getWeather() {
        return "Lấy dữ liệu thời tiết từ DarkSky API...";
    }
}
