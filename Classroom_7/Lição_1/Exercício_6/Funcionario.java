package Exercício_6;

public class Funcionario {

	private String nome;
	private int id;
	protected double salarioBase;
	
	public Funcionario(String nome, int id, double salarioBase) {
		this.nome = nome;
		this.id = id;
		this.salarioBase = salarioBase;
		
	}

	public double calcularSalario() {
		return salarioBase;
	}

	public String getNome() {
		return nome;
	}
	
	public int getId() {
		return id;
	}
	
	
}
