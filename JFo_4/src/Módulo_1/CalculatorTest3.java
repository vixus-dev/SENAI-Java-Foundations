package Módulo_1;

public class CalculatorTest3 {
    public static void main(String[] args) {
        
       Calculator3 calc = new Calculator3();
       
       //Use the Calculator object and arguments supplied to findTotal()
       //to print the total for each person
       
       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
       
       double pessoa1 = 10,pessoa2 = 12,pessoa3 = 9,pessoa4 = 8,pessoa5 = 7,pessoa6 = 15,pessoa7 = 11,pessoa8 = 30;
       
       System.out.print("O total da pessoa 1 é de ");
       calc.findTotal(pessoa1);
       System.out.print("O total da pessoa 2 é de ");
       calc.findTotal(pessoa2);
       System.out.print("O total da pessoa 3 é de ");
       calc.findTotal(pessoa3);
       System.out.print("O total da pessoa 4 é de ");
       calc.findTotal(pessoa4);
       System.out.print("O total da pessoa 5 é de ");
       calc.findTotal(pessoa5);
       System.out.print("O total da pessoa 6 é de ");
       calc.findTotal(pessoa6);
       System.out.print("O total da pessoa 7 é de ");
       calc.findTotal(pessoa7);
       System.out.print("O total da pessoa 8 é de ");
       calc.findTotal(pessoa8);
       
    }    
}
