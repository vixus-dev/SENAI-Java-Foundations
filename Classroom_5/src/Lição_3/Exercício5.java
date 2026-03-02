package Lição_3;

import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira o valor da sua compra: ");
		double valor = scanner.nextDouble();
		
		if (valor <= 50 ) {
			System.out.println("O valor do frete é de R$10,00.");
			System.out.println("O total da compra será de R$" + (valor + 10));
		} else if (valor >= 50 && valor <= 100) {
			System.out.println("O valor do frete é de R$7,00.");
			System.out.println("O total da compra será de R$" + (valor + 7));
		} else if (valor > 100){
			System.out.println("O frete é GRATIS.");
			System.out.println("O total da compra será de R$" + (valor));
		} else {
			System.out.println("Erro ao calcular o valor do frete");
		}
		
		scanner.close();
	}
}
