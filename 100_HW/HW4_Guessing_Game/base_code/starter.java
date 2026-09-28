/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("The goal of the game is to guess a word with two hints!");
		int random = (int)(Math.random()*3)+1;
		String answer = "Something";
		if(random == 1){
			System.out.println("It's a fruit!");
			answer = "apple";
		}
		if(random == 2){
			System.out.println("It's a furry animal!");
			answer = "cat";
		}
		if(random == 3){
			System.out.println("It's a planet in our solar system");
			answer = "Earth";
		}
		System.out.print("What is your guess? ");
		String guess = input.nextLine();
		if(guess.equalsIgnoreCase(answer)){
			System.out.println("You got it! Woo!");
		}
		else{
			System.out.println("You sadly didn't guess right, here's another hint!");
			if(random == 1){
				System.out.println("It's a red fruit!");
			}
			if(random == 2){
				System.out.println("It's a feline friend!");
			}
			if(random == 3){
				System.out.println("It's the only one with humans on it!");
			}
			guess = input.nextLine();
			if(guess.equalsIgnoreCase(answer)){
				System.out.println("You got it! Woo! ");
			}
			else{
				System.out.println("The answer was " + answer + ", better luck next time!");
			}
		}
	}
	
	}
