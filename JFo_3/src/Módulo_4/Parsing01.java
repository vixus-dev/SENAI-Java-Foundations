package Módulo_4;

public class Parsing01 {

	public static void main(String[] args) {
		String preçoDaCamisa = "15";
		String taxaImposto = "0.05";
		String gibberish = "887ds7nds87dsfs";
		
		int preço = Integer.parseInt(preçoDaCamisa);
		double taxa = Double.parseDouble(taxaImposto);
		
		double imposto = preço*taxa;
		
		System.out.println(imposto);
		System.out.println(gibberish);
	}
}
