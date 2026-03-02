package Módulo_3;

import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[]){
    	//criando um scanner
    	Scanner leitor = new Scanner(System.in);
    	
    	char espaço = ' ';
    	//definindo Strings
        String espaçoEmBranco = " "; // <- foi criada apenas para o uso do concat
        
    	System.out.print("Insira seu primeiro nome: ");
        String firstName = leitor.next();
        
        System.out.print("Insira seu nome do meio: ");
        String middleName = leitor.next();
        
        System.out.print("Insira seu ultimo nome: ");
        String lastName = leitor.next();
        
        String fullName = firstName + espaço + middleName + espaço + lastName;
        String fullName2 = firstName.concat(espaçoEmBranco).concat(middleName).concat(espaçoEmBranco).concat(lastName); // <- Exclusivo de Strings

        System.out.println("Seu nome completo é " + fullName);
        System.out.println("Usando concat ficaria " + fullName2);
        
        leitor.close();
    }
    
}
