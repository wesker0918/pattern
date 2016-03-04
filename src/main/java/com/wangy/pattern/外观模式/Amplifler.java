package com.wangy.pattern.外观模式;

public class Amplifler {

	public void on() {
		System.out.println("Amp on");
	}
	
	public void setDvd(DvdPlayer dvd) {
		System.out.println("Amp setDvd:" + dvd);
	}
	
	public void setVolume(int volume) {
		System.out.println("Amp set volume:" + volume);
	}
	
	public void off() {
		System.out.println("Amp off");
	}
}
