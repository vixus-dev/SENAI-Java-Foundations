package Módulo_4;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
        	System.out.println("----< Jokenpô >----");
            System.out.println("0 -> pedra");
            System.out.println("1 -> papel");
            System.out.println("2 -> tesoura");
            System.out.print("Insira um número de 0 a 2: ");
            
            int escolhaJogador = scanner.nextInt();
            int escolhaBot = aleatorio.nextInt(3);
            
            if (escolhaJogador <= escolhaBot) {
    			System.out.println("Você perdeu! escolha do bot:" + escolhaBot);
    		} else if (escolhaJogador == 0 && escolhaBot == 2) {
    			System.out.println("Você venceu! escolha do bot:" + escolhaBot);
    		} else if (escolhaBot == 0 && escolhaJogador ==2) {
    			System.out.println("Você perdeu! escolha do bot:" + escolhaBot);
    		}else if (escolhaJogador >= escolhaBot){
    			System.out.println("Você venceu! escolha do bot:" + escolhaBot);
    		}else {
				System.out.println("Insira um número valido");
			}
        }
    }
}
