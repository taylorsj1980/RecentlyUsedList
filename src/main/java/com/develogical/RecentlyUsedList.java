package com.develogical;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {

	List<String> items;

	public RecentlyUsedList() {
		items = new ArrayList<String>();
	}

	public boolean isEmpty() {
		return items.isEmpty();
	}

	public void add(String name) {
		items.add(name);
	}

	public String get(int idx) {
		return items.get(items.size() - idx);
	}
}
