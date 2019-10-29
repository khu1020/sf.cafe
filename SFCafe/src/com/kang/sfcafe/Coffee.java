package com.kang.sfcafe;

public class Coffee {
	private final String name;
	
	public Coffee(MenuItem mi) {
		name = mi.getMenuName();
	}
	
	public String getName() {
		return name;
	}
}
