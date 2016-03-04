package com.wangy.pattern.工厂模式.abstracts;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	public String name;
	public String dough;
	public String sauce;
	public List<String> toppings = new ArrayList<String>();
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings:");
		for(String topping: toppings) {
			System.out.println("\t" + topping);
		}
	}
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName() {
		return name;
	}
}
