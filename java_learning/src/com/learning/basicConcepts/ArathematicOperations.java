package com.learning.basicConcepts;

import java.util.Scanner;

public class ArathematicOperations{
	
	public static void main(String[] args) {
		
		//DO All Arthimatic operations on two int type variables
		System.out.println("give the numbers");
		Scanner sc = new Scanner (System.in);
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int result = number1 + number2;
		System.out.println(number1 + "+" +number2 + "="+ result);
		
		int result2 = number1 - number2;
		System.out.println(number1 + "-" +number2 + "="+ result2);
		
		int result3 = number1 * number2;
		System.out.println(number1 + "*" +number2 + "="+ result3);

		int result4 = number1 % number2;
		System.out.println(number1 + "%" +number2 + "="+ result4);
		
		int result5 = number1 / number2;
		System.out.println(number1 + "/" +number2 + "="+ result5);
		
				//DO All Arthimatic operations on one int type variables and one float type
				System.out.println("give the numbers one is integer and other is float");
				
				int intTypeNumber = sc.nextInt();
				float floatTypeNumber = sc.nextFloat();
				float iFresult = intTypeNumber + floatTypeNumber;
				System.out.println(intTypeNumber + "+" +floatTypeNumber + "="+ iFresult);
				
				int iFresult2 = intTypeNumber - intTypeNumber;
				System.out.println(intTypeNumber + "-" +floatTypeNumber + "="+ iFresult2);
				
				float iFresult3 = intTypeNumber * floatTypeNumber;
				System.out.println(intTypeNumber + "*" +floatTypeNumber + "="+ iFresult3);

				float iFresult4 = intTypeNumber % floatTypeNumber;
				System.out.println(intTypeNumber + "%" +floatTypeNumber + "="+ iFresult4);
				
				float iFresult5 = intTypeNumber / floatTypeNumber;
				System.out.println(intTypeNumber + "/" +floatTypeNumber + "="+ iFresult5);

	}
}