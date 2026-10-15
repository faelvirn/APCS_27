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
			if(answer == 3){
				break;
			}
			System.out.println("What do you want to encode/decode?");
			String code = input.nextLine();
			input.nextLine();
			if(answer == 2){
				System.out.println("What is the key?");
				int key = input.nextInt();
				input.nextInt();
				String message = Cipher.keyedEncode(code, key);
				System.out.println("The message is " + message);
			}
			else{
				String message = Cipher.encode(code);
				System.out.println("The message is " + message);
			}
		}

	}
}
