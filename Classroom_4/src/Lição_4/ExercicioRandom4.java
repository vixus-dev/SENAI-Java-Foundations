package Lição_4;

import java.util.Random;

public class ExercicioRandom4 {

	public static void main(String[] args) {
		//criando o objeto random
		Random aleatorio = new Random();
		
		//gerando o loop
		for (int a = 0 ; a < 8; a ++) {
			System.out.print(aleatorio.nextInt(10)); //imprimindo cada valor
		}
		
	}
}
