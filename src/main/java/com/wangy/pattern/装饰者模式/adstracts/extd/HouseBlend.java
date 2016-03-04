package com.wangy.pattern.装饰者模式.adstracts.extd;

import com.wangy.pattern.装饰者模式.adstracts.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.description = "House Blend Coffee";
	}
	
	@Override
	public double cost() {
		return .89;
	}

}
