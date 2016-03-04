package com.wangy.pattern.策略模式;

import com.wangy.pattern.策略模式.abstracts.Duck;
import com.wangy.pattern.策略模式.abstracts.extd.MarllarDuck;
import com.wangy.pattern.策略模式.interfaces.impl.FlyNoWay;

public class Main {

	public static void main(String[] args) {
		Duck duck = new MarllarDuck();
		duck.display();
		duck.performFly();
		duck.performQuack();
		duck.setFlyBehavior(new FlyNoWay());
		duck.performFly();
	}

}
