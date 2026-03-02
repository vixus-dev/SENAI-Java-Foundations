package Lição_01;

public class Exercício_1 {
	
	public static void main(String[] args) {
		
		int[] numeros = {10,20,30,40,50};
		int totalNumeros = 0;
		
		for (int n = 0; n < numeros.length; n++) {
			totalNumeros += numeros[n];
		}
		
		System.out.println(totalNumeros);

	}
}
