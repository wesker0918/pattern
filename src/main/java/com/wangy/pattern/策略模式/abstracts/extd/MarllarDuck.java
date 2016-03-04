package com.wangy.pattern.策略模式.abstracts.extd;

import com.wangy.pattern.策略模式.abstracts.Duck;
import com.wangy.pattern.策略模式.interfaces.FlyBehavior;
import com.wangy.pattern.策略模式.interfaces.QuackBehavior;
import com.wangy.pattern.策略模式.interfaces.impl.FlyWithWings;
import com.wangy.pattern.策略模式.interfaces.impl.Quack;

public class MarllarDuck extends Duck {

	public MarllarDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
	
	//getter & setter
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
