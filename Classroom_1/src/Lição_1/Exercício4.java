package Lição_1;

public class Exercício4 {

	public static void main(String[] args) {
        int idade = 16; // Linha 1

        System.out.println("Linha 2: Verificando a idade...");

        if (idade >= 18) { // Linha 3: A JVM verifica se 'idade' é maior ou igual a 18 (true)
            System.out.println("Linha 4: Você é maior de idade."); // Esta linha será executada
        } else { // Linha 5: Este bloco será ignorado porque a condição 'if' foi verdadeira
            System.out.println("Linha 6: Você é menor de idade.");
        }

        System.out.println("Linha 7: Fim da verificação.");

        int pontuacao = 99; // Linha 8

        if (pontuacao >= 90) { // Linha 9: 75 >= 90 é false
            System.out.println("Linha 10: Excelente!");
        } else if (pontuacao >= 70) { // Linha 11: 75 >= 70 é true
            System.out.println("Linha 12: Bom desempenho."); // Esta linha será executada
        } else { // Linha 13: Este bloco será ignorado
            System.out.println("Linha 14: Precisa melhorar.");
        }
    }
}

