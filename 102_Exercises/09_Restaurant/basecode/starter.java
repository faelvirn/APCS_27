/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner input = new Scanner(System.in);

		System.out.println("=================================");
		System.out.println("WELCOME RESTAURANT OWNER");
		System.out.println("=================================");
		System.out.println("What's the name of the restaurant?");
		String name = input.nextLine();
		System.out.println("What's your name?");
		String personName = input.nextLine();
		System.out.println("Great to meet you, " + personName + "! Let's set up a menu for " + name);
		System.out.println("Tonight, we have 3 items");
		System.out.println("--- Item #1 ---");
		System.out.print("Item name: ");
		String itemName1 = input.nextLine();
		System.out.print("Price of " + itemName1 + " ($): ");
		double price1 = input.nextDouble();
		System.out.print("How many " + itemName1 + " would you like? ");
		int amount1 = input.nextInt();
		double sum1 = amount1*price1;
		System.out.println("Added " + amount1 + " " + itemName1 + " to your order! ($" + sum1 + ")");
		System.out.println("--- Item #2 ---");	
		System.out.print("Item name: ");
		String itemName2 = input.nextLine();
		itemName2 = input.nextLine();
		System.out.print("Price of " + itemName2 + " ($): ");
		double price2 = input.nextDouble();
		System.out.print("How many " + itemName2 + " would you like? ");
		int amount2 = input.nextInt();
		double sum2 = amount2*price2;
		System.out.println("Added " + amount2 + " " + itemName2 + " to your order! ($" + sum2 + ")");
		System.out.println("--- Item #3 ---");
		System.out.print("Item name: ");
		String itemName3 = input.nextLine();
		itemName3 = input.nextLine();
		System.out.print("Price of " + itemName3 + " ($): ");
		double price3 = input.nextDouble();
		System.out.print("How many " + itemName3 + " would you like? ");
		int amount3 = input.nextInt();
		double sum3 = amount3*price3;
		System.out.println("Added " + amount3 + " " + itemName3 + " to your order! ($" + sum3 + ")");
		System.out.print("What percent tip do you want to leave? ");
		int tip = input.nextInt();
		double tipmoney = (tip*0.01)*(sum1+sum2+sum3);
		System.out.println("Your tip is $" + tipmoney);
		double tax = 0.0975*(sum1+sum2+sum3);
		System.out.println("=================================");	
		System.out.println(name + " - Menu For Today");
		System.out.println("=================================");	
		System.out.println("Owner: " + personName);
		System.out.println("---------------------------------");	
		System.out.println("Item            Qty      Price");
		System.out.println(itemName1 + "          " + amount1 + "     " + price1);
		System.out.println(itemName2 + "          " + amount2 + "     " + price2);
		System.out.println(itemName3 + "          " + amount3 + "     " + price3);
		System.out.println("Subtotal:                   " + (sum1+sum2+sum3));
		System.out.println("Tax (9.75%):                  " + tax);
		System.out.println("Tip:                    " + tip);
		System.out.println("Tip Amount:                " + tipmoney);
		System.out.println("=================================");	
		double sum = (sum1+sum2+sum3);
		double totalsum = sum+tipmoney+tax;
		System.out.println("TOTAL:                   " + totalsum);
		System.out.println("=================================");	
		System.out.println("Thanks for eating at " + name + "!");
		System.out.println("Come back soon -- we'll always have a byte for you!");
	}
}
