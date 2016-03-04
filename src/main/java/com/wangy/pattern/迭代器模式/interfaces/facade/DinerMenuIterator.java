package com.wangy.pattern.迭代器模式.interfaces.facade;

import com.wangy.pattern.迭代器模式.MenuItem;
import com.wangy.pattern.迭代器模式.interfaces.Iterator;

public class DinerMenuIterator implements Iterator {

	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	public Object next() {
		return items[position++];
	}

}
