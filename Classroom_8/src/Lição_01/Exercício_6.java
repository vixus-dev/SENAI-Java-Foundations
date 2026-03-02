package Lição_01;

import java.util.Scanner;

public class Exercício_6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int i = 0;
		
		while (true) {
			try {
				System.out.print("Insira um número inteiro: ");
				i = leitor.nextInt();
				break;
				
			} catch (Exception InputMismatchException) {
				System.out.println("Erro: Insira um número Valido!");
				leitor.next();
			}
		}
		
		System.out.println("Valor aceito!");
		System.out.println("o valor inserido foi: " + i);
		leitor.close();
	}
}
