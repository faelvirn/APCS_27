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
	private static int nextAccountNumber;

	// -------CONSTRUCTORS-------
	public BankAccount(){
		Owner = "unknown";
		Balance = 0;
		isActive = true;
		accountNumber = nextAccountNumber;
		nextAccountNumber = nextAccountNumber+1;
	}
	public BankAccount(String name){
		Owner = name;
		Balance = 0;
		isActive = true;
		accountNumber = nextAccountNumber;
		nextAccountNumber = nextAccountNumber+1;
	}
	public BankAccount(String name, int Balance){
		Owner = name;
		Balance = Balance;
		isActive = true;
		accountNumber = nextAccountNumber;
		nextAccountNumber = nextAccountNumber+1;
	}
	

	// -------METHODS-------
	public void setUpNumber(){
		nextAccountNumber = (int) (Math.random()*50)+50;
	}

	public void checkBalance(){
		System.out.println("Current Balance: " + Balance);
	}

	public void displayAccountInfo(){
		System.out.println("Name: " + Owner + "\nAccount Number: " + accountNumber + "\nBalance: " + Balance + "\nisActive: " + isActive);
	}

}