package com.wangy.pattern.迭代器模式.interfaces.facade;

import java.util.List;

import com.wangy.pattern.迭代器模式.MenuItem;
import com.wangy.pattern.迭代器模式.interfaces.Iterator;

public class PancakeHouseMenuIterator implements Iterator {

	List<MenuItem> items;
	int position = 0;
	
	public PancakeHouseMenuIterator(List<MenuItem> items) {
		this.items = items;
	}
	
	public boolean hasNext() {
		if(position >= items.size() || items.get(position) == null) {
			return false;
		} else {
			return true;
		}
	}

	public Object next() {
		return items.get(position++);
	}

}
