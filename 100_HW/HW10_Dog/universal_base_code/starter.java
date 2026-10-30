/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog William = new Dog("WILLIAM");
		William.setAge(32);
		Dog Input = new Dog("INPUT", "PIXEL");
		String Willname = William.getName();
		String inputname = Input.getName();
		if(William.isSleeping()){
			System.out.println(Willname + " is sleeping");
			System.out.println(inputname + " has nothing to bark about");
		}
		else{
			William.bark();
			if(Input.isSleeping()){
				System.out.println(inputname + " wakes up");
				Input.bark();
			}
			else{
				Input.bark();
			}
		}
		boolean sleeping = William.isSleeping();
		

	}
}
