package com.kang.sfcafe;

public class MenuItem {
	private final String menuName;
	private final int menuPrice;
	
	public MenuItem(String menuName, int menuPrice) {
		this.menuName = menuName;
		this.menuPrice = menuPrice;
	}
	
	public String getMenuName() {
		return this.menuName;
	}
	
	public int getMenuPrice() {
		return this.menuPrice;
	}
}
