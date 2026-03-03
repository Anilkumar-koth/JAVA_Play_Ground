package com.learning.basicConcepts;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		//Printing Numbers from 1 to 10
		for (int i = 0; i <=2; i++) {
			System.out.println(i);
		}
		//Printing "Hello World" Multiple Times times will be gven by user
		System.out.println("given the number to print the message");
		Scanner sc = new Scanner(System.in);
		int numberOfTimes = sc.nextInt();
		for (int i = 1; i <=numberOfTimes; i++) {
			System.out.println(i + " Hello world");
		}
		//Calculating Sum from 1 to 20
		
		int total = 0;
		for (int i = 1; i <=20; i++) {
			 total+=i;
		}
		System.out.println("total sum == "+total);
	}

}
