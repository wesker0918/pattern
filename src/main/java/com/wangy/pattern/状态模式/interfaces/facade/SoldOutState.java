package com.wangy.pattern.状态模式.interfaces.facade;

import com.wangy.pattern.状态模式.GumballMachine;
import com.wangy.pattern.状态模式.interfaces.State;

public class SoldOutState implements State {

	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void insertQuarter() {
		// TODO Auto-generated method stub

	}

	public void ejectQuarter() {
		// TODO Auto-generated method stub

	}

	public void turnCrank() {
		// TODO Auto-generated method stub

	}

	public void dispense() {
		// TODO Auto-generated method stub

	}

}
