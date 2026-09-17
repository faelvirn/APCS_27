/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class store {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		System.out.println("=================================");
		System.out.println("WELCOME RESTAURANT OWNER");
		System.out.println("=================================");
		System.out.println("What's the name of the restaurant?");
		String name = input.nextLine();
		System.out.println("What's your name?");
		String personName = input.nextLine();
		System.out.println("Great to meet you, " + personName + "! Let's set up a menu for " + name);
		System.out.println("You have $1000 to buy food");
		double money = 1000;
		System.out.println("Tonight, we have 3 items");
		System.out.println("--- Item #1 ---");
		System.out.print("Item name: ");
		String itemName1 = input.nextLine();
		System.out.print("Price of " + itemName1 + " ($): ");
		double price1 = input.nextDouble();
		double pricesell1 = price1*1.2;
		System.out.println("You can sell " + itemName1 + " for " + pricesell1);
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
		double pricesell2 = price2*1.2;
		System.out.println("You can sell " + itemName2 + " for " + pricesell2);
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
		double pricesell3 = price3 *1.2;
		System.out.println("You can sell " + itemName3 + " for " + pricesell3);
		System.out.print("How many " + itemName3 + " would you like? ");
		int amount3 = input.nextInt();
		double sum3 = amount3*price3;
		System.out.println("Added " + amount3 + " " + itemName3 + " to your order! ($" + sum3 + ")");
		double tax = 0.0975*(sum1+sum2+sum3);
		System.out.println("=================================");	
		System.out.println(name + " - Costs For Today");
		System.out.println("=================================");	
		System.out.println("Owner: " + personName);
		System.out.println("---------------------------------");	
		System.out.println("Item            Qty      Price");
		System.out.println(itemName1 + "              " + amount1 + "     " + sum1);
		System.out.println(itemName2 + "              " + amount2 + "     " + sum2);
		System.out.println(itemName3 + "              " + amount3 + "     " + sum3);
		System.out.println("Subtotal:                   " + (sum1+sum2+sum3));
		System.out.println("Tax (9.75%):                  " + tax);
		System.out.println("=================================");	
		double sum = (sum1+sum2+sum3);
		double totalsum = sum+tax;
		System.out.println("TOTAL:                   " + totalsum);
		System.out.println("=================================");
		money = money-totalsum;	
		System.out.println("You have $" + money);
		System.out.println("DAY");
		System.out.println("When do you open (use 24-hour clock, put 30s and 15s as decimals)");
		double open = input.nextDouble();
		System.out.println("When do you close?");
		double close = input.nextDouble();
		int amount1sold = 0;
		int amount2sold = 0;
		int amount3sold = 0;
		for(int i = (int)open; i < close; i++){
			System.out.println(i + " O'CLOCK");
			int customers = random.nextInt(6);
			System.out.println(customers + " customer(s) come in");
			for(int j = 0; j < customers; j++){
				int buy = random.nextInt(3);
				if(buy == 0){
					System.out.println("A customer bought " + itemName1 + " for $" + pricesell1);
					money = money+pricesell1;
					amount1--;
					amount1sold ++;
					if(amount1<0){
						amount1 = 0;
					}
					if(amount1==0){
						System.out.println("You don't have any of that to sell");
						money = money-pricesell1;
					}
				}
				if(buy == 1){
					System.out.println("A customer bought " + itemName2 + " for $" + pricesell2);
					money = money+pricesell2;
					amount2--;
					amount2sold++;
					if(amount2<0){
						amount2 = 0;
					}
					if(amount2==0){
						System.out.println("You don't have any of that to sell");
						money = money-pricesell2;
					}
				}
				if(buy == 2){
					System.out.println("A customer bought " + itemName3 + " for $" + pricesell3);
					money = money+pricesell3;
					amount3--;
					amount3sold++;
					if(amount3<0){
						amount3 = 0;
					}
					if(amount3==0){
						System.out.println("You don't have any of that to sell");
						money = money-pricesell3;
					}
				}
			}
		}
		System.out.println("=================================");	
		System.out.println(name + " - Menu For Today");
		System.out.println("=================================");	
		System.out.println("Owner: " + personName);
		System.out.println("---------------------------------");	
		System.out.println("Item            Qty      Price");
		System.out.println(itemName1 + "              " + amount1sold + "     " + (amount1sold * pricesell1));
		System.out.println(itemName2 + "              " + amount2sold + "     " + (amount2sold * pricesell2));
		System.out.println(itemName3 + "              " + amount3sold + "     " + (amount3sold * pricesell3));
		System.out.println("TOTAL:                   " + ((amount1sold * pricesell1)+(amount2sold * pricesell2)+(amount3sold * pricesell3)));
		System.out.println("=================================");
		System.out.println("You have $" + money);
	}
}
