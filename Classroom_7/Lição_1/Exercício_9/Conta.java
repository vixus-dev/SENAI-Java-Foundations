package Exercício_9;

public abstract class Conta {

	Cliente cliente;
	int numero;
	double saldo = 0;
	double limite;
	
	public Conta (Cliente cliente,int numero,double saldo ,double limite) {
		this.cliente = cliente;
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
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
	
	public void Sacar(double valor) {
		saldo -= valor;
		
	}
	
	public void exibirExtrato() {
		System.out.println("\nNome: " + cliente.getNome()+
						   "\nCPF: " + cliente.getCPF()+
						   "\nData de Nascimento: " + cliente.getDataNascimento());
		System.out.println("Número da conta: " + numero);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
	}
	
	public abstract void render();
}
