package com.wangy.pattern.适配器模式;

import com.wangy.pattern.适配器模式.adapter.TurkeyAdapter;
import com.wangy.pattern.适配器模式.interfaces.Duck;
import com.wangy.pattern.适配器模式.interfaces.impl.MallardDuck;
import com.wangy.pattern.适配器模式.interfaces.impl.WildTurkey;

public class Main {

	public static void main(String[] args) {
		System.out.println("Test Duck:");
		MallardDuck mallardDuck = new MallardDuck();
		Main.testDuck(mallardDuck);
		
		System.out.println("\nTest Turkey:");
		WildTurkey turkey = new WildTurkey();
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nTest adapter:");
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		Main.testDuck(turkeyAdapter);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
