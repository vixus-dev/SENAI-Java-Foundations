package Lição_1;

import java.util.Scanner;

public class Mensagens {
    public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
    	
    	
    	System.out.print("Insira seu nome: ");
    	String nome = leitor.next();
    	mostrarMensagemPersonalizada(nome);
    	
    	 leitor.close();
    }
    
    public static void mostrarMensagemPersonalizada(String nome) {
        System.out.println("Olá, " + nome + "! Tenha um ótimo dia!");
    }
    
   
}

