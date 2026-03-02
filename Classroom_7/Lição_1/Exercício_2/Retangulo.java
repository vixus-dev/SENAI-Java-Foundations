package Exercício_2;

public class Retangulo {

	double base;
	double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea() {
		double area = base * altura;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 2* (base + altura);
		return perimetro;
	}
}
