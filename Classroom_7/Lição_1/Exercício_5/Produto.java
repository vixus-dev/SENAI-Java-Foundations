package Exercício_5;

public class Produto {
	private String nome;
	private double preço;
	
	public Produto(String nome, double preço) {
		this.nome = nome;
		this.preço = preço;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreço() {
		return preço;
	}
}
