package com.learning.basicConcepts;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the test which you would like to display");
		
		String  userText = sc.next();
		// here we are using next that mean it wont accept space eg if you have given "Hello world" then console will only print hello because next() will not allow spaces.
		System.out.println("input using next()--"+userText);
		
		String  userTextNextLine = sc.nextLine();
		// here we are using nextLine that mean it will accept space eg if you have given "Hello world" then console will print hello world because nextLine() will allow spaces.
		System.out.println("input using nextLine()--"+userTextNextLine);
		
	}

}
