package com.wangy.pattern.状态模式.interfaces.facade;

import com.wangy.pattern.状态模式.GumballMachine;
import com.wangy.pattern.状态模式.interfaces.State;

public class NoQuarterState implements State {

	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		this.gumballMachine.setState(this.gumballMachine.hasQuarterState);
	}

	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	}

	public void dispense() {
		System.out.println("You need to pay first");
	}

}
