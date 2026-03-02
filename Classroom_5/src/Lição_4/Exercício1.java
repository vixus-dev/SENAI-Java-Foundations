package Lição_4;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira um número de um dia da semana: ");
		int dia = leitor.nextInt();
		
		switch (dia) {
		case 1 -> System.out.println("Domingo");
		case 2 -> System.out.println("Segunda-feira");
		case 3 -> System.out.println("terça-feira");
		case 4 -> System.out.println("Quarta-feira");
		case 5 -> System.out.println("Quinta-feira");
		case 6 -> System.out.println("Sexta-feira");
		case 7 -> System.out.println("Sabado");
		
		default -> System.out.println("Insira um número Valido!");
		
		}
		
		leitor.close();
	}
}
