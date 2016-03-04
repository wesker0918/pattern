package com.wangy.pattern.观察者模式.interfaces.impl;

import com.wangy.pattern.观察者模式.interfaces.DisplayElement;
import com.wangy.pattern.观察者模式.interfaces.Observer;
import com.wangy.pattern.观察者模式.interfaces.Subject;

@SuppressWarnings("unused")
public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity");
	}

	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.display();
	}

}
