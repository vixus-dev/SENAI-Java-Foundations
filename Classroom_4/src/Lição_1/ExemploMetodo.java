package Lição_1;

public class ExemploMetodo {
    // Definição de um método chamado 'saudacao'
    // Este método não recebe parâmetros (parênteses vazios)
    // e não retorna nenhum valor (void)
    public static void saudacao() {
        System.out.println("Olá! Este é um método em Java.");
    }
    
    // Definição de um método chamado 'somar'
    // Este método recebe dois parâmetros inteiros (numeroA e numeroB)
    // e retorna um valor inteiro (int)
    public static int somar(int numeroA, int numeroB) {
        int resultado = numeroA + numeroB;
        return resultado; // Retorna a soma
    }
    
    public static void main(String[] args) {
        // Chamando o método 'saudacao'
        saudacao();
        // Chamando o método 'somar' e armazenando o resultado
        int resultadoDaSoma = somar(5, 10);
        System.out.println("O resultado da soma é: " + resultadoDaSoma); // Imprime: O resultado da soma é: 15
        // Chamando o método 'somar' diretamente dentro de uma impressão
        System.out.println("Outra soma: " + somar(3, 7)); // Imprime: Outra soma: 10
    }
}
