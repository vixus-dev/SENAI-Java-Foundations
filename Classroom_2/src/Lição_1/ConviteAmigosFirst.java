package Lição_1;

import java.util.Scanner; // Importa a classe Scanner para ler entrada do usuário

public class ConviteAmigosFirst{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada

        // --- Coleta das informações do evento ---
        System.out.println("--- Gerador de Convites para o Fim de Semana ---");

        System.out.print("Qual a atividade planejada? (Ex: churrasco, noite de jogos) ");
        String atividade = scanner.nextLine(); // Lê a atividade

        System.out.print("Qual a data e hora? (Ex: Sábado, 19h) ");
        String dataHora = scanner.nextLine(); // Lê a data e hora

        System.out.print("Qual o local? (Ex: Minha casa) ");
        String local = scanner.nextLine(); // Lê o local

        System.out.print("Qual a instrução para confirmação de presença? (Ex: Me avisa até sexta!) ");
        String confirmacao = scanner.nextLine(); // Lê a instrução de confirmação

        System.out.println("\n--- Agora, vamos convidar seus amigos! ---");
        String nomeAmigo;
        
        do {
            System.out.print("Digite o nome do amigo (ou 'fim' para terminar ou 'editar' para editar as informações): ");
            nomeAmigo = scanner.nextLine(); // Lê o nome do amigo
            
            if(nomeAmigo.equalsIgnoreCase("editar")) {
            	System.out.println("--- Gerador de Convites para o Fim de Semana ---");

                System.out.print("Qual a atividade planejada? (Ex: churrasco, noite de jogos) ");
                atividade = scanner.nextLine(); // Lê a atividade

                System.out.print("Qual a data e hora? (Ex: Sábado, 19h) ");
               dataHora = scanner.nextLine(); // Lê a data e hora

                System.out.print("Qual o local? (Ex: Minha casa) ");
                local = scanner.nextLine(); // Lê o local

                System.out.print("Qual a instrução para confirmação de presença? (Ex: Me avisa até sexta!) ");
               confirmacao = scanner.nextLine(); // Lê a instrução de confirmação
            } else 
            
            if (!nomeAmigo.equalsIgnoreCase("fim")) { // Se o nome não for 'fim'
                // --- Geração e exibição do convite ---
                System.out.println("\n-------------------------------------");
                System.out.println("Convite para " + nomeAmigo + ":");
                System.out.println("\nE aí, " + nomeAmigo + "!");
                System.out.println("Que tal um(a) " + atividade + " neste fim de semana?");
                System.out.println("Será no(a) " + dataHora + " em " + local + ".");
                System.out.println("Por favor, " + confirmacao);
                System.out.println("Conto com a sua presença!");
                System.out.println("Abraço,");
                System.out.println("[Seu Nome]"); // Você pode colocar seu nome aqui
                System.out.println("-------------------------------------\n");
            }
            
        } while (!nomeAmigo.equalsIgnoreCase("fim")); // Continua enquanto o usuário não digitar 'fim'

        System.out.println("Convites gerados! Tenha um ótimo fim de semana!");
        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}
