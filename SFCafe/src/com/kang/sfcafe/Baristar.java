package com.kang.sfcafe;

public class Baristar {
	public Coffee makeCoffee(MenuItem mi) {
		switch(mi.getMenuName()) {
		case "아메리카노" :
			return new Americano(mi);
		case "카푸치노" : 
			return new Cappuccino(mi);
		case "카라멜 마키아또" : 
			return new CaramelMacchiato(mi);
		case "에스프레소" : 
			return new Espresso(mi);
		default : 
			return null;
		}
	}
}
