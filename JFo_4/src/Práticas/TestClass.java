package Práticas;

import Práticas.ComputeMethods.computeMethods;

public class TestClass {

    public static void main(String args[]) {
        
        computeMethods métodos = new computeMethods();
        
    	System.out.println("A temperatura em Celcius é: " + métodos.fParaC(92));
    	System.out.println("A hipotenusa é de: " + métodos.hipotenusa(3,4));
    	System.out.println("a soma dos dois dados girados é de: " + métodos.rodar());
    }
}
