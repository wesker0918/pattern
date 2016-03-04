package com.wangy.pattern.外观模式;

public class Projector {

	public void on() {
		System.out.println("Projector on");
	}
	
	public void wideScreenMode() {
		System.out.println("Projector wideScreenMode");
	}
	
	public void off() {
		System.out.println("Projector off");
	}
}
