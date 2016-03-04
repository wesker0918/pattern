package com.wangy.pattern.模板方法模式.abstracts;

public abstract class CaffeineBeverageWithHook {

	public void prepareRecipe() {
		this.boilWater();
		this.brew();
		this.pourInCup();
		if(this.isCustomerWantsCondiments()) {
			this.addCondiments();
		}
	}
	
	public abstract void brew();
	
	public abstract void addCondiments();
	
	public void boilWater() {
		System.out.println("Boiling water");
	}
	
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	public boolean isCustomerWantsCondiments() {
		return true;
	}
}
