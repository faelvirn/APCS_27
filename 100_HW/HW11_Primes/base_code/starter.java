/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a number");
		int number = input.nextInt();
		printPrimes(number);
	}

	public static boolean checkPrime(int number1){
		int loop = number1-1;
		boolean prime = true;
		while(loop > 1){
			if(number1%loop == 0){
				prime = false;
				break;
			}
			loop--;
		}
		return prime;
	}

	public static void printPrimes(int number1){
		int loop = number1-1;
		while(loop > 1){
			if(checkPrime(loop)){
				System.out.println(loop);
			}
			loop--;
		}
	}
}
