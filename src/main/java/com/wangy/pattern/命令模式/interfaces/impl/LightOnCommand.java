package com.wangy.pattern.命令模式.interfaces.impl;

import com.wangy.pattern.命令模式.Light;
import com.wangy.pattern.命令模式.interfaces.Command;

public class LightOnCommand implements Command {

	public Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		this.light.on();
	}
	
}
