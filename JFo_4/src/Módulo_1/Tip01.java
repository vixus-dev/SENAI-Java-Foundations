package Módulo_1;

public class Tip01 {
    public static void main(String[] args) {
    	
    	//modificadores
    	double taxa = 0.05;
    	double gorgeta = 0.15;
    	double ValorTotal = 1 + (taxa + gorgeta);
    	
    	//valores por pessoa
    	double pessoa1 = 10,pessoa2 = 12,pessoa3 = 9,pessoa4 = 8,pessoa5 = 7,pessoa6 = 15,pessoa7 = 11,pessoa8 = 30;
    	
    	System.out.println("o valor final que a pessoa 1 irá pagar é $" + pessoa1 * ValorTotal);
    	System.out.printf("o valor final que a pessoa 2 irá pagar é $%.1f\n",(pessoa2 * ValorTotal));
    	System.out.printf("o valor final que a pessoa 3 irá pagar é $%.1f\n",(pessoa3 * ValorTotal));
    	System.out.println("o valor final que a pessoa 4 irá pagar é $" + pessoa4 * ValorTotal);
    	System.out.println("o valor final que a pessoa 5 irá pagar é $" + pessoa5 * ValorTotal);
    	System.out.println("o valor final que a pessoa 6 irá pagar é $" + pessoa6 * ValorTotal);
    	System.out.println("o valor final que a pessoa 7 irá pagar é $" + pessoa7 * ValorTotal);
    	System.out.println("o valor final que a pessoa 8 irá pagar é $" + pessoa8 * ValorTotal);
        
    }    
}
