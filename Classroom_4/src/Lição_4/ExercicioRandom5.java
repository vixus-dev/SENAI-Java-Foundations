package Lição_4;

import java.util.Random;

public class ExercicioRandom5 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		double numero = aleatorio.nextDouble(0.0,1.0);
		double numeroPorcentagem = aleatorio.nextDouble(0.0,1.0) * 100;
		float numeroFloat = aleatorio.nextFloat(0.0f,1.0f);
		
		System.out.println("o numero entre 0 e 1 gerado foi: " + numero);
		System.out.println("porcentagem gerada: " + Math.round(numeroPorcentagem * 100.0 ) /100.0 + "%");
		System.out.println("o float gerado de 0.0f até 1.0f foi: " + numeroFloat);

	}

}
