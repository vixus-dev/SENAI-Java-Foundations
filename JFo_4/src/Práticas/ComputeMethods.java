package Práticas;

import java.util.Random;

public class ComputeMethods {
	
	public static class computeMethods {
		Random aleatorio = new Random();
		
		public double fParaC(double grausF) {
			double grausC;
			grausC = (5/9 * (grausF - 32));
			return grausC;
		}
		
		public double hipotenusa(int a,int b) {
			double c = Math.sqrt((Math.pow(a,2) + Math.pow(b,2)));
			return c;
		}
		
		public int rodar () {
			int dado1 = aleatorio.nextInt(1,7);
			int dado2 = aleatorio.nextInt(1,7);
			int total = dado1 + dado2;
			return total;
		}
	}
}

