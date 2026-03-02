package Lição_4;

import java.util.Random;

public class ExercicioRandom6 {

	public static void main(String[] args) {
		Random seed = new Random(12345L);
		
		Random seed2 = new Random(12345L);

		System.out.println("Numeros gerados: ");
		for (int i = 0; i < 5; i ++) {
			System.out.println(seed.nextInt(0,100));
		}
		
		System.out.println("Numeros gerados: ");
		for (int i = 0; i < 5; i ++) {
			System.out.println(seed2.nextInt(0,100));
		}
	}

}
