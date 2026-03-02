package Lição_1;

public class Exercício3 {

	public static void main(String[] args) {
		
		int número = 1;
        int soma = 0;

        while (número <= 50) {
            if (número % 2 == 0) {
                soma += número;
            }
            número++;
        }

        System.out.println("Soma dos números pares de 1 até 50: " + soma);
    }
}

