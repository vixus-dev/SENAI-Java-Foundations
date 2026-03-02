package Lição_2;

import java.util.Scanner;

public class Exercício7 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira um número inteiro: ");
		int numero = leitor.nextInt();
		
		if (numero >= 10 && numero <= 20) {
			System.out.println("Este número está contido no intervalo entre 10 e 20!");
		} else {
			System.out.println("Este número não está contido no intervalo secreto, tente novamente!");
		}
		
		leitor.close();
	}
}
