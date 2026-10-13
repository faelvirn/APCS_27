/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int pow(int int1, int int2){
		int i = 0;

		int answer = 1;
		while(i < int2){
			answer = answer*int1;
			i++;
		}
		return answer;
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a whole number");
		int int1 = input.nextInt();
		System.out.println("What power do you want to raise that to?");
		int int2 = input.nextInt();
		System.out.println(pow(int1, int2));
	}
}
