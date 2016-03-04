package com.wangy.pattern.策略模式.interfaces.impl;

import com.wangy.pattern.策略模式.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	public void fly() {
		System.out.println("I can't fly");
	}

}
