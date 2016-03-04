package com.wangy.pattern.命令模式;

import com.wangy.pattern.命令模式.interfaces.Command;

public class SimpleRemoteControl {

	public Command slot;
	
	public SimpleRemoteControl() {
	}
	
	public void setCommand(Command command) {
		this.slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
