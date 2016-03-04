package com.wangy.pattern.状态模式;

import com.wangy.pattern.状态模式.interfaces.State;
import com.wangy.pattern.状态模式.interfaces.facade.HasQuarterState;
import com.wangy.pattern.状态模式.interfaces.facade.NoQuarterState;
import com.wangy.pattern.状态模式.interfaces.facade.SoldOutState;
import com.wangy.pattern.状态模式.interfaces.facade.SoldState;

public class GumballMachine {
	
	public State soldOutState;
	public State noQuarterState;
	public State hasQuarterState;
	public State soldState;
	
	public State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int numberGumballs) {
		this.soldOutState = new SoldOutState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.soldState = new SoldState(this);
		this.count = numberGumballs;
		if(numberGumballs > 0) {
			this.state = this.noQuarterState;
		}
	}
	
	public void insertQuarter() {
		this.state.insertQuarter();
	}

	public void ejectQuarter() {
		this.state.ejectQuarter();
	}

	public void turnCrank() {
		this.state.turnCrank();
		this.state.dispense();
	}
	
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if(count != 0) {
			count = count - 1;
		}
	}

	// getter & setter
	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
