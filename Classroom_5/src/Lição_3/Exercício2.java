package Lição_3;

import java.util.Scanner;

public class Exercício2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira sua nota de 0 a 100: ");
		int nota = scanner.nextInt();
		
		if (nota >= 70) {
			System.out.println("Aprovado!");
		} else if (nota >= 50 && nota <= 69) {
			System.out.println("Recuperação.");
		} else {
			System.out.println("Reprovado");
		}
		
		scanner.close();
	}
}
