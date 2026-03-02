package Módulo_1;

public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        
        //Name your friends
        calc.findTotal(10, "pessoa 1");
        calc.findTotal(12, "pessoa 2");
        calc.findTotal(9,  "pessoa 3");
        calc.findTotal(8,  "pessoa 4");
        calc.findTotal(7,  "pessoa 5");
        calc.findTotal(15, "Alex");
        calc.findTotal(11, "pessoa 6");
        calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
       System.out.print("O total da mesa é de: ");
       calc.findTotalTable(10,12,9,8,7,15,11,30);
    } 
}
