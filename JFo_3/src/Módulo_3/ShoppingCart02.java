package Módulo_3;

public class ShoppingCart02 {

	public static void main(String[] args) {
		//Exercicio 1
		String custName = "Ronaldo";
		String itemDesc = "Camisa";
		String message;
		
		//exercicio 2
		double preço = 12.00;
		double imposto = 4.00;
		int quantidade = 2;
		
		double preçoTotal = (preço + imposto) * quantidade;
		
		message = custName + " quer comprar " + quantidade + " " + itemDesc;
		//Resultado
		System.out.println(message);
		System.out.println("O custo total será de $" + preçoTotal);
		
	}
}
