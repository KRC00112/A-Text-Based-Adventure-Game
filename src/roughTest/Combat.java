package roughTest;

import java.util.Random;
import java.util.Scanner;

public class Combat {
	
	static int playerHealth = 50;
    static int enemyHealth = 50;
    final int ENEMY_POWER = playerHealth;
    final int PLAYER_POWER = enemyHealth;
    boolean enemyAttack = false;
    String attack;
    Random random;
	

    public static void main(String[] args) {
    	
    	
    	
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enemy Detected. What now?");
    	String initiateCombat=scanner.nextLine();
    	
    	System.out.println("Initial player HP: "+playerHealth);
		System.out.println("Initial enemy HP: "+enemyHealth);
    	
    	if(initiateCombat.equalsIgnoreCase("attack")) {
    		
    		
    		
    		
    		combatMethod();
    		
    		
    		
    		
    		
    	}

    }
    
    
    
    public static void combatMethod() {
    	
    	
        int playerHealth = 50;
        int enemyHealth = 50;
        //use these for critical hits or something
        final int ENEMY_POWER = playerHealth;
        final int PLAYER_POWER = enemyHealth;
        //--------------
        boolean enemyAttack = false;
        String attack;
        Random random;

        System.out.println("Enemy HP:" + enemyHealth);
        System.out.println("player HP: " + playerHealth);
        System.out.println("_______________________________________");


        do {
            random = new Random();

            int enemyRandom = random.nextInt(0,4)*4;// can add PLAYER_POWER and ENEMY_POWER instead
            int playerRandom = random.nextInt(0,4)*5;//adjust these values to decide who gets to be stronger

            System.out.print("y for attack/n to flee: ");

            Scanner scanner = new Scanner(System.in);
            attack = scanner.nextLine();

            if (attack.equalsIgnoreCase("n")) {
                break;
            }

            if (attack.equalsIgnoreCase("y")) {
                enemyHealth = enemyHealth - playerRandom;
                System.out.println("Enemy HP:" + enemyHealth);
                enemyAttack = true;
                
                if(playerRandom==0) {
                	System.out.println("player missed");
                }
                
                
            }
            
            

            if (enemyAttack) {
                playerHealth = playerHealth - enemyRandom;
                System.out.println("player HP: " + playerHealth);
                
                if(enemyRandom==0) {
                	System.out.println("enemy missed");
                }
            }
            
           
            
            
          
            

            System.out.println("_______________________________________");
            
        } while (playerHealth > 0 && enemyHealth > 0);
        
        if(playerHealth==enemyHealth||(playerHealth<0&&enemyHealth<0)) {
            System.out.println("It's a tie");
        }
        
        
        else if(attack.equals("n")&&(enemyHealth>0||playerHealth>0)) {
        	
        	System.out.println("You flee.No one wins.");
        }

        else if (enemyHealth <= 0 && playerHealth > 0) {
        	
            System.out.println("Player wins");
            
        } 
        else if (playerHealth <= 0 && enemyHealth > 0) {
        	
            System.out.println("Enemy wins");
            
        }
        
        
        
        System.out.println("Final player HP: "+playerHealth);
		System.out.println("Final enemy HP: "+enemyHealth);
        
    	
    }
    
    
    
}
