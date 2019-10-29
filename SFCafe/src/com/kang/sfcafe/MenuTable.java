package com.kang.sfcafe;

import java.util.*;

public class MenuTable {
	private List<MenuItem> menus = new ArrayList();
	
	public MenuTable () {
		menus.add(new MenuItem("아메리카노", 1500));
		menus.add(new MenuItem("카푸치노", 2000));
		menus.add(new MenuItem("카라멜 마키아또", 2500));
		menus.add(new MenuItem("에스프레소", 3000));
	}
	
	public void showMenus() {
		System.out.printf("------- MENU -------\n");
		for(int i = 0; i < menus.size(); i++) {
			MenuItem m = menus.get(i);
			System.out.printf("%d. %s - (%,d원) \n", (i+1), m.getMenuName(), m.getMenuPrice());
		}
		System.out.printf("--------------------\n");
	}
	
	public MenuItem choiceMenu(int idx) {
		if((idx-1) < 0 || (idx-1) >= menus.size()) {
			System.out.print("올바르지 않는 입력입니다.\n");
			return null;
		}
		return menus.get(idx - 1);
	}
}
