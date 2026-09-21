/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer: ");
		int num1 = input.nextInt();
		System.out.print("Please enter another integer (bad and worst, bigger than the first):");
		int num2 = input.nextInt();
		System.out.println("Your range is " + num1 + " to " + num2 + ".");
		System.out.println("Here are 5 numbers generated in that range");
		int ran1 = (int)(Math.random()*(num2-num1)+num1);
		int ran2 = (int)(Math.random()*(num2-num1)+num1);
		int ran3 = (int)(Math.random()*(num2-num1)+num1);
		int ran4 = (int)(Math.random()*(num2-num1)+num1);
		int ran5 = (int)(Math.random()*(num2-num1)+num1);
		System.out.println(ran1 + ", " + ran2 + ", " + ran3 + ", " + ran4 + ", " + ran5);
	}
}
