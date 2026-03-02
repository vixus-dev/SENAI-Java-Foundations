package Módulo_1;

public class Calculator4 {
    public double tax = .05;
    public double tip = .15;
    
    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating
    public void findTotal(double price, String name){
        double total = price*(1+tax+tip);
        System.out.println(name +": $" +total);

    }
    
    public void findTotalTable(double valor1,double valor2,double valor3,double valor4,double valor5,double valor6,double valor7,double valor8) {
    	double total = (valor1*(1+tax+tip)) + (valor2*(1+tax+tip)) + (valor3*(1+tax+tip)) + (valor4*(1+tax+tip)) + (valor5*(1+tax+tip)) + (valor6*(1+tax+tip)) + (valor7*(1+tax+tip)) + (valor8*(1+tax+tip));
    	System.out.println(total);
    }
}
