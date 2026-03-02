package Lição_01;

public class Exercício_2 {

	public static void main(String[] args) {
		//criando a lista de elementos
		double[] elementos = {3.14, 1.618, 2.718, 0.577};
		
		//inicializando uma variavel para armazenar o maior valor
		//defini o valor dela como o indice 0 para facilitar na comparação
		double maiorValor = elementos[0];
		
		  /*
		  loop para verificação de valores
		  enquanto o i for menor que o tamanho de elementos, ele sobe 1
		  
		  Mas por que esse -1? 
		  pois o indice começa em 0 e o .length ignora o zero,
		  fazendo assim o .lenght ter 1 a mais do que realmente existem de elementos dentro da lista
		  esse -1 ajusta isto
		  */
		
		for (int i = 0; i < elementos.length - 1; i++) {
			if (elementos[i] > elementos[i + 1]) {
				//caso o valor do elemento atual seja maior que o próximo, ele define o maiorValor com o valor do elemento atual
				System.out.println("o valor " + maiorValor + " é maior que " + elementos[i+1]);
				maiorValor = elementos[i];
			} else {
				//caso o valor do elemento atual seja menor que o próximo, ele define o maiorValor como o valor do próximo elemento
				System.out.println("o valor " + maiorValor + " é menor que " + elementos[i+1]);
				maiorValor = elementos[i+1];
			} 
		}
		//imprime o valor do maior número dentre os elementos
		System.out.println("o maior valor da lista de elementos é: " + maiorValor);
	}
}
