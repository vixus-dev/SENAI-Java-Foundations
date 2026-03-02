package Lição_3;

public class Exercicio6 {

	public static void main(String[] args) {
		//definindo String
		String ListaDeCompras = "leite,pão,ovos,café,frutas";
		//separando os itens com uma " , " e organizando-os em uma lista
		String [] Lista = ListaDeCompras.split(",");
		
		//imprimindo a Saida
		System.out.println("Itens da lista de compras: ");
		System.out.println("1 - " + Lista[0]);
		System.out.println("2 - " + Lista[1]);
		System.out.println("3 - " + Lista[2]);
		System.out.println("4 - " + Lista[3]);
		System.out.println("5 - " + Lista[4]);
		
		
	
	}
}
