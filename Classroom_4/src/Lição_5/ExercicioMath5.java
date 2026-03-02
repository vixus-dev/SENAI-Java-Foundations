package Lição_5;

public class ExercicioMath5 {

	public static void main(String[] args) {
        // Definindo o Triangulo
        double cateto1 = 3.0;
        double cateto2 = 4.0;
        //Hipotenusa do Triangulo
        double hipotenusa = Math.hypot(cateto1, cateto2);
        System.out.println("Hipotenusa (catetos 3 e 4): " + hipotenusa);

        // Calcula e imprime o logaritmo natural de 100
        double logNatural = Math.log(100);
        System.out.println("Logaritmo natural de 100: " + logNatural);

        // Calcula e imprime o logaritmo de base 10 de 1000
        double logBase10 = Math.log10(1000);
        System.out.println("Logaritmo de base 10 de 1000: " + logBase10);
    }
}
