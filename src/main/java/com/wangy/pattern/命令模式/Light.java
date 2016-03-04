package com.wangy.pattern.命令模式;

public class Light {

	String name;
	
	public Light(String name) {
		this.name = name;
	}
	
	public void on() {
		System.out.println(this.name + "'s Light is on");
	}
	
	public void off() {
		System.out.println(this.name + "'s Light is off");
	}
}
