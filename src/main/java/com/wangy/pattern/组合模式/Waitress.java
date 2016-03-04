package com.wangy.pattern.组合模式;

import java.util.Iterator;

import com.wangy.pattern.组合模式.abstracts.MenuComponent;

public class Waitress {

	MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void printMenu() {
		this.allMenus.print();
	}
	
	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		System.out.println("\nVEGETARIN EMNU\n-----");
		while(iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			try{
				if(menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			}catch(UnsupportedOperationException e) {
				
			}
		}
	}
	
}
