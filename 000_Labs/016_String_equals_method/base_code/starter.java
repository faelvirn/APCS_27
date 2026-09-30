/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		//you're testing me mr. poole
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to be a wizard, warrior, or rogue?");
		String charClass = input.nextLine();
		System.out.println("You've chosen the " + charClass + "!");
		if(charClass.equalsIgnoreCase("wizard")){
			System.out.println("Excelsior!");
		}
		if(charClass.equalsIgnoreCase("warrior")){
			System.out.println("For honor!");
		}
		if(charClass.equalsIgnoreCase("Rogue")){
			System.out.println("How cunning!");
		}
		else{
			System.out.println("Man, just pick a class");
		}
	}
}
