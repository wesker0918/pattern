package com.wangy.pattern.模板方法模式.abstracts.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.wangy.pattern.模板方法模式.abstracts.CaffeineBeverageWithHook;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
	
	@Override
	public boolean isCustomerWantsCondiments() {
		String answer = getUserInput();
		if("y".equals(answer.toLowerCase())) {
			return true;
		} else {
			return false;
		}
	}
	
	private String getUserInput() {
		String answer = null;
		System.out.println("Would you like milk and sugar with you coffee?(y/n)");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IO error trying to read your answer");
		}
		return answer == null? "n": answer;
	}

}
