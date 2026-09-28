/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;
// import java.awt.event.MouseListener;
// import javax.swing.JFrame;
// import javax.swing.JPanel;


class starter {
	public static void main(String args[]) {
        //JFrame frame = new JFrame("Mouse Click Test");
        //JPanel panel = new JPanel();
		Scanner input = new Scanner(System.in);

		System.out.println("Your siblings have already roused and been sent off on their duties");
		System.out.println("Without them, the dormitory is like a tomb");
		System.out.println("1. Get up");
		int action = 0;
		while(action != 1){
			action = input.nextInt();
		}
		System.out.println("The bed creaks under your weight as you scramble down its ladder");

		
	}
}
