package com.wangy.pattern.工厂模式;

import com.wangy.pattern.工厂模式.abstracts.Pizza;
import com.wangy.pattern.工厂模式.abstracts.PizzaStore;
import com.wangy.pattern.工厂模式.abstracts.extd.ChicagoPizzaStore;
import com.wangy.pattern.工厂模式.abstracts.extd.NYPizzaStore;

public class Main {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		Pizza nyStylePizza = nyStore.orderPizza("cheese");
		System.out.println("A ordered a " + nyStylePizza.getName() + "\n");

		PizzaStore chicagoStore = new ChicagoPizzaStore();
		Pizza chicagoStylePizza = chicagoStore.orderPizza("cheese");
		System.out.println("B ordered a " + chicagoStylePizza.getName());
	}

}
