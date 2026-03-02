package Exercício_7;

public class Livros {

	private static int Totallivros = 0;
	
	private String nome;
	private String autor;
	private Genero genero;
	
	public Livros (String nome, String autor, Genero genero) {
		this.nome = nome;
		this.autor = autor;
		this.genero = genero;
		Totallivros ++;
	}
	
	public void exibirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Autor: " + autor);
		System.out.println("Genero: " + genero);
		System.out.println("--------------------------------");
	}
	
	public static int getTotalLivros() {
		return Totallivros;
	}
	
	
}
