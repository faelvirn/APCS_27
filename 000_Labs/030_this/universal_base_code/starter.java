/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf dwarf1 = new PooleDwarf(randName());
		PooleDwarf dwarf2 = new PooleDwarf(randName());
		PooleDwarf dwarf3 = new PooleDwarf(randName());
		PooleDwarf dwarf4 = new PooleDwarf(randName());
		PooleDwarf dwarf5 = new PooleDwarf(randName());
		PooleDwarf dwarf6 = new PooleDwarf(randName());
		PooleDwarf dwarf7 = new PooleDwarf(randName());
		String name1 = dwarf1.getName();
		int duplicates = 0;
		if(dwarf2.isSameName(name1)){
			duplicates++;
		}
		if(dwarf3.isSameName(name1)){
			duplicates++;
		}
		if(dwarf4.isSameName(name1)){
			duplicates++;
		}
		if(dwarf5.isSameName(name1)){
			duplicates++;
		}
		if(dwarf6.isSameName(name1)){
			duplicates++;
		}
		if(dwarf7.isSameName(name1)){
			duplicates++;
		}
		System.out.println("There are " + duplicates + " duplicates of " + name1);
		
	}
}
