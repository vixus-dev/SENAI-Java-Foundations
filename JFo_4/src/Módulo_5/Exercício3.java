package Módulo_5;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insira sua idade: ");
		int idade = scanner.nextInt();
		//Expressão para substituir idades negativas
		if (idade <= 0) {
			idade = Math.max(idade, 0);
		} 
		//Expressão para limitar a idade a 40
		if (idade >= 40) {
			idade = Math.min(idade,40);
			
		}
		
		System.out.println("sua idade é: " + idade);
		
		scanner.close();
	}
}
