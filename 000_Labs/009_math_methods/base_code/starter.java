/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		double max = Math.max(13 - 6 * 11, 30 % 7 * (-2));
		double root = Math.sqrt(3 * 8 + 31 % 7);
		double pow = Math.pow(37 / 3, 35 % 21);
		double complex = Math.max(Math.pow(2,14%3) , Math.sqrt (2*6));
		System.out.println(max + " " + root + " " + pow + " "  + complex); 

		Scanner input = new Scanner(System.in);
		System.out.println("give me two decimals");
		double num1 = input.nextDouble(); 
		double num2 = input.nextDouble(); 
		double max2 = Math.max(num1, num2);
		System.out.println(max2);
		double root2 = Math.sqrt(num2);
		System.out.println(root2);
		double pow2 = Math.pow(num1, num2);
		System.out.println(pow2);
	}
}
