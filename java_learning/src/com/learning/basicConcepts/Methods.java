package com.learning.basicConcepts;



public class Methods {

	public static void main(String[] args) {
		Methods m = new Methods();
		m.greeting();
		addition();
		
	}
	void greeting() {
		System.out.println("Welcome On board");
	}
	
	public static void addition() {
	int number1 = 10;
	int number2 = 100;
	int result = number1+number2;
	System.out.println(result);
	}
}
