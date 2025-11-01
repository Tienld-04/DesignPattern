package org.example.creational_patterns.FactoryMethod.Weather;

public class AccuWeatherAPI implements WeatherAPI {
    @Override
    public String getWeather() {
        return "Lấy dữ liệu thời tiết từ AccuWeather API...";
    }
}
