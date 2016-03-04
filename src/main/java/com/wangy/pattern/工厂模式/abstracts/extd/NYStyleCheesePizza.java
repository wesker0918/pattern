package com.wangy.pattern.工厂模式.abstracts.extd;

import com.wangy.pattern.工厂模式.abstracts.Pizza;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		this.name = "NY Style Sauce and Cheese Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";
		this.toppings.add("Grated Reggiano Cheese");
	} 
}
