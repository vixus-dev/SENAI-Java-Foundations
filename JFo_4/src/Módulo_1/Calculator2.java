package Módulo_1;

public class Calculator2 {
    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;
    
    public void findTotal(double a){
        //Calculate an individual's total after tax and tip
        //Print this value
    	double total = a * (1 + (tax + tip));
    	System.out.println(total);
    }
}
