/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner input = new Scanner(System.in);
		BankAccount setup = new BankAccount();
		setup.setUpNumber();
		System.out.println("Would you like to set up a bank account?");
		String answer = input.nextLine();
		if(answer.equalsIgnoreCase("Yes")){
			System.out.println("Would you like to make the account in your name?");
			String type = input.nextLine();
			if(type.equalsIgnoreCase("Yes")){
				System.out.println("What is your name?");
				String name = input.nextLine();
				System.out.println("Would you like to make an initial deposit?");
				type = input.nextLine();
				if(type.equalsIgnoreCase("Yes")){
					System.out.println("How much would you like to deposit?");
					int deposit = input.nextInt();
					System.out.println(deposit);
					BankAccount user = new BankAccount(name, deposit);
					System.out.println("You made a bank account");
					System.out.println("Would you like to check your account information?");
					answer = input.nextLine();
					answer = input.nextLine();
					if(answer.equalsIgnoreCase("Yes")){
						user.displayAccountInfo();
					}
					System.out.println("Would you like to check your balance?");
					answer = input.nextLine();
					if(answer.equalsIgnoreCase("Yes")){
						user.checkBalance();
					}
				}
				else{
					BankAccount user = new BankAccount(name);
					System.out.println("You made a bank account");
					System.out.println("Would you like to check your account information?");
					answer = input.nextLine();
					if(answer.equalsIgnoreCase("Yes")){
						user.displayAccountInfo();
					}
					System.out.println("Would you like to check your balance?");
					answer = input.nextLine();
					if(answer.equalsIgnoreCase("Yes")){
						user.checkBalance();
					}
				}
			}
			else{
				BankAccount user = new BankAccount();
				System.out.println("You made a bank account");
				System.out.println("Would you like to check your account information?");
				answer = input.nextLine();
				if(answer.equalsIgnoreCase("Yes")){
					user.displayAccountInfo();
				}
				System.out.println("Would you like to check your balance?");
				answer = input.nextLine();
				if(answer.equalsIgnoreCase("Yes")){
					user.checkBalance();
				}
			}
		}
	}
}
