package com.wangy.pattern.模板方法模式.abstracts.facade;

import com.wangy.pattern.模板方法模式.abstracts.CaffeineBeverage;

public class Tea extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}

}
