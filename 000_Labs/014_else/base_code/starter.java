/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Pick a number between 1 - 1000: ");
		int guess = input.nextInt();
		int number = (int)(Math.random()*1000)+1;
		if(guess == number){
			System.out.println("You guessed the number!!!");
		}
		else{
			System.out.println("Your number wasn't the random number. The number was " + number);
		}
	}
}
