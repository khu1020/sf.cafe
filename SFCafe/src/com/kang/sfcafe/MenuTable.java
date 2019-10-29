package com.kang.sfcafe;

import java.util.*;

public class MenuTable {
	private List<MenuItem> menuTable = new ArrayList();
	
	public MenuTable () {
		menuTable.add(new MenuItem("아메리카노", 1500));
		menuTable.add(new MenuItem("카푸치노", 2000));
		menuTable.add(new MenuItem("카라멜 마끼야또", 2500));
		menuTable.add(new MenuItem("에스프레소", 3000));
	}
}
