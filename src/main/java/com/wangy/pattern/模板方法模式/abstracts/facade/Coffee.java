package com.wangy.pattern.模板方法模式.abstracts.facade;

import com.wangy.pattern.模板方法模式.abstracts.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Dripping Caffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

}
