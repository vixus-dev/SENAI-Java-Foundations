package Lição_01;

import java.util.Scanner;

public class Exercício_4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira um número inteiro: " );
		int numero1 = leitor.nextInt();
		
		System.out.print("Insira outro número inteiro: " );
		int numero2 = leitor.nextInt();
		
		int divisão = 0;
		try {
			divisão = numero1 / numero2;
			System.out.println("A divisão de " + numero1 + " por " + numero2 + " é de: " + divisão);
		} catch (Exception ArithmeticException) {
			System.out.println("Erro: Divisão por zero não é permitida.");
		}

		leitor.close();
	}
}
