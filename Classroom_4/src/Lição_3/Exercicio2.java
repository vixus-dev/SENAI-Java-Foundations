package Lição_3;

public class Exercicio2 {

	public static void main(String[] args) {
		//Definindo String 
		String parte1 = "Olá";
		String parte2 = "Mundo!";
		//Utilizando o .concat para "somar" as Strings
		String saudacaoCompleta = parte1.concat(" ").concat(parte2);
		
		//Imprimindo Valores e Strigs
		System.out.println("Saudação Completa: " + saudacaoCompleta);
		System.out.println("Caractere na posição 3: " + saudacaoCompleta.charAt(2));
		//Localizando ultimo Caractere
		System.out.println("Tamanho da Saudação completa: " + saudacaoCompleta.length()); //Mostra o tamanho total da String saudaçãoCompleta
		System.out.println("Último Caractere: " + saudacaoCompleta.charAt(9));
	}
}
