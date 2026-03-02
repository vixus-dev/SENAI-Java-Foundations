package Lição_3;

import java.util.ArrayList;

public class Exercico6_Array {

	public static void main(String[] args) {
		
		String ListaDeCompras = "leite,pão,ovos,café,frutas";
		ListaDeCompras.split(",");
		
		ArrayList <String> lista = new ArrayList<>();
		int startindex = 0;
		int endindex = 4;
		
		ArrayList <String> sublista = (ArrayList<String>) lista.subList(startindex,endindex);
		System.out.println("Lista de frutas");
		for (String Lista : sublista) {
			System.out.println(sublista);
		}
	}
}
