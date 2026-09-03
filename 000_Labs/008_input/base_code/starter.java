/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name?"); 
		String name = input.nextString();
		System.out.print("How old are you?"); 
		int age = input.nextInt();
		System.out.print("What is the month you were born in?");
		String month = input.nextString();
		System.out.print("What day were your born on?");
		int day = input.nextInt();
		System.out.println("What year were your born?");
		int year = input.nextInt();
		System.out.print("How much is a buck fifty?"); 
		double money = input.nextDouble();
		System.out.println("you are" + name + ", " + age + "years old. You were born on " +);
	}
}
