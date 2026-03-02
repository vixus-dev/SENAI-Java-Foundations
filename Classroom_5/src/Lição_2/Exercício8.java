package Lição_2;

import java.util.Scanner;

public class Exercício8 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira um único Caractere: ");
		char caractere = leitor.next().charAt(0);
		
		if (caractere >= 'A' && caractere <= 'Z') {
			System.out.println("Você inseriu um caractere em maiusculo entre A e Z (" + caractere + ")");
		} else if (caractere >= 'a' && caractere <= 'z') {
			System.out.println("Você inseriu um caractere em minusculo entre A e Z (" + caractere + ")");
		} else if (caractere >= '0' && caractere <= '9') {
			System.out.println("Você inseriu um caractere entre 0 e 9 (" + caractere + ")");
		} else {
			System.out.println("Você digitou um caractere especial (" + caractere + ")");
		}
		
		leitor.close();
	}
}
