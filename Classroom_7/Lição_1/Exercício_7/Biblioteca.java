package Exercício_7;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public static void main(String[] args) {
    	
    	List<Livros> livro = new ArrayList();
    	
    	//Total de livros no inicio
        System.out.println("Total de livros no início: " + Livros.getTotalLivros()); 
        System.out.println("---------------------------------");

        // Criando os livros
        Livros livro1 = new Livros("Orgulho e Preconceito", "Jane Austen", Genero.ROMANCE);
        Livros livro2 = new Livros("O Iluminado", "Stephen King", Genero.TERROR);
        Livros livro3 = new Livros("A Ilha do Tesouro", "Robert Louis Stevenson", Genero.AVENTURA);
        
        //adicionando livros a lista
        livro.add(livro1);
        livro.add(livro2);
        livro.add(livro3);
        
        // Exibindo informações de cada um dos livros
        for (Livros livros : livro) {
			livros.exibirInfo();
		}

        // Verificando o total de livros após a adiçaõ dos livros
        System.out.println("Total de livros na biblioteca: " + Livros.getTotalLivros()); 
    }
}

