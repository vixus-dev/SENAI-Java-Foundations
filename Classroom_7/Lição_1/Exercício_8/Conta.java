package Exercício_8;

public class Conta {

	private int numero;
	private double saldo = 0;
	private double limite;
	private Cliente titular;
	
	public Conta (int numero,double saldo ,double limite,Cliente titular) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.titular = titular;
	}
	
	public boolean sacar (double valor) {
		if (valor > limite) {
			System.out.println("Não é possivel realizar o saque! Saldo Insulficiente");
			return false;
		} else {
			saldo -= valor;
			return true;
		}
	}
	
	public void depositar (double valor) {
		saldo += valor;
	}
	
	public void exibirExtrato() {
		System.out.println("\nNome: " + titular.getNome()+
						   "\nCPF: " + titular.getCPF()+
						   "\nData de Nascimento: " + titular.getDataNascimento());
		System.out.println("Número da conta: " + numero);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
	}
	
	public boolean transferirPara(Conta destino, double valor) {
		if (valor > saldo) {
			System.out.println("Não é possivel realizar a transferencia! Saldo Insulficiente");
			return false;
		} else {
			System.out.println("Transferindo " + valor + " para " + destino.titular.getNome());
			saldo -= valor;
			destino.saldo += valor;
			return true;
		}
	}
}
