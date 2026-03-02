package Módulo_5;

import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        
        // Pular as três primeiras linhas
        scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        
        // Lê a 4ª linha
        String linha = scanner.nextLine(); // cria uma string com o conteudo da linha
        String[] partes = linha.split(" "); // cria um item de uma lista de strings toda vez que houver espaçamento
        //a lista começa no index 0 e ira até o 4

        // "BlueBumper" está na index 2, logo as coordenadas devem estar nas posições 3 e 4
        int xPosicao = Integer.parseInt(partes[3]);
        int yPosicao = Integer.parseInt(partes[4]);
       
        // Imprimir as posições
        System.out.println("X: " + xPosicao + ", Y: " + yPosicao);
        scanner.close();
    }    
}

