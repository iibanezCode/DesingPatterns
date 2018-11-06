package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {


    private float tempreature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }

    public float getTempreature() {
        return tempreature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }


    public void setMeasurements(float tempreature, float humidity, float pressure) {
        this.tempreature = tempreature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
