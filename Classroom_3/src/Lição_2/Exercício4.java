package Lição_2;

public class Exercício4 {

	public static void main(String[] args) {
		 // Declaração da temperatura em Celsius (tipo double)
        double temperaturaCelsius = 25.0;

        // Cálculo da temperatura em Fahrenheit
        // Usamos 9.0/5.0 para garantir que a divisão seja de ponto flutuante
        double temperaturaFahrenheit = (temperaturaCelsius * 9.0 / 5.0) + 32;

        // Impressão dos resultados
        System.out.println("Temperatura em Celsius: " + temperaturaCelsius + "°C");
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit + "°F");


	}

}
