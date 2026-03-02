package Exercício_6;

public class Gerente extends Funcionario{

	private double bonus;
	
	//usando super para importar caracteristicas da SuperClasse
	public Gerente(String nome, int id, double salarioBase, double bonus) {
		super(nome, id, salarioBase);
		this.bonus = bonus;
		
	}
	
	//usando o overrite para sobreescrever o método adicionando o bonûs 
	@Override
	public double calcularSalario() {
		double salarioFinal = salarioBase + bonus;
		return salarioFinal;
		
	}

}
