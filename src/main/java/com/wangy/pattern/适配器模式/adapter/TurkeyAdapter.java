package com.wangy.pattern.适配器模式.adapter;

import com.wangy.pattern.适配器模式.interfaces.Duck;
import com.wangy.pattern.适配器模式.interfaces.Turkey;

public class TurkeyAdapter implements Duck {

	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	public void quack() {
		this.turkey.gobble();
		this.turkey.gobble();
	}

	public void fly() {
		for(int i = 0; i < 5; i++) {
			this.turkey.fly();
		}
	}

}
