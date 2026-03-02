package Módulo_5;

import java.util.Scanner;

public class input03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Insira um número: ");
		int a = leitor.nextInt();
		
		System.out.print("Insira outro número: ");
		int b = leitor.nextInt();
		
		System.out.print("Insira um ultimo número: ");
		int c = leitor.nextInt();
		
		System.out.print("A soma dos três números inseridos é " + (a+b+c));
		
		leitor.close();
	}
}
