package com.factoryPattern;

public class Greeting {
	
	public Language sayHello(String s) {
		if(s.equals("english")) {
			return new EnglishGreeting();
		} else {
			return new MyanmarGreeting();
		}
	}

}
