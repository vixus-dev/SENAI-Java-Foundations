package Módulo_5;

import javax.swing.JOptionPane;

public class input01 {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Insira um número: ");
		//int b = Integer.parseInt(a);
		int b = JOptionPane.showConfirmDialog(null, "O numero escolhido foi esse? " + (Integer.parseInt(a) + 1), "JPanel Teste", 0);
		System.out.println(b);
	}	
}
