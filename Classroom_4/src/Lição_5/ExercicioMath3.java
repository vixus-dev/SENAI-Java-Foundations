package Lição_5;

public class ExercicioMath3 {

	public static void main(String[] args) {
		//definindo as Variaveis
		int a = 15,b = 7,c = 23;
		
		int doisValoresMinimos = Math.min(a,b);
		int doisValoresMaximos = Math.max(a,b);
		
		//imprimindo os Valores
		System.out.println("Valor máximo entre A e B: "  + Math.max(a,b));
		System.out.println("Valor minimo entre B e C: "  + Math.min(b,c));
		
		System.out.println("Valor minimo entre A, B e C: " + Math.min(doisValoresMinimos,c));
		System.out.println("Valor máximo entre A, B e C: " + Math.max(doisValoresMaximos,c));
	}
}
