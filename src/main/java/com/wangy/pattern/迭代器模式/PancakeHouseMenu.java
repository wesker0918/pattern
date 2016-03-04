package com.wangy.pattern.迭代器模式;

import java.util.ArrayList;
import java.util.List;

import com.wangy.pattern.迭代器模式.interfaces.Iterator;
import com.wangy.pattern.迭代器模式.interfaces.facade.PancakeHouseMenuIterator;

public class PancakeHouseMenu {

	List<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		this.addItem("K&B's Pancake Breakfast",
				"Pancakes with Scrambled eggs, and toast",
				true,
				2.99);
		this.addItem("Regular Pancket Breakfast", 
				"Pancakes with fried eggs, sausage", 
				false, 
				2.99);
	}
	
	private void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	@Deprecated
	public List<MenuItem> getMenuItems() {
		return menuItems;
	}
	
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
}
