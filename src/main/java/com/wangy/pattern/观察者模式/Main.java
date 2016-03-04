package com.wangy.pattern.观察者模式;

import com.wangy.pattern.观察者模式.interfaces.impl.CurrentConditionsDisplay;
import com.wangy.pattern.观察者模式.interfaces.impl.WeatherData;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasuremonts(80, 65, 30.4f);
	}

}
