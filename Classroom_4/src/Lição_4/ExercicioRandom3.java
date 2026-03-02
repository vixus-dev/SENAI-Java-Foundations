package Lição_4;

import java.util.Random;

public class ExercicioRandom3 {
	
	public static void main(String[] args) {
		//definindo o objeto random
		Random aleatorio = new Random();
		//definindo as int's
		int min = 10;
		int max = 50;
		int numero = aleatorio.nextInt(max - min + 1) + min;
		//imprimindo valores
		System.out.println("O número gerado dentro do limite estabelecido foi: " + numero);
		
	}

}
