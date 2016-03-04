package com.wangy.pattern.迭代器模式;

import com.wangy.pattern.迭代器模式.interfaces.Iterator;
import com.wangy.pattern.迭代器模式.interfaces.facade.DinerMenuIterator;

public class DinerMenu {

	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		this.addItem("Vegetarian BLT", 
				"(Fakin)Bacon with lettuce & tomato on whole wheat", 
				true, 
				2.99);
		this.addItem("BLT", 
				"Bacon with lettuce & tomato on whole wheat", 
				false, 
				2.99);
	}
	
	private void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS) {
			System.out.println("Sorry, menu is full!");
		} else {
			menuItems[numberOfItems++] = menuItem;
		}
	}
	
	@Deprecated
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
	
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
	
}
