package com.wangy.pattern.命令模式;

import com.wangy.pattern.命令模式.interfaces.Command;
import com.wangy.pattern.命令模式.interfaces.impl.LightOffCommand;
import com.wangy.pattern.命令模式.interfaces.impl.LightOnCommand;

public class Main {

	public static void main(String[] args) {
		System.out.println("SimpleRemoteControl:");
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light("Living Room");
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		remote.setCommand(lightOnCommand);
		remote.buttonWasPressed();
		
		System.out.println("\nRemoteControl:");
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("kitchen");
		Command livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		Command livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
		Command kitchenLightOnCommand = new LightOnCommand(kitchenLight);
		Command kitchenLightOffCommand = new LightOffCommand(kitchenLight);
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
	}

}
