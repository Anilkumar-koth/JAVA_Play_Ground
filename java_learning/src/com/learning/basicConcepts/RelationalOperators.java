package com.learning.basicConcepts;

import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {
		System.out.println("Eneter the number to perform relational operations");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		boolean result;
		
		if(number1>number2) {
			System.out.println("Greater than operation");
		}
		
		if(number1<number2) {
			System.out.println("Less than operation");
		}
		
		//Question: Write a program that takes an integer as input and prints whether it is "Even" or "Odd" using the ternary operator.
		//dataType Variable = condition check ? if true exp1 : if false exp2 
		String resulst1 = (number1 % 2 == 0)? "EVEN NUMBER":"ODD NUMBER";
		System.out.println(resulst1);
		
		
		//Check if a number is within a range: Write a program that takes an integer as input and 
		//prints true if the number is between 10 and 20 (inclusive), false otherwise.
		
		System.out.println("Please enter height of the man");
		int heightOfTheMan = sc.nextInt();
		boolean inRange = ((heightOfTheMan > 10) && (heightOfTheMan < 20));
			System.out.println("logical AND "+inRange);
		boolean inRangeOr = ((heightOfTheMan > 10) || (heightOfTheMan < 20));
		System.out.println("logical OR "+inRangeOr);
		
	}

}
