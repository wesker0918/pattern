package com.wangy.pattern.工厂模式.abstracts.extd;

import com.wangy.pattern.工厂模式.abstracts.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		this.name = "Chicago Style Deep Dish Cheese Pizza";
		this.dough = "Extra Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
