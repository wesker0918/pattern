package com.wangy.pattern.适配器模式.interfaces.impl;

import com.wangy.pattern.适配器模式.interfaces.Turkey;

public class WildTurkey implements Turkey{

	public void gobble() {
		System.out.println("Gobble");
	}

	public void fly() {
		System.out.println("I'm flying a short distance");
	}

}
