package com.company;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    public float temperature;
    public float humidity;
    public Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + "% humidity");
    }

}
