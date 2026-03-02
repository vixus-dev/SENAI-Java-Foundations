package Lição_1;

import java.util.Scanner;

public class Calculadora {

    public static int calcularDobro(int numero) {
    	//pede para inserir um número INT para assim dobrar seu valor
        int dobro = numero * 2;
        return dobro; 
    }

    public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
    	
    	System.out.print("Insira um número inteiro: ");
        int numeroOriginal = leitor.nextInt(); //cria a Uma INT
        int resultadoDobro = calcularDobro(numeroOriginal); //dobra a INT criada
        
        System.out.println("O dobro de " + numeroOriginal + " é: " + resultadoDobro);
        
        leitor.close();
    }
}

