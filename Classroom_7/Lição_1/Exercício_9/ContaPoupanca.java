package Exercício_9;

public class ContaPoupanca extends Conta{

	double taxaDeRendimento;
	
	public ContaPoupanca(Cliente cliente,int numero,double saldo ,double limite,double taxaDeRendimento) {
		super(cliente,numero,saldo,limite);
		this.taxaDeRendimento = taxaDeRendimento;
	}
	
	@Override
	public void render() {
		saldo += saldo * taxaDeRendimento;
	}

}
