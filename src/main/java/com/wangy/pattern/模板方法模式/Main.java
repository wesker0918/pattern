package com.wangy.pattern.模板方法模式;

import com.wangy.pattern.模板方法模式.abstracts.facade.CoffeeWithHook;
import com.wangy.pattern.模板方法模式.abstracts.facade.Tea;

public class Main {

	public static void main(String[] args) {
		System.out.println("Making Tea:");
		Tea tea = new Tea();
		tea.prepareRecipe();
		
		System.out.println("\nMaking Coffee:");
		CoffeeWithHook coffee = new CoffeeWithHook();
		coffee.prepareRecipe();
	}

}
