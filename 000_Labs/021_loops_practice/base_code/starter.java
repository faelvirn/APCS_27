/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int guess = 0;
		int number = (int)(Math.random()*1000)+1;;
		while(guess != number){
			System.out.print("Pick a number between 1 - 1000: ");
			guess = input.nextInt();
			if(guess == number){
				System.out.println("You guessed the number!!!");
			}
			else if(guess < number){
				System.out.println("Your number was smaller than the random numer");
			}
			else if(guess > number){
				System.out.println("Your number was bigger than the random numer");
			}
		}
	}
}
