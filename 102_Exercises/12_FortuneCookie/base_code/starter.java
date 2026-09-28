/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("Take a cookie");
		int fortune = (int)(Math.random()*10);
		int hp = (int)Math.random()*10+1;
		System.out.println("You have " + hp + " hp");
		if(fortune == 1){
			System.out.println("You gain +5 hp");
			hp+=5;
		}
		if(fortune == 2){
			System.out.println("You lose 5 hp");
			hp-= 5;
		}
		if(fortune == 3){
			System.out.println("You gain +3 hp");
			hp+= 3;
		}
		if(fortune == 4){
			System.out.println("You lose 2 hp");
			hp-=2;
		}
		if(fortune == 5){
			System.out.println("You can fly");
		}
		if(fortune == 6){
			System.out.println("You can climb walls");
		}
		if(fortune == 7){
			System.out.println("You can breathe underwater");
		}
		if(fortune == 8){
			System.out.println("You gain +100 hp");
			hp+= 100;
		}
		if(fortune == 9){
			System.out.println("You got disintegrated");
			hp-=100;
		}
		if(fortune == 0){
			System.out.println("You activated god mode");
		}
		if(hp <= 0){
			System.out.println("You died");
		}
	}
}
