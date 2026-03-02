package Lição_1;

import java.util.Random;
import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Random aleatorio = new Random();
		
	        int numeroPensado = aleatorio.nextInt(101);
	        int palpite;

	        do {
	            System.out.print("Adivinhe o número: ");
	            palpite = leitor.nextInt();
	            if (palpite != numeroPensado) {
	            	if (numeroPensado - palpite <= 0) {
	            		System.out.println("Errado! o número é menor do que este");
					} else {
						System.out.println("Errado! o número é maior do que este");
					}
	                
	            }
	        } while (palpite != numeroPensado);

	        System.out.println("Parabéns! Você acertou.");
		
		leitor.close();
	}
}
