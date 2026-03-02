package Lição_3;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//Definindo Strings 
		System.out.print("Insira seu nome:");
		String nome = leitor.next();
		
		leitor.nextLine();
		
		System.out.print("Insira seu sobre nome: ");
		String sobreNome = leitor.nextLine();
		String frase = "Aprendendo Java é divertido!";
		
		String Vazia = "";
		
		//Imprimindo Mensagens
		System.out.println("Nome: " + nome + ", Tamanho: " + nome.length());
		System.out.println("Sobre nome: " + sobreNome + ", Tamanho: " + sobreNome.length());
		System.out.println("Frase: " + frase + ", Tamanho: " + frase.length());
		System.out.println("Sting Vazia: " + Vazia + ", Tamanho: " + Vazia.length());
		
		leitor.close();
	}
}
