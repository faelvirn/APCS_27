/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++){
			if(i == 0){
				array[i] = 9;
			}
			else{
				array[i] = array[i-1] - 1;
			}
			System.out.println(array[i]);
		}
	}
}
