package com.factoryPattern;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Type language English or Myanmar : ");
		String s = sc.nextLine().toLowerCase();
		Greeting greeting = new Greeting();
		Language l = greeting.sayHello(s);
//		Language l = new EnglishGreeting() / new MyanmarGreeting();
		l.greet();
		
	}

}
