package Lição_1;

public class Exercício3 {
	public static void main(String[] args) {
        int numero1 = 20; // Linha 1
        int numero2 = 5;  // Linha 2

        // Ordem de operações
        int resultadoComplexo1 = (numero1 + numero2) * 2; // Linha 3: Primeiro (numero1+numero2), depois *2
        System.out.println("Linha 4: Resultado complexo 1: " + resultadoComplexo1);
        
        int resultadoComplexo2 = (numero1 * numero2) - 200; // Linha 5: Primeiro (numero1*numero2), depois -200
        System.out.println("Linha 6: Resultado complexo 2: " + resultadoComplexo2);
        
        int resultadoComplexo3 = (numero1 / numero2) * 10; // Linha 7: Primeiro (numero1/numero2), depois *10
        System.out.println("Linha 8: Resultado complexo 3: " + resultadoComplexo3);
    }
}
