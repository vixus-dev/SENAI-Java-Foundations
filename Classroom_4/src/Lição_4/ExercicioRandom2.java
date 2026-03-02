package Lição_4;

import java.util.Random;

public class ExercicioRandom2 {

	public static void main(String[] args) {
		//criando o objeto random
				Random aleatorio = new Random();
				//definindo o boolean
				boolean Moeda = aleatorio.nextBoolean();
				
				//verificando o valor da moeda
				if (Moeda == true) {
					System.out.println("Após rodar a moeda, o resultado foi: Cara ");
				} else{
					System.out.println("Após rodar a moeda, o resultado foi: Coroa ");
				}
				

	}

}
