package Exercício_3;

public class ContaBancaria {
	
	int numeroDaConta;
	double saldo = 0;
	String nomeTitular;
	
	public void depositar(double deposito){
		saldo += deposito;
		System.out.println("Você depositou " + deposito);
	}
	
	public void sacar(double saque){
		if (saque > saldo) {
			System.out.println("Impossivel realizar o saque: saldo Insulficiente");
		} else {
		saldo -= saque;
		System.out.println("Você sacou " + saque);
		}
	}
	
	public void exibirSaldo(){
		System.out.println("seu saldo atual é de: R$" + saldo);
	}
	
}
