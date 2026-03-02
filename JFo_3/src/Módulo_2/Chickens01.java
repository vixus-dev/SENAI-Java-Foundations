package Módulo_2;

public class Chickens01 {

	public static void main(String[] args) {
		
		int eggsPerChicken;
		int chickenCount;
		int TotalEggs; 
		
		eggsPerChicken = 4;
		chickenCount = 8;
		
		//Segunda
		System.out.println("----[ Segunda-Feira ]----");
		System.out.println("O fazendeiro Brown tem " + chickenCount + " galinhas!");
		
		//terça
		System.out.println("----[ Terça-Feira ]----");
		chickenCount ++;
		System.out.println("O fazendeiro ganha 1 galinha (Total: " + chickenCount + ")");
		
		//quarta
		System.out.println("----[ Quarta-Feira ]----");
		chickenCount /= 2;
		System.out.println("Um animal veio e comeu m͟e͟t͟a͟d͟e͟ das galinhas! (Total: " + chickenCount + ")");
		
		//quinta
		System.out.println("----[ Quinta-Feira ]----");
		TotalEggs = chickenCount * eggsPerChicken;
		System.out.println("Ao final o Fazendeiro Brown recolheu " + TotalEggs + " ovos!");
		
	}
	
	/*As galinhas do Fazendeiro Brown sempre colocam eggsPerChicken ovos ao meio-dia, e ele recolhe no mesmo dia
	 * Na segunda-feira, o Fazendeiro Brown tem chickenCount galinhas
	 * Na terça-feira de manhã, o Fazendeiro Brown ganha 1 galinha
	 * Na quarta-feira de manhã, um animal come metade das galinhas!
	 * Quantos ovos o Fazendeiro Brown recolheu se ele começa com : eggsPerChicken = 5, chickenCount = 3 -> total EGGS = 10
	 * 																 eggsPerChicken = 4, chickenCount = 8 -> total EGGS = 16;
	 */
}
