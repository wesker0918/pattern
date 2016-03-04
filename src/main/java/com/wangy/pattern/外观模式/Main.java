package com.wangy.pattern.外观模式;

import com.wangy.pattern.外观模式.facade.HomeTheaterFacade;

public class Main {

	public static void main(String[] args) {
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Amplifler(), new DvdPlayer(), new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());
		homeTheater.watchMovie("Raiders of the Lost ark");
		homeTheater.endMovie();
	}

}
