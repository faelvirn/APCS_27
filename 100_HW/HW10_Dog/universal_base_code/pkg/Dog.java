package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
		private String name;
		private int age;
		private String breed;

		public Dog(){
			name = "Clifford";
			age = 3;
			breed = "big red dog";
		}

		public Dog(String name){
			this.name = name;
			age = 1;
			breed = "dog dog";
		}

		public Dog(String name, String breed){
			this.name = name;
			age = 1;
			this.breed = breed;
		}

		public Dog(String name, int age){
			this.name = name;
			this.age = age;
			breed = "dog dog";
		}


		public void setName(String newName){
			this.name = newName;
		}
		public void setAge(int newAge){
			this.age = newAge;
		}
		public void setBreed(String newBreed){
			this.breed = newBreed;
		}
		public String getName(){
			return name;
		}
		public int getAge(){
			return age;
		}
		public String getBreed(){
			return breed;
		}
		public boolean isSleeping(){
			int chanceSleep = (int)(Math.random()*2)+1;
			if(chanceSleep == 1){
				return false;
			}
			else{
				return true;
			}
		}
		public void bark(){
			System.out.println(name + ": BARK!");
		}
}
