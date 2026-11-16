/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;
class starter {
	public static void main(String args[]) {
		int[] array = new int[20];
		System.out.println("There are these 20 numbers");
		for(int i = 0; i < array.length; i++){
			array[i] = (int)((Math.random() *10)+1);
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		System.out.println("");
		int duplicate = (int)((Math.random() *10)+1);
		System.out.println("The random number to look for is " + duplicate);
		int duplicates = 0;
		int lastnumber = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] == duplicate){
				duplicates++;
				System.out.println("Duplicate found at index " + i);
			}
		}
		System.out.println("Total number of duplicates for " + duplicate + " is " + duplicates);
		System.out.println("");
		for(int i = 0; i < array.length; i++){
			if(array[i] == lastnumber){
				System.out.println("Indexes " + (i-1) + " and " + i + " are both " + array[i] + "!");
			}
			lastnumber = array[i];
		}
	}
}
