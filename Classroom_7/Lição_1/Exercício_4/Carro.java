package Exercício_4;

public class Carro {

	String marca;
	String modelo;
	Motor motor;
	boolean ligado = false;
	
	public Carro(String marca, String modelo, Motor motor, boolean ligado) {
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.ligado = ligado;
	}

	public void ligar() {
		if (ligado) {
			System.out.println("O carro já está ligado");
		} else {
			System.out.println("Ligando o Carro!");
			ligado = true;
		}
	}
	
	public void desligar() {
		if (ligado = false) {
			System.out.println("O carro já está desligado");
		} else {
			ligado = true;
			System.out.println("Desligando o Carro!");
		}
	}
	
	public void exibirInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Motor:"
				+ "\npotência -> " + motor.getPotencia() +"cv"
				+ "\nCombustivel -> " + motor.getTipoDeCombustivel());
		System.out.println("Está ligado? " + ligado);
	}
	
}
