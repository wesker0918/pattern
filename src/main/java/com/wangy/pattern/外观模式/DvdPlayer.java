package com.wangy.pattern.外观模式;

public class DvdPlayer {

	public void on() {
		System.out.println("Dvd on");
	}
	
	public void play(String movie) {
		System.out.println("Dvd play:" + movie);
	}
	
	public void stop() {
		System.out.println("Dvd stop");
	}
	
	public void eject() {
		System.out.println("Dvd eject");
	}
	
	public void off() {
		System.out.println("Dvd off");
	}
	
	public String toString() {
		return "Dvd Player";
	}
}
