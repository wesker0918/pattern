package com.wangy.pattern.迭代器模式;

import com.wangy.pattern.迭代器模式.interfaces.Iterator;

public class Waitress {

	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		System.out.println("Menu\n-----\nBREAKFAST:");
		printMenu(pancakeIterator);
		
		Iterator dinerIterator = dinerMenu.createIterator();
		System.out.println("\nLUNCH:");
		printMenu(dinerIterator);
	}
	
	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", $");
			System.out.print(menuItem.getPrice() + ", --");
			System.out.println(menuItem.getDescription());
		}
	}
}
