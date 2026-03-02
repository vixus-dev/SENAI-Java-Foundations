package Exercício_3;

public class Principal {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		conta.nomeTitular = "Maria";
		conta.numeroDaConta = 1123;
		
		conta.exibirSaldo();
		conta.depositar(100.50);
		conta.exibirSaldo();
		
		conta.sacar(150);
		conta.sacar(70);
		conta.exibirSaldo();
	}
}
