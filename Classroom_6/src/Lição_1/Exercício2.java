package Lição_1;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira um número inteiro:");
		int numero = scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
		
		scanner.close();
	}
}
