package com.wangy.pattern.装饰者模式.adstracts.extd;

import com.wangy.pattern.装饰者模式.adstracts.Beverage;
import com.wangy.pattern.装饰者模式.adstracts.CondimentDecorator;

public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " ,with Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + .20;
	}

}
