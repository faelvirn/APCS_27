/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount x = new BankAccount();
		BankAccount Sarah = new BankAccount("Sarah");
		BankAccount anonymous = new BankAccount();
		BankAccount theDreadLordOfBritain = new BankAccount("Pound", 1000000000);
		System.out.println("Name: " + x.Owner = "\nAccount Number: " + x.accountNumber + "\nBalance: " + x.Balance + "\nisActive: " + x.isActive);
		System.out.println("Name: " + Sarah.Owner = "\nAccount Number: " + Sarah.accountNumber + "\nBalance: " + Sarah.Balance + "\nisActive: " + Sarah.isActive);
		System.out.println("Name: " + anonymous.Owner = "\nAccount Number: " + anonymous.accountNumber + "\nBalance: " + anonymous.Balance + "\nisActive: " + anonymous.isActive);
		System.out.println("Name: " + theDreadLordOfBritain.Owner = "\nAccount Number: " + theDreadLordOfBritain.accountNumber + "\nBalance: " + theDreadLordOfBritain.Balance + "\nisActive: " + theDreadLordOfBritain.isActive);
	}
}
