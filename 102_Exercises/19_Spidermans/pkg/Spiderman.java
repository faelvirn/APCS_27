package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	public Spiderman(){
		this.actor = "unknown";
		this.age = 0;
		this.villain = "unknown";
	}
	public Spiderman(String actor){
		this.actor = actor;
		this.age = 0;
		this.villain = "unknown";
	}
	public Spiderman(int age){
		this.actor = "unknown";
		this.age = age;
		this.villain = "unknown";
	}
	public Spiderman(String actor, int age){
		this.actor = actor;
		this.age = age;
		this.villain = "unknown";
	}
	public Spiderman(String actor, int age, String villain){
		this.actor = actor;
		this.age = age;
		this.villain = villain;
	}
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public int getAge(){
		return age;
	}
	public String getName(){
		return actor;
	}
	public String getVillain(){
		return villain;
	}
	public void nameChange(String newName){
		actor = newName;
	}
	public void setAge(int newAge){
		age = newAge;
	}
	public void newVillain(String newVillain){
		villain = newVillain;
	}
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots their web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
		System.out.println("           :              ");  
		System.out.println("           ;              ");   
		System.out.println("          :               ");   
		System.out.println("          ;               ");   
		System.out.println("         /                ");   
		System.out.println("       o/                 ");   
		System.out.println("     ._/\\___,             ");    
		System.out.println("         \\                ");   
		System.out.println("         /    			  "); 
	}
}
