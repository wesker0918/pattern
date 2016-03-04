package com.wangy.pattern.组合模式;

import com.wangy.pattern.组合模式.abstracts.MenuComponent;
import com.wangy.pattern.组合模式.abstracts.facade.Menu;
import com.wangy.pattern.组合模式.abstracts.facade.MenuItem;

public class Main {

	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course");

		MenuComponent allMenus = new Menu("All Menus", "All menus combined");

		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);

		pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with Scrambled eggs, and toast", true, 2.99));
		dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin)Bacon with lettuce & tomato on whole wheat", true, 2.89));
		cafeMenu.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", false, 4.99));
		dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));
		dinerMenu.add(dessertMenu);
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
		waitress.printVegetarianMenu();
	}

}
