package Exercício_9;

public class ContaCorrente extends Conta{

	private double taxaDeOperação;
	
	public ContaCorrente(Cliente cliente,int numero,double saldo ,double limite,double taxaDeOperação) {
		super(cliente,numero,saldo,limite);
		this.taxaDeOperação = taxaDeOperação;
	}
	
	public void render() {
		//faz nada!!
	}
	
	@Override
	public void Sacar(double valor) {
		saldo -= valor * (1 + taxaDeOperação);
	}

}
