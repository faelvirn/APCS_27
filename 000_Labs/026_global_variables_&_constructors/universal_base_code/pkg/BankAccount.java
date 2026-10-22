/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private String Owner;
	private int accountNumber;
	private int Balance;
	private boolean isActive;
	private static nextAccountNumber;


	// -------CONSTRUCTORS-------
	public BankAccount(){
		Owner = "unknown";
		Balance = 0;
		isActive = true;
		accountNumber = nextAccountNumber;
		nextAccountNumber = (int) (Math.random*50)+50;
	}
	public BankAccount(String name){
		Owner = name;
		Balance = 0;
		isActive = true;
		accountNumber = nextAccountNumber;
		nextAccountNumber = (int) (Math.random*50)+50;
	}
	public BankAccount(String name, int Balance){
		Owner = name;
		Balance = Balance;
		isActive = true;
		accountNumber = nextAccountNumber;
		nextAccountNumber = (int) (Math.random*50)+50;
	}
	

	// -------METHODS-------
	public printAccount(){
		System.out.println("Name: " + x.Owner = "\nAccount Number: " + x.accountNumber + "\nBalance: " + x.Balance + "\nisActive: " + x.isActive);
	}

}