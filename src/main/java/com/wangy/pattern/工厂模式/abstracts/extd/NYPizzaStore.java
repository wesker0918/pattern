package com.wangy.pattern.工厂模式.abstracts.extd;

import com.wangy.pattern.工厂模式.abstracts.Pizza;
import com.wangy.pattern.工厂模式.abstracts.PizzaStore;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if("cheese".equals(type)) {
			return new NYStyleCheesePizza();
		} else {
			return null;
		}
	}

}
