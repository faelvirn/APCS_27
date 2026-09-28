/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		int num1 = input.nextInt();
		System.out.print("Please enter your second number: ");
		int num2 = input.nextInt();
		System.out.print("Please enter your third number: ");
		int num3 = input.nextInt();
		if(num1 > num2 && num1 > num3){
			System.out.println("Your first number is the largest of the three!");
			System.out.println("The number was " + num1);
		}
		if(num2 > num1 && num2 > num3){
			System.out.println("Your second number is the largest of the three!");
			System.out.println("The number was " + num2);
		}
		if(num3 > num2 && num3 > num1){
			System.out.println("Your third number is the largest of the three!");
			System.out.println("The number was " + num3);
		}
		if(num1 < num2 && num1 < num3){
			System.out.println("Your first number is the smallest of the three!");
			System.out.println("The number was " + num1);
		}
		if(num2 < num1 && num2 < num3){
			System.out.println("Your second number is the smallest of the three!");
			System.out.println("The number was " + num2);
		}
		if(num3 < num2 && num3 < num1){
			System.out.println("Your third number is the smallest of the three!");
			System.out.println("The number was " + num3);
		}
	}
}
