package com.tangyao.authority.designmode.observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData(12,13,14);
        weatherData.addObserver(new TangxianObserver());
        weatherData.addObserver(new ShunpingObserver());
        weatherData.notifyObserver();

    }
}
