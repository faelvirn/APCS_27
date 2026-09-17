/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter an integer: ");
		int num1 = input.nextInt();
		System.out.print("Please enter another integer: ");
		int num2 = input.nextInt();
		if(num1%2 = 0){
			System.out.println(num1 + " is divisible by 2!");
		}
		else{
			System.out.println(num1 + " is not divisible by 2!");
		}
		if(num1%3=0){
			System.out.print(num1 + " is divisible by 3");
			if(num1%4=0){
				System.out.print(" and 4");
			}
			else{
				System.out.println(num1 + " is not divisible by 4");
			}
			if(num1%5=0){
				System.out.println(" and 5");
			}
		}
		else if(num1%4=0){
			System.out.print(num1 + " is divisible by 4");
			if(num1%5=0){
				System.out.println(" and 5");
			}
		}
		else{
			System.out.print(num1 + " is not divisible by 3");
		}
		
		else{
			System.out.print(num1 + "4, ");
		}
	}
}
