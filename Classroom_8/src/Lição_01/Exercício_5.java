package Lição_01;

import java.util.Scanner;

public class Exercício_5 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o índice (0 a 2): ");
        int indice = scanner.nextInt();

        System.out.print("Digite o valor: ");
        int valor = scanner.nextInt();

        try {
            numeros[indice] = valor;
            System.out.println("Valor armazenado com sucesso!");
            System.out.println("[ " + numeros[0] + " , " + numeros[1] + " , " + numeros[2] + " ] ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice fora dos limites do array.");
        }

        scanner.close();
    }
}