package Lição_2;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número inteiro:");
		int numero = scanner.nextInt();
		
		if (numero % 5 == 0 && numero % 7 == 0) {
			System.out.println("O número " + numero + " bate os critérios: é divisível por 5 e 7.");
		} else {
			System.out.println("O número " + numero + " não bate os critérios: não é divisível por 5 e 7.");
		}
		
		scanner.close();
	}
}
