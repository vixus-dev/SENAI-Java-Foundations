package Exercício_6;

public class Desenvolvedor extends Funcionario{

	//lista de tecnologias
	String[] tecnologias = {"Java", "Python", "SQL"};
	
	//usando super para importar caracteristicas da SuperClasse
	public Desenvolvedor(String nome, int id, double salarioBase,String[] tecnologias) {
		super(nome, id, salarioBase);
		this.tecnologias = tecnologias;
		
	}
	
	public double calcularSalario() {
		return salarioBase;
		
	}

}
