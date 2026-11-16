/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int[] array = new int[1001];
		int[] array2 = new int[1001];
		int i = 0;
		while(i < array.length){
			if(i == 0){
				array[i] = 3;
				array2[i] = 1000;
			}
			else{
				array[i] = array[i-1]+3;
				array2[i] = array2[i-1]-1;
			}
			System.out.println(i + ". " + array[i] + "                  " + i +". " + array2[i]);
			i++;
		}
	}
}
