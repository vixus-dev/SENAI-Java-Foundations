package Lição_2_App;

import static java.lang.Math.PI;      // Importa o campo estático PI da classe Math
import static java.lang.Math.pow;    // Importa o método estático pow da classe Math
import static java.lang.System.out; // Importa o campo estático out da classe System

import Lição_2_Geometria.*;
import Lição_2_Utilidades.Calculadora;


public class Principal {

	public static void main(String[] args) {
		Calculadora calc= new Calculadora();
		
		//variaveis
		int resultadoSoma = calc.somar(20,10);
		int resultadoSubtração = calc.subtrair(30,5);
		
		System.out.println(resultadoSoma);
		System.out.println(resultadoSubtração); 
		//Objetos
        Circulo meuCirculo = new Circulo(7.0);
        Retangulo meuRetangulo = new Retangulo(10.0, 5.0);
        
        out.println("Exercício 4: Usando import estático");
        
        // Usando a Calculadora
        out.println("Soma (via Calculadora): " + calc.somar(100, 200));

        // Usando Circulo e Retangulo
        out.println("Área do Círculo (raio " + meuCirculo.getRaio() + "): " + meuCirculo.calcularArea());
        out.println("Área do Retângulo (largura " + meuRetangulo.getLargura() + ", altura " + meuRetangulo.getAltura() + "): " + meuRetangulo.calcularArea());

        // Agora, usando PI e pow (potenciação) diretamente, sem Math.
        double outroRaio = 3.0;
        double areaComStaticImport = PI * pow(outroRaio, 2); // Não precisa Math.PI e Math.pow
        out.println("Área de outro círculo (raio " + outroRaio + ") usando static import: " + areaComStaticImport);

        // Usando 'out' diretamente para System.out
        out.println("Esta mensagem foi impressa usando 'out' via import estático.");

	}

}
