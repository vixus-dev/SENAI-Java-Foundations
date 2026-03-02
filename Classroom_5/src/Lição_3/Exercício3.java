package Lição_3;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double ladoA,ladoB,ladoC;
		
		System.out.print("Insira o primeiro lado do seu triangulo: ");
		ladoA = scanner.nextDouble();
		
		System.out.print("Insira o segundo lado do seu triangulo: ");
		ladoB = scanner.nextDouble();
		
		System.out.print("Insira o terceiro lado do seu triangulo: ");
		ladoC = scanner.nextDouble();
		
		if (ladoA == ladoB && ladoA == ladoC) {
			System.out.println("Este triangulo é Equilatero!");
		} else if (ladoA == ladoB && ladoA != ladoB || ladoB ==ladoC && ladoB != ladoA) {
			System.out.println("Este triangulo é Isóceles!");
		} else {
			System.out.println("Este triangulo é Escaleno!");
		}
		
		scanner.close();
	}
}
