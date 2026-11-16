/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] array = new int[(int) ((Math.random() * 151)+50)];
		int min = 100;
		int max = 1;
		int count = 0;
		for(int i = 0; i < array.length; i++){
			array[i] = (int) ((Math.random()*100)+1);
			if(array[i] < min){
				min = array[i];
			}
			if(array[i] > max){
				max = array[i];
			}
			count += array[i];
		}
		double average = count/array.length;
		System.out.println("ELEMENTS: " + array.length);
		System.out.println("MIN: " + min);
		System.out.println("MAX: " + max);
		System.out.println("AVERAGE: " + average);
	}
}
