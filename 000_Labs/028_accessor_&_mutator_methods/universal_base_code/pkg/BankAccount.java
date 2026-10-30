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
	private double Balance;
	private boolean isActive;
	private static int nextAccountNumber;

	// -------CONSTRUCTORS-------
	public BankAccount(){
		this.Owner = "unknown";
		this.Balance = 0;
		this.isActive = true;
		this.accountNumber = nextAccountNumber;
		this.nextAccountNumber = nextAccountNumber+1;
	}
	public BankAccount(String name){
		this.Owner = name;
		this.Balance = 0;
		this.isActive = true;
		this.accountNumber = nextAccountNumber;
		this.nextAccountNumber = nextAccountNumber+1;
	}
	public BankAccount(String name, double Balance){
		this.Owner = name;
		this.Balance = Balance;
		this.isActive = true;
		this.accountNumber = nextAccountNumber;
		this.nextAccountNumber = nextAccountNumber+1;
	}
	

	// -------METHODS-------
	public void setUpNumber(){
		nextAccountNumber = (int) (Math.random()*50)+50;
	}

	public double checkBalance(){
		return Balance;
	}

	public String getOwner(){
		return Owner;
	}

	public double getBalance(){
		return Balance;
	}
	
	public void setOwner(String newName){
		Owner = newName;
	}

	public void closeAccount(){
		isActive = false;
	}

	public boolean isActive(){
		return isActive;
	}

	public void deposit(double deposit){
		if(isActive == true){
			Balance = Balance+deposit;
			System.out.println(Owner + " deposits $" + deposit);
			System.out.println(Owner + " has $" + Balance);
		}
	}

	public void withdraw(double money){
		if(isActive == true && Balance-money >= 0){
			Balance = Balance-money;
			System.out.println(Owner + " withdrew $" + money);
		}
		else{
			System.out.println(Owner + " cannot withdraw $" + money + "! " + Owner + " does not have enough money");
		}
	}

	public void displayAccountInfo(){
		System.out.println("Name: " + Owner + "\nAccount Number: " + accountNumber + "\nBalance: " + Balance + "\nisActive: " + isActive);
	}
}