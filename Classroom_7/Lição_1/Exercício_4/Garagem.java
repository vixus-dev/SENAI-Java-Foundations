package Exercício_4;

public class Garagem {

	public static void main(String[] args) {
		Motor motor1 = new Motor(1000,"Alcool");
		Carro carro1 = new Carro("Ford", "Mustang", motor1, false);
		
		//ligando carro
		System.out.println("teste do ligar carro:");
		carro1.ligar();
		
		//exibindo as informações
		System.out.println("------------------------");
		System.out.println("Exibindo informações:");
		carro1.exibirInfo();
		
		//testando desligar o carro
		System.out.println("------------------------");
		System.out.println("testando o desligar o carro:");
		carro1.desligar();
		
	}
}
