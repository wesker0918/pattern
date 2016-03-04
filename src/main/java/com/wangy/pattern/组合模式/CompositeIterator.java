package com.wangy.pattern.组合模式;

import java.util.Iterator;
import java.util.Stack;

import com.wangy.pattern.组合模式.abstracts.MenuComponent;
import com.wangy.pattern.组合模式.abstracts.facade.Menu;

public class CompositeIterator implements Iterator<MenuComponent> {

	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
	
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}
	
	public boolean hasNext() {
		if(stack.empty()) {
			return false;
		}else {
			Iterator<MenuComponent> iterator = stack.peek();
			if(!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	public MenuComponent next() {
		if(hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			if(component instanceof Menu) {
				stack.push(component.createIterator());
			}
			return component;
		}
		return null;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
