package Módulo_1;

public class CalculatorTest2 {
    public static void main(String[] args) { 
        //Instantiate a Calculator2 object
        Calculator2 calculadora = new Calculator2();
        
        //Access the Calculator2 object's fields and methods
        //to find the total for each member of the birthday party
        System.out.print("Acessando o método findtotal com o objeto calculadora: ");
        calculadora.findTotal(1);
        
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
        
        calculadora.findTotal(pessoa1);
        calculadora.findTotal(pessoa2);
        calculadora.findTotal(pessoa3);
        calculadora.findTotal(pessoa4);
        calculadora.findTotal(pessoa5);
        calculadora.findTotal(pessoa6);
        calculadora.findTotal(pessoa7);
        calculadora.findTotal(pessoa8);
        
    }
}
