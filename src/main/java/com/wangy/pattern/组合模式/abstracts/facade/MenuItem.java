package com.wangy.pattern.组合模式.abstracts.facade;

import java.util.Iterator;

import com.wangy.pattern.组合模式.NullIterator;
import com.wangy.pattern.组合模式.abstracts.MenuComponent;

public class MenuItem extends MenuComponent {

	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	// getter
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}
	
	@Override
	public void print() {
		System.out.print("\t" + getName());
		if(isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", $" + getPrice());
		System.out.println("\t--" + getDescription());
	}
	
	@Override
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}
	
}
