package Lição_2;

import java.util.Scanner;

public class Exercício6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira um ano: ");
		int ano = leitor.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println("Este ano é um ano bissexto!");
		} else {
			System.out.println("Este ano não é um ano bissexto!");
		}
		
		leitor.close();
	}
}
