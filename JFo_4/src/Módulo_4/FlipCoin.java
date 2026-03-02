package Módulo_4;

import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {

        // 50% chance heads, 50% chance tails
        Random rand = new Random();   
        for (int i = 0; i < 8; i++) {
        	double chance = rand.nextDouble();
        	
        	if (chance >= 0.5) {
    			System.out.print("Superior a 0,5: ");
    	        System.out.println(chance);
    		} else {
    			System.out.print("Inferior a 0,5: ");
    	        System.out.println(chance);
    		}
        }
    }
}

