package Módulo_5;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Pressione OK para fazer absolutamente nada",
                "Titulo",
                2);

        String input1 = (String)JOptionPane.showInputDialog(null,
                "Escreva qualquer coisa!",
                "Titulo descolado",
                1,
                null,
                null,
                "Escrever é para os fracos");
        
        JOptionPane.showMessageDialog(null,
                "você foi julgado por escrever: " + input1,
                "Titulo",
                0);
        
        
       /*  String[] acceptableValues = {"Sentar no Bolo", "Comer o Bolo"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Selecione uma opção",
                "Titulo Maneiro",
                1,
                null,
                acceptableValues,
                acceptableValues[0]);
      */          
    }
}
