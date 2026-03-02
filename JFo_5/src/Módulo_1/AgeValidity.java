package Módulo_1;

import java.util.Scanner;

public class AgeValidity {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		boolean drivingUnderAge = false;
		
		System.out.print("Insira sua idade: ");
		int idade = leitor.nextInt();
		
		if (idade >= 18) {
			drivingUnderAge = false;
			System.out.println(drivingUnderAge);
			System.out.println("Você é maior de idade!");
		} else {
			drivingUnderAge = true;
			System.out.println(drivingUnderAge);
			System.out.println("você é menor de idade!");
		}
		
		
		leitor.close();
	}
}
