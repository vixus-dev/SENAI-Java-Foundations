package Lição_3;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira o número de um dia da semana: ");
		int dia = leitor.nextInt();
		
		if (dia == 1) {
			System.out.println("O dia é Domingo!");
		} else if (dia == 2) {
			System.out.println("O dia é Segunda-feira!");
		} else if (dia == 3) {
			System.out.println("O dia é Terça-feira!");
		} else if (dia == 4) {
			System.out.println("O dia é Quarta-feira!");
		} else if (dia == 5) {
			System.out.println("O dia é Quinta-feira!");
		} else if (dia == 6) {
			System.out.println("O dia é Sexta-feira!");
		} else if (dia == 7) {
			System.out.println("O dia é Sabado!");
		} else {
			System.out.println("Insira um dia Valido! (1 a 7)");
		}
		
		leitor.close();
	}
}
