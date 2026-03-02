package Lição_1;

import java.util.Scanner;


public class Exercício2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número (" + num1 + ") é maior que o segundo (" + num2 + ").");
        } else if (num2 > num1) {
            System.out.println("O segundo número (" + num2 + ") é maior que o primeiro (" + num1 + ").");
        } else {
            System.out.println("Os dois números são iguais.");
        }

        scanner.close();
    }
}
