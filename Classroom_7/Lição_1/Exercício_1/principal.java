package Exercício_1;

public class principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.idade = 17;
		pessoa1.nome = "julio";
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "victor";
		pessoa2.idade = 18;
		
		pessoa1.saudação();
		pessoa2.saudação();
	}
}
