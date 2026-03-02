package com.learning.basicConcepts;

import java.util.Scanner;

public class ArathematicOperations{
	
	public static void main(String[] args) {
		
		
		System.out.println("give the number");
		Scanner sc = new Scanner (System.in);
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int result = number1 + number2;
		System.out.println(number1 + "+" +number2 + "="+ result);
		
		int result2 = number1 - number2;
		System.out.println(result2);
		int result3 = number1 * number2;
		System.out.println(result3);

	}
}