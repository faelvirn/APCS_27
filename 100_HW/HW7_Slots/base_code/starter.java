/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void gamble(){
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2.Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("  a. If two numbers match, you double your money.");
		System.out.println("  b. If three numbers match, you triple your money.");
		System.out.println("  c. If none match, you lose your money");
		System.out.println("");
		
		Scanner input = new Scanner(System.in);
		int money = 100;

		while(money > 0){
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y) ");
			String slots = input.nextLine();
			if(slots.equalsIgnoreCase("yes") || slots.equalsIgnoreCase("y")){
				System.out.print("You have $" + money + ". How much would you like to wager? ");
				int wager = input.nextInt();
				input.nextLine();
				System.out.println("");
				System.out.println("Great! Let's play!!!");
				System.out.println("");
				System.out.println("Your rolls are: ");
				int roll1 = (int)((Math.random()*10)+1);
				int roll2 = (int)((Math.random()*10)+1);
				int roll3 = (int)((Math.random()*10)+1);
				System.out.println("| " + roll1 + " | " + roll2 + " | " + roll3 + " |");
				if(roll1 == roll2 && roll1 == roll3){
					System.out.println("You won the jackpot! Your wager has now been tripled!");
					money = money + (wager *3);
				}
				else if(roll1 == roll2 || roll2 == roll3 || roll1 == roll3){
					System.out.println("You won! Your wager has now been doubled!");
					money = money + (wager*2);
				}
				else{
					System.out.println("Didn't win this time, better luck next time!");
					money = money-wager;
				}
				System.out.println("You now have $" + money + ".");
				System.out.println("");
			}
			else if(slots.equalsIgnoreCase("No")){
				System.out.println("Sad to see you go! You have $" + money + " left. ");
				break;
			}
		}
		if(money <= 0){
			System.out.print("You've run out of money! ");
		}
		System.out.println("Thanks for coming! Come back soon!");
	}

	public static void main(String args[]) {
		gamble();
	}
}
