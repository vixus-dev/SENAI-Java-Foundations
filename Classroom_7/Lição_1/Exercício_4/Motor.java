package Exercício_4;

public class Motor {

	private int potencia;
	private String tipoDeCombustivel;
	
	public Motor (int potencia, String tipoDeCombustivel) {
		this.potencia = potencia;
		this.tipoDeCombustivel = tipoDeCombustivel;
	}
	
	public int getPotencia() {
		return potencia;
	}
	
	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}
}
