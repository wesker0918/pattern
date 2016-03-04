package com.wangy.pattern.组合模式;

import java.util.Iterator;

import com.wangy.pattern.组合模式.abstracts.MenuComponent;

public class NullIterator implements Iterator<MenuComponent> {

	public boolean hasNext() {
		return false;
	}

	public MenuComponent next() {
		return null;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
