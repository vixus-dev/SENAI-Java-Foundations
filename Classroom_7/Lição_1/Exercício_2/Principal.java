package Exercício_2;

public class Principal {

	public static void main(String[] args) {
		Retangulo retangulo1 = new Retangulo(10,5);
		
		System.out.println("A area de um retangulo com base " + retangulo1.base + " e altura " + retangulo1.altura + " é de: " + retangulo1.calcularArea());
		System.out.println("O perimetro de um retangulo com base " + retangulo1.base + " e altura " + retangulo1.altura + " é de: " + retangulo1.calcularPerimetro());
	}
}
