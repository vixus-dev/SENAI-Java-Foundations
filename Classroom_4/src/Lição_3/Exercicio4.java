package Lição_3;

public class Exercicio4 {

	public static void main(String[] args) {
		//definindo as Variveis
		String texto = " Olá, Programadores Java! ";
		System.out.println(texto);
		//Alterando as Variveis
		String textoMaiusculo = texto.toUpperCase();
		String textoMinusculo = texto.toLowerCase();
		String textoSemEspacos = texto.trim();
		String textoSubstituido = texto.replace("a", "@");
		
		//Imprimindo as Variaveis
		System.out.println("Texto em maiusculas: " + textoMaiusculo);
		System.out.println("Texto em minusculas: " + textoMinusculo);
		System.out.println("Texto sem espaços: " + textoSemEspacos);
		System.out.println("Texto substituido: " + textoSubstituido);
		System.out.println("contém \"Java\": " + texto.contains("Java"));
		
	}
}
