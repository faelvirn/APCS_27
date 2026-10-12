/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		//let me use for loops mr poole!!!!
		Scanner input = new Scanner(System.in);
		int i = 0;
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("How many times should we print your name?");
		int max = input.nextInt();
		while(true){
			if(i == max){
				break;
			}
			System.out.println(name);
			i ++;
		}



		
	}
}
