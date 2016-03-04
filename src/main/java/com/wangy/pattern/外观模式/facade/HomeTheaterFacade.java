package com.wangy.pattern.外观模式.facade;

import com.wangy.pattern.外观模式.Amplifler;
import com.wangy.pattern.外观模式.DvdPlayer;
import com.wangy.pattern.外观模式.PopcornPopper;
import com.wangy.pattern.外观模式.Projector;
import com.wangy.pattern.外观模式.Screen;
import com.wangy.pattern.外观模式.TheaterLights;

public class HomeTheaterFacade {

	Amplifler amp;
	DvdPlayer dvd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;
	
	public HomeTheaterFacade(Amplifler amp, DvdPlayer dvd, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
		this.amp = amp;
		this.dvd = dvd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}
	
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		this.popper.on();
		this.popper.pop();
		this.lights.dim(10);
		this.screen.down();
		this.projector.on();
		this.projector.wideScreenMode();
		this.amp.on();
		this.amp.setDvd(dvd);
		this.amp.setVolume(5);
		this.dvd.on();
		this.dvd.play(movie);
	}
	
	public void endMovie() {
		System.out.println("\nShutting movie theater down...");
		this.popper.off();
		this.lights.on();
		this.screen.up();
		this.projector.off();
		this.amp.off();
		this.dvd.stop();
		this.dvd.eject();
		this.dvd.off();
	}
}
