package com.wangy.pattern.策略模式.abstracts;

import com.wangy.pattern.策略模式.interfaces.FlyBehavior;
import com.wangy.pattern.策略模式.interfaces.QuackBehavior;

public abstract class Duck {

	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public abstract void display();

	// getter&setter
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
