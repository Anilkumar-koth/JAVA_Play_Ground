package com.learning.basicConcepts;

import java.util.Scanner;

public class NestedForLoops {

	public static void main(String[] args) {
		//Write a program to generate the following output
//		*
//		* #
//		* # *
//		* # * #
//		* # * # *
		int i;
		int j;
		System.out.println("give the number to print how many rows needed");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for ( i = 1; i <= number ; i++) {
			for ( j = 1; j <= i; j++) {
				//System.out.print("#");
				if(j % 2 == 0 ) {
					System.out.print("# ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		//Write a program to print the series given below. 5 55 555 5555 55555 555555
		for ( i = 1; i <= number ; i++) {
			for ( j = 1; j <= i; j++) {
				System.out.print("5");
			}
			System.out.print(" ");
		}
		//Write a program in Java to display the following patterns.
//		1
//		2  3
//		4  5  6
//		7  8  9  10
//		11 12 13 14 15
		System.out.println();
		int count = 0;
		for ( i = 1; i <= number ; i++) {
			for ( j = 1; j <= i; j++) {
				count++;
				System.out.print(count +" ");
			}
			System.out.println();
		}
		//Write a program in Java to display the following patterns.
//		1 * * * *
//		* 2 * * *
//		* * 3 * *
//		* * * 4 *
//		* * * * 5
		for ( i = 1; i <= number ; i++) {
			for ( j = 1; j <= number; j++) {
				if(i == j) {
					System.out.print(j+" ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		//Write a program in Java to display the following patterns.
//		#
//		* *
//		# # #
//		* * * * 
//		# # # # #
		for ( i = 1; i <= number ; i++) {
			for ( j = 1; j <= i; j++) {
				if(i % 2== 0) {
					System.out.print("* ");
				}else {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
		//write a program in Java to display the following patterns.
//		1 * * * *
//		2 2 * * *
//		3 3 3 * *
//		4 4 4 4 *
//		5 5 5 5 5
		for ( i = 1; i <= number ; i++) {
			for ( j = 1; j <= i; j++) {
					System.out.print(i+" ");
			}
				for (int k=i; k<= number-1; k++) {
					System.out.print("* ");
				}
			System.out.println();
		}
//		* * * * 5
//		* * * 4
//		* * 3
//		* 2
//		1
		for ( i = number; i >= 1 ; i--) {
			for ( j = 1; j <= i-1; j++) {
					System.out.print("* ");	
			}
			System.out.print(i);
			System.out.println();
		}
//		5 4 3 2 1
//		4 3 2 1
//		3 2 1
//		2 1
//		1
		for ( i = number; i >= 1 ; i--) {
			for ( j = i; j >= 1; j--) {
					System.out.print(j+" ");	
			}
			System.out.println();
		}
		
	}

}
