package com.wangy.pattern.适配器模式.interfaces.impl;

import com.wangy.pattern.适配器模式.interfaces.Duck;

public class MallardDuck implements Duck {

	public void quack() {
		System.out.println("Quack");
	}

	public void fly() {
		System.out.println("I'm flying");
	}

}
