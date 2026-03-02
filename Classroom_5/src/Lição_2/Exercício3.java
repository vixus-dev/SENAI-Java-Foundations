package Lição_2;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("insira um número de 1 a 7: ");
		int dia = leitor.nextInt();
		
		if (dia >= 2 && dia <= 6) {
			System.out.println("Este dia(" + dia + ") é um util");
		} else if (dia == 1 || dia == 7){
			System.out.println("Este dia(" + dia + ") é um final de semana");
		} else {
			System.out.println("Insira um número que esteja no intervalo de 1 a 7 (" + dia + ")");
		}
		
		leitor.close();
	}
}
