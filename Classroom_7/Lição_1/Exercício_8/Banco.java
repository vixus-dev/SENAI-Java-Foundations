package Exercício_8;

public class Banco {

	public static void main(String[] args) {
		//criando os clientes
		Cliente cliente1 = new Cliente("Sergio","40028922","10102007");
		Cliente cliente2 = new Cliente("Julio","09213487","1962008");
		
		//criando as contas dos clientes
		Conta conta1 = new Conta(01,2000,10000,cliente1);
		Conta conta2 = new Conta(02,1500,10000,cliente2);
		
		//Adicionando um saldo adicional a conta 1
		conta1.depositar(1000);
		
		//fazendo a transferencia da conta 1 para a conta 2

		conta1.transferirPara(conta2,500);
		
		//exibindo os extratos
		System.out.println("Exibindo extratos de cada um dos clientes:");
		conta1.exibirExtrato();
		conta2.exibirExtrato();
		
	}
}
