/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = input.nextLine();
		System.out.print("What is your title? ");
		String title = input.nextLine();
		System.out.println("Do you want to be a wizard, warrior, or rogue?");
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
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constituation, and Charisma. Spend them wisely.");
		int points = 20;
		System.out.println("");
		System.out.print("Strength (1-10): ");
		int strength = input.nextInt();
		if(strength > 10){
			System.out.println("The maximum amount of points is 10");
			strength = input.nextInt();
		}
		else if(strength < 1)[
			System.out.println("The minimum amount of points is 1");
			strength = input.nextInt();
		]
		points = points-strength;
		System.out.println("You have " + points + " left to spend");
		System.out.print("Dexterity (1-10): ");
		int dexterity = input.nextInt();
		if(dexterity > 10){
			System.out.println("The maximum amount of points is 10");
			dexterity = input.nextInt();
		}
		else if(dexterity < 1)[
			System.out.println("The minimum amount of points is 1");
			dexterity = input.nextInt();
		]
		points = points-dexterity;
		System.out.println("You have " + points + " left to spend");
		System.out.print("Intelligence (1-10): ");
		int intelligence = input.nextInt();
		if(intelligence > 10){
			System.out.println("The maximum amount of points is 10");
			intelligence = input.nextInt();
		}
		else if(intelligence < 1)[
			System.out.println("The minimum amount of points is 1");
			intelligence = input.nextInt();
		]
		points = points-intelligence;
		System.out.println("You have " + points + " left to spend");
		System.out.print("Charisma (1-10): ");
		int charisma = input.nextInt();
		if(charisma > 10){
			System.out.println("The maximum amount of points is 10");
			charisma = input.nextInt();
		}
		else if(charisma < 1)[
			System.out.println("The minimum amount of points is 1");
			charisma = input.nextInt();
		]
		points = points-charisma;
		System.out.println("You have " + points + " left to spend");
		System.out.println("Strength (1-10): " + strength + "\nDexterity (1-10): " + dexterity + "\nIntelligence (1-10): " + intelligence + "\nCharisma (1-10): " + charisma);
		System.out.println("------------------------------");
		System.out.println("You are " + name + ", the " + title + " of CVHS");
		System.out.println("You are a " + warrior + " with the following stats!");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Charisma - " + charisma);
		System.out.println("Good luck on your quest, " + name + "!");
	}
}
