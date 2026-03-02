package Módulo_1;

import java.util.Scanner;

public class ChkOddEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean éPar;
		String parOuImpar;
		//entrada
		System.out.print("Insira um número de 0 a 10: ");
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			éPar = true;
		} else {
			éPar = false;
		}
		
		if (éPar) {
			parOuImpar = "Par";
		} else {
			parOuImpar = "Impar";
		}
		//saida
		System.out.println("O número " + numero + " é " + parOuImpar);
		
		scanner.close();
	}
}
