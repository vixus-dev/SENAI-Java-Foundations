package Lição_4;

import java.util.Random;

public class ExercicioRandom1 {

	public static void main(String[] args) {
		//criando o objeto Random
		Random aleatorio = new Random();
		
		//definindo a variavel do "Dado"
		int dadoD6 = aleatorio.nextInt(6) + 1 ;
		
		//imprimindo os valores
		System.out.println("Dado girado: " + dadoD6);
	}
}
