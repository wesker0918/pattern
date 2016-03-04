package com.wangy.pattern.装饰者模式.adstracts;

public abstract class Beverage {

	public String description = "Unknown Beverage";
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double cost();
}
