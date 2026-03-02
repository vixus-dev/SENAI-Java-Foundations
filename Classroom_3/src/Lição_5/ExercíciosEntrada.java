package Lição_5;

import java.util.Scanner;

public class ExercíciosEntrada {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); // Cria o objeto Scanner UMA VEZ

	        // --- Exercício 1 ---
	        System.out.println("--- Exercício 1: Lendo um Nome ---");
	        // Seu código para o Exercício 1 aqui
	        System.out.print("Insira seu nome:");
	        String nome = scanner.nextLine();
	        System.out.println("seu nome é: " + nome );

	     // --- Exercício 2 ---
	        System.out.println("\n--- Exercício 2: Lendo Idade e Altura ---");
	        // Seu código para o Exercício 2 aqui
	        System.out.print("Insira sua idade "+ nome + " : ");
	        int idade = scanner.nextInt();
	        System.out.print("Insira sua altura: ");
	        double altura = scanner.nextDouble();
	        System.out.println("A sua idade é " + idade + " anos e sua altúra é: " + altura + "m");
	        
	     // --- Exercício 3 ---
	        System.out.println("\n--- Exercício 3: Frase Favorita ---");
	        // Seu código para o Exercício 3 aqui
	        String frase = "";
	        
	        scanner.nextLine();
	        System.out.print("Me diga qual sua frase favoria "+ nome + " : ");
	        frase =  scanner.nextLine();
	        
	        System.out.print("Sua frase favoria é '" + frase + "'");

	        scanner.nextLine();
	        // --- Exercício 4 (Desafio com Bug Comum) ---
	        System.out.println("\n--- Exercício 4: Nome e Ano de Nascimento ---");
	        // Seu código para o Exercício 4 aqui
	        System.out.print("Insira o ano de seu nascimento: ");
	        int anoDeNascimento = scanner.nextInt();
	        scanner.nextLine();
	        
	        System.out.print("Insira seu sobrenome inteiro:");
	        String nomeCompleto = scanner.nextLine();
	        
	        System.out.println("Você nasceu em " + anoDeNascimento + " e seu nome completo é " + nome + " " + nomeCompleto);
	        
	        scanner.close(); // Fecha o Scanner ao final do programa
	    
	}	


}
