/*
 *	Author: Cara Terrey
 *  Date: 10/25/26
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to play rock-paper-scissors?");
        while(true){
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("yes")){
            while(true){
                System.out.println("Do you want to play rock, paper, or scissors?"); 
                answer = input.nextLine();
                if(answer.equalsIgnoreCase("Rock") || answer.equalsIgnorseCase("Paper") || answer.equalsIgnoreCase("Scissors")){
                    break;
                }
            }
            Computer computer = new Computer();
                String role =  computer.getObject();
                int outcome = compare2(answer, role);
                if(outcome == 1){
                    System.out.println("You won!");
                }
                else if(outcome == 0){
                    System.out.println("You tied");
                }
                else if(outcome == 2){
                    System.out.println("You lost");
                }
        }
        else if(answer.equalsIgnoreCase("No")){
            Computer Player1 = new Computer();
            Computer Player2 = new Computer();
            System.out.println("How many times do you want the computer to play itself?");
            int i = input.nextInt();
            int j = 0;
            int p1wins = 0;
            int p2wins = 0;
            int ties = 0;
            while(j < i){
                String role1 = Player1.getObject();
                String role2 = Player2.getObject();
                int outcome = compare2(role1, role2);
                if(outcome == 0){
                    ties++;
                }
                else if(outcome == 1){
                    p1wins++;
                }
                else if(outcome == 2){
                    p2wins++;
                }
                j++;
            }
            System.out.println("Player 1 won " + p1wins + " times (" + p1wins + "/" + i + ").");
            System.out.println("Player 2 won " + p2wins + " times (" + p2wins + "/" + i + ").");
            System.out.println("There was a tie " + ties + " times (" + ties + "/" + i + ").");
        }
        if(answer.equalsIgnoreCase("done")){
            System.out.println("Ending...");
            break;
        }
        System.out.println("Do you want to play again?");
        }
    }

    public static int compare2(String role1, String role2){
        int outcome = 0;
        if(role1.equalsIgnoreCase(role2)){
            outcome = 0; //tie
        }
        else if(role1.equalsIgnoreCase("Scissors")){
            if(role2.equals("Rock")){
                outcome = 2;
            }
            else if(role2.equals("Paper")){
                outcome = 1;
            }
        }
        else if(role1.equalsIgnoreCase("Rock")){
            if(role2.equals("Scissors")){
                outcome = 1;
            }
            else if(role2.equals("Paper")){
                outcome = 2;
            }
        }
        else if(role1.equalsIgnoreCase("Paper")){
            if(role2.equals("Rock")){
                outcome = 1;
            }
            else if(role2.equals("Scissors")){
                outcome = 2;
            }
        }
        return outcome;
    }
}

class Computer{
    public Computer(){
    }
    public static String getObject(){
        String role = "";
        int choice = (int) (Math.random()*3);
        if(choice == 0){
            role = "Rock";
        }
        else if(choice == 1){
            role = "Scissors";
        }
        else{
            role = "Paper";
        }
        return role;
    }

}
