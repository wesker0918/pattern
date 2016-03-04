package com.wangy.pattern.状态模式.interfaces.facade;

import com.wangy.pattern.状态模式.GumballMachine;
import com.wangy.pattern.状态模式.interfaces.State;

public class HasQuarterState implements State {

	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	public void ejectQuarter() {
		System.out.println("Quarter returned");
		this.gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	public void turnCrank() {
		System.out.println("You turned...");
		this.gumballMachine.setState(this.gumballMachine.getSoldState());
	}

	public void dispense() {
		System.out.println("No gumball dispened");
	}

}
