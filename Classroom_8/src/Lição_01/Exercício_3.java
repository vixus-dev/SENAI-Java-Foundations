package Lição_01;

public class Exercício_3 {

	public static void main(String[] args) {
		//criando a lista
		String[] nomes = {"Alice", "Bob", "Carlos"};
		//vendo o tamanho da lista
		int tamanho = nomes.length;
		System.out.println("tamanho da lista: " + tamanho);
		
		System.out.print("nomes da lista (ordem invertida): \n[ ");
		for (int i = nomes.length - 1; i >= 0; i--) {
			if (nomes.length -3 == i) {
				System.out.print("\" " + nomes[i] + "\" ] ");
			} else {
			    System.out.print("\" " + nomes[i] + "\", ");	
			}

		}
		
		
	}
}
