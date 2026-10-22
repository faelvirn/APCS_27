/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("Do you want to 1) encode/decode, 2) encode/decode with a key, or 3) quit?");
			int answer = input.nextInt();
			input.nextLine();
			if(answer == 3){
				break;
			}
			System.out.println("What do you want to encode/decode?");
			String code = input.nextLine();
			if(answer == 2){
				System.out.println("What is the key?");
				int key = input.nextInt();
				String message = Cipher.keyedEncode(code, key);
				System.out.println("The message is " + message);
			}
			else{
				String message = Cipher.encode(code);
				System.out.println("The message is " + message);
			}
		}
		/* do you people like turtles
		robotics is the best
		the key to number 4 is 33
		never gonna give you up never going to let you down
		half of ohtanis jersey number is key to 6
		13 and 29 are keys to 7
		potatoes and chickens are my favorite variable names
		youve successfully completed the first section
		key 27 - you are an amazing programmer and human being thank you
		key 16 - this homework kind of ate but skibidi toilet is minuse 1234 aura
		My code is: r32s 3wy6owt0 727 xwr 6ar 2 sv6xr jk y2xqr6s 8wvm ax7 vasr2x4 8w76s 2x 36t6 o2r3 tax7wy 06ms
		*/
	}
}
