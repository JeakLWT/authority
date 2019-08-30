package com.tangyao.authority.designmode.observer;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {
    private float temperature;
    private float humity;
    private float press;

    private List<Observer> observerList;

    public WeatherData(float temperature, float humity, float press) {
        this.temperature = temperature;
        this.humity = humity;
        this.press = press;
        observerList=new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumity() {
        return humity;
    }

    public void setHumity(float humity) {
        this.humity = humity;
    }

    public float getPress() {
        return press;
    }

    public void setPress(float press) {
        this.press = press;
    }

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void deleteObserver(Observer observer){
        if(!CollectionUtils.isEmpty(observerList)){
            observerList.remove(observer);
        }
    }

    public void notifyObserver(){
        if(!CollectionUtils.isEmpty(observerList)){
            observerList.stream().forEach(s->s.update(this.temperature,this.humity,this.press));
        }
    }
}
