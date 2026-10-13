/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void printString(String toprint){
		System.out.println(toprint);
	}
	public static void stringCombined(String s1,String s2){
		System.out.println(s1 + " " + s2);
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a phrase");
		String answer = input.nextLine();
		printString(answer);
		System.out.println("Input another phrase");
		String answer1 = input.nextLine();
		System.out.println("Input another another phrase");
		String answer2 = input.nextLine();
		stringCombined(answer1, answer2);
	}
}
