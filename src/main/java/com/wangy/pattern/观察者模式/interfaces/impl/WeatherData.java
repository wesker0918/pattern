package com.wangy.pattern.观察者模式.interfaces.impl;

import java.util.ArrayList;
import java.util.List;

import com.wangy.pattern.观察者模式.interfaces.Observer;
import com.wangy.pattern.观察者模式.interfaces.Subject;

public class WeatherData implements Subject {

	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		if(observers.contains(o))
			observers.remove(o);
	}

	public void notifyObservers() {
		for(Observer o: observers) {
			o.update(temperature, humidity, pressure);
		}
	}
	
	public void measuremontsChanged() {
		this.notifyObservers();
	}
	
	public void setMeasuremonts(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measuremontsChanged();
	}

}
