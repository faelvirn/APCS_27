/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount setup = new BankAccount();
		setup.setUpNumber();
		BankAccount x = new BankAccount();
		BankAccount Sarah = new BankAccount("Sarah");
		BankAccount anonymous = new BankAccount();
		BankAccount theDreadLordOfBritain = new BankAccount("Pound", 1000000000);
		x.printAccount();
		Sarah.printAccount();
		anonymous.printAccount();
		theDreadLordOfBritain.printAccount();
		}
}
