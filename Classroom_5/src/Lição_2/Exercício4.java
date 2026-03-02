package Lição_2;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira o valor de sua compra: ");
		double valorCompra = scanner.nextDouble();
		
		System.out.print("Você é um(a) cliente VIP? (s/n ou sim/não): ");
		String VIP = scanner.next();
		boolean isVIP = false;
		
		if (VIP.equalsIgnoreCase("s") || VIP.equalsIgnoreCase("sim")) {
			isVIP = true;
		} else if (VIP.equalsIgnoreCase("n") || VIP.equalsIgnoreCase("nao") || VIP.equalsIgnoreCase("não")) {
			isVIP = false;
		} else {
			System.out.println("Como você conseguiu falhar em uma questão de sim ou não?");
		}
		
		
		if(valorCompra >= 100 || isVIP == true) {
			System.out.println("O cliente Recebe desconto");
		} else {
			System.out.println("O desconto não se aplica");
		}
		
		scanner.close();
	}
}
