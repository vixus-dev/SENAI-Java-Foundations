package Exercício_9;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    public static void main(String[] args) {
    	
        List<Conta> contas = new ArrayList<>();
        
    	//criando os clientes
        Cliente cliente1 = new Cliente("Ada Lovelace", "123.456.789-10", "10/12/1815");
        Cliente cliente2 = new Cliente("Grace Hopper", "987.654.321-00", "09/12/1906");

        //criando as contas
        ContaCorrente conta1 = new ContaCorrente(cliente1,01,500,2000,0.05); // taxa de 5% por saque
        ContaPoupanca conta2 = new ContaPoupanca(cliente2,02,600,2000,0.1); // rendimento de 10% por mês
        
        contas.add(conta1);
        contas.add(conta2);
        
        //exibindo informações antes de sacar
        System.out.println("\nInformações antes de sacar");
        conta1.exibirExtrato();
        conta2.exibirExtrato();
        
        //sacando dinheiro
        conta1.Sacar(100);
        conta2.Sacar(100);
        
      //exibindo informações após de sacar e antes de render
        System.out.println("\nExibindo informações antes de render e depois de sacar");
        conta1.exibirExtrato();
        conta2.exibirExtrato();
        
       //Fazendo as contas renderem
        conta1.render();
        conta2.render();
        
       //exibindo as informações após render
        System.out.println("\nExibindo informações após render");
        conta1.exibirExtrato(); 
        conta2.exibirExtrato();
        
        }
}
