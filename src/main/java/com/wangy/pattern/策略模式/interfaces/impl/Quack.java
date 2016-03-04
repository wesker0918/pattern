package com.wangy.pattern.策略模式.interfaces.impl;

import com.wangy.pattern.策略模式.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {

	public void quack() {
		System.out.println("Quack");		
	}

}
