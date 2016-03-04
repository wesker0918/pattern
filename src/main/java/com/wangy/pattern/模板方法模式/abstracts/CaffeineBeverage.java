package com.wangy.pattern.模板方法模式.abstracts;

public abstract class CaffeineBeverage {

	public final void prepareRecipe() {
		this.boilWater();
		this.brew();
		this.pourInCup();
		this.addCondiments();
	}
	
	public abstract void brew();
	
	public abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling water");
	}
	
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
