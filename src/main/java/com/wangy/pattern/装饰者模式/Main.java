package com.wangy.pattern.装饰者模式;

import com.wangy.pattern.装饰者模式.adstracts.Beverage;
import com.wangy.pattern.装饰者模式.adstracts.extd.Espresso;
import com.wangy.pattern.装饰者模式.adstracts.extd.HouseBlend;
import com.wangy.pattern.装饰者模式.adstracts.extd.Mocha;

public class Main {

	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + " $" + espresso.cost());
		
		Beverage houseBlend = new HouseBlend();
		houseBlend = new Mocha(houseBlend);
		System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
	}

}
