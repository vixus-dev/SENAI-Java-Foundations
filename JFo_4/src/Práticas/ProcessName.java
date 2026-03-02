package Práticas;

import java.util.Scanner;


public class ProcessName {
    
    
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Insira seu nome: ");
        String nome = console.nextLine().trim();
        
        int espaco = nome.indexOf(' ');
        String primeiroNome;
        String ultimoNome;
        char primeiraLetra;
        
        if (espaco == -1) {
            // Caso só tenha um nome
            primeiroNome = nome;
            ultimoNome = "";
        } else {
            primeiroNome = nome.substring(0, espaco);
            ultimoNome = nome.substring(nome.lastIndexOf(' ') + 1);
        }
        
        primeiraLetra = primeiroNome.charAt(0);

        System.out.println("Seu nome é: " + ultimoNome + ", " + primeiraLetra + ".");

        console.close();
    }
}