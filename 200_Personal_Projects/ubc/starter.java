import java.util.*;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class starter {
  public static void main(String args[]) {
    String name = "Dalyria";
    ArrayList <String> inventory = new ArrayList();
    String location = "Szarr Palace";
    int day = 1;
    day();
  }
  public static void day(){
    Scanner input = new Scanner (System.in);
    System.out.println("You are Dalyria");
    System.out.println("You have been sleeping, but now dusk has come, and wakefulness with it");
    System.out.println("This is because you are a vampire");
    System.out.println("Your hands are crossed over your chest in the darkness. You lie in sputtering, creaking bed that has no love for structural integrity");
    System.out.println("Your siblings have already roused and been sent off on their duties");
	  System.out.println("Without them, the dormitory is like a tomb");
	  System.out.println("1. Get up");
	  int action = 0;
	  while(action != 1){
		  action = input.nextInt();
	  }
	  System.out.println("The bed creaks under your weight as you climb down its ladder");
    System.out.println("Your hands do not tremble");
    System.out.println("The ladder does not give out");
    System.out.println("There is a hole at the heart of you - a hunger, gnawing its way out of your stomach, consuming everything in its path. It chews up stomach lining and eats away muscle, leaving only ruined chunks of flesh behind.");
    System.out.println("You would know. You were a doctor.");
    System.out.println("You are not hungry. The night outside is black and dark, though you cannot see it.");
    System.out.println("There are no windows here");

    System.out.println("You are in the dormitory. There are no windows, but there are seven creaking beds and no scrap of privacy. A basin sits on a dresser in the corner by the door. The far end opens into a set of doors - the wardrobe.");
    System.out.println("1. Look at the basin \n2. Examine your siblings' beds \n3. Enter the closet \n4. LEAVE");
    while(action != 1 || action != 2 || action != 3 || action != 4){
      action = input.nextInt();
    }
    if(action == 1){
      System.out.println("The basin looks out of place here. Gold leaf runs through it like filligre, and the bowl itself seems to be made of something halfway between crystal and marble. It would sparkle if there was any light in here");
      System.out.println("There is a facet above it. You can smell the traces of copper, long oxidized. It clings to the drain like an infection, though it should have snaked down and away years ago");
      System.out.println("There is no mirror");
      System.out.println("1. Turn the facet \n2. Leave");
      action = input.nextInt();
    }
    else if(action == 2){
      System.out.println("They would be fools to try to hide anything here, but one always tries do so nonetheless");
      System.out.println("You comb through the sheets and their tangles. A few of the beds have pillows. Yours does, as does your oldest sister and youngest brothers. Reward for good behavior.");
      System.out.println("Your oldest sister has nothing, of course. She has naught to hide.");

      System.out.println("In your brother's bed, you find a spool of thread and a pair of scissors tucked away beneath the sheets");
      System.out.println("1. Take the thread \n2. Take the scissors \n3. Leave");
      answer = input.nextInt();
      if(answer > 2){
        break;
      }
    }
        
    //   JFrame frame = new JFrame("Swing Tester");
    //   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //   frame.setSize(492, 200);      
    //   frame.setLocationRelativeTo(null);  
    //   frame.setVisible(true);
    // System.out.println(" _____");
    // System.out.println("|    |");
    // System.out.println("|    |");
    // System.out.println(" -----");
  }
}