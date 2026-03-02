package Lição_1;

import java.util.Random;

public class VerificadorIdade {

    public static boolean testeMaiorDeIdade(int idade) {
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
    	Random aleatorio = new Random();
        int idadeJulio = aleatorio.nextInt(20); //cria um numero aleatorio até 20
        int idadeJoão = aleatorio.nextInt(50); //cria um numero aleatorio até 50

        boolean julioPodeEntrar = testeMaiorDeIdade(idadeJulio);
        boolean joãoPodeEntrar = testeMaiorDeIdade(idadeJoão);
        
        System.out.println("João pode entrar na festa? " + julioPodeEntrar); // Resultado esperado: true
        System.out.println("Maria pode entrar na festa? " + joãoPodeEntrar); // Resultado esperado: false

        System.out.println("Uma pessoa de 18 anos pode entrar? " + testeMaiorDeIdade(18)); // sim, um maior de idade pode entrar
    }
}
