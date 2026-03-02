package Módulo_5;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira sua altura (em metros) : ");
		double altura = scanner.nextDouble();
		
		System.out.print("Insira seu peso (em Kg's): ");
		double peso = scanner.nextDouble();
		
		//Método correto de calcular
		double IMC = Math.round((peso / Math.pow(altura,2)));
		
		//Método Exigido pelo Exercício
		double IMCExemplo = Math.round((peso / Math.pow(altura,2)) * 703);
		
		System.out.println("seu IMC é de " + IMCExemplo);
		System.out.println("Seu IMC (correto) é de " + IMC);
		scanner.close();
	}
}
