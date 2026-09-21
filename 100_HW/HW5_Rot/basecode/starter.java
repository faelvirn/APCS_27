/*
 *	Author:
 *  Date:
 * 	Collaborator: 
 * ================================================================
 *  ITALIAN BRAINROT SHOWDOWN -- A One-Shot Battle
 *  Practice: Math.random(), Math class methods, Scanner, variables
 * ================================================================
 * The whole showdown -- training your fighter, the rival's arrival,
 * the clash, and the rizz points you walk away with -- happens in a
 * single, straight-line pass through this program. No branching, no
 * repeating, just one battle told in code.
 */

import java.util.Scanner;

public class starter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ============================================================
        // SECTION 1: Train Your Fighter  (given -- do not change)
        // ============================================================
        System.out.println("=== ITALIAN BRAINROT SHOWDOWN ===");
        System.out.println("Somewhere in Ohio, a legendary brainrot battle is about to begin...");
        System.out.print("Name your brainrot fighter (e.g. Tralalero Tralala): ");
        String heroName = sc.nextLine();

        System.out.print("How many hours has " + heroName + " trained at the Skibidi Gym (1-10)? ");
        int trainingHours = sc.nextInt();
        sc.nextLine();
        int trainingBonus = trainingHours * 3;

        int rizzPower = (int)(Math.random()*20.0+10.0+trainingBonus);
        int sigmaSpeed = (int)(Math.random()*20.0+10.0);
        int brainrotEnergy = (int)(Math.random()*20.0+5.0+(trainingBonus/2));
        System.out.println("rizz: " + rizzPower + "; sigma: " + sigmaSpeed + "; brainrot: " + brainrotEnergy);

        // ============================================================
        // SECTION 2: Choose Your Signature Move
        // ============================================================
        System.out.print("Give " + heroName + "'s signature move a name: ");
        String moveName = sc.nextLine();
        int movePower = (int)(Math.random()*15+5);

        // ============================================================
        // SECTION 3: The Rival Appears  (given -- do not change)
        // ============================================================
        System.out.println();
        System.out.println("Suddenly, BOMBARDIRO CROCODILO descends from the sky!");

        int rivalHealth = (int)(Math.random()*70+80);
        int rivalPower = (int)(Math.random()*20+15);
        int rivalDefense = (int)(Math.random()*15+5);


        // ============================================================
        // SECTION 4: The Showdown
        // ============================================================
        double heroPower = Math.sqrt(Math.pow(rizzPower, 2)+Math.pow(sigmaSpeed, 2) + Math.pow(brainrotEnergy, 2)+movePower);
    
        double fateRoll = Math.random()*1.5+0.5;
        boolean maxRizz = fateRoll > 1.5;
        //Mr. Poole just let me use if already, local comparison is terrible

        int rawDamage = (int)(heroPower * fateRoll);
        int finalDamage = Math.max(rawDamage-rivalDefense, 10);

        // TODO 7: Create an int rivalHealthRemaining: rivalHealth
        //         minus finalDamage, but never less than 0.
        int rivalHealthRemaining = Math.max(rivalHealth-finalDamage, 0);

        // ============================================================
        // SECTION 5: The Rival Strikes Back
        // ============================================================
        double rivalFuryRoll = Math.random()*0.5+1.0;
        int rivalDamage = (int)(rivalPower * rivalFuryRoll);

        int heroHealthRemaining = Math.max(100-rivalDamage, 0);
        // ============================================================
        // SECTION 6: The Rizz Reward
        // ============================================================
        int basePoints = (int)(Math.random()*250+50);

        // TODO 11: Tally the reward. Create:
        //   - int damageDealt: rivalHealth minus rivalHealthRemaining
        //   - int bonusPoints: damageDealt, but capped at a maximum
        //     of 100 extra points.
        //   - int totalRizz: basePoints + bonusPoints
        int damageDealt = rivalHealth-rivalHealthRemaining;
        int bonusPoints = damageDealt;
        int totalRizz = basePoints+bonusPoints;

        // ============================================================
        // SECTION 7: Battle Report  (given -- do not change but match your variables to these!)
        // ============================================================
        System.out.println();
        System.out.println("----- BATTLE REPORT -----");
        System.out.println(heroName + "  |  trained " + trainingHours + " hours at the gym");
        
        
        System.out.println("  RIZZ " + rizzPower + "  SPEED " + sigmaSpeed + "  BRAINROT ENERGY " + brainrotEnergy);

        System.out.println("Signature move: " + moveName + " (power " + movePower + ")");
       
        System.out.println();
        System.out.println("BOMBARDIRO CROCODILO  |  HP " + rivalHealth + "  POWER " + rivalPower + "  DEFENSE " + rivalDefense);
        System.out.println();

        System.out.println("Fighter power rating: " + heroPower);
        System.out.println("Fate roll: " + fateRoll + "  (maximum rizz achieved? " + maxRizz + ")");
        System.out.println(heroName + " lands " + finalDamage + " damage with " + moveName + "!");
        System.out.println("Rival health remaining: " + rivalHealthRemaining);
        System.out.println();

        System.out.println("Rival fury roll: " + rivalFuryRoll);
        System.out.println("BOMBARDIRO CROCODILO deals " + rivalDamage + " damage!");
        System.out.println(heroName + "'s health remaining: " + heroHealthRemaining);
        System.out.println();

        System.out.println("----- THE RIZZ REWARD -----");
        System.out.println("Base points earned: " + basePoints);
        System.out.println("Damage bonus: " + bonusPoints);
        System.out.println("TOTAL RIZZ POINTS: " + totalRizz);
    }
}