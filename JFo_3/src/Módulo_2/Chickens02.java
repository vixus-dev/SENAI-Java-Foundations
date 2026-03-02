package Módulo_2;

public class Chickens02 {

	public static void main(String[] args) {
		
		char moeda = '$';
		int ovos = 0;
		double dias = 0;
		int diasDoMês = 30;
		double preço = 0.18;
		
		//segunda
		System.out.println("----[ Segunda-Feira ]----");
		ovos += 100;
		dias ++ ;
		System.out.println("Fred Recolheu 100 Ovos (Total: " + ovos + " )");
		
		//terça
		System.out.println("----[ Terça-Feira ]----");
		ovos += 121;
		dias ++ ;
		System.out.println("Fred Recolheu 121 Ovos (Total: " + ovos + " )");
		
		//quarta
		System.out.println("----[ Quarta-Feira ]----");
		ovos += 117;
		dias ++ ;
		System.out.println("Fred Recolheu 117 Ovos (Total: " + ovos + " )");
		
		//Total
		double médiaDiaria = ovos / dias ;
		double ovosEmUmMês = médiaDiaria * diasDoMês;
		
		System.out.println("\n----[ Total Semana ]----");
		System.out.println("A média diaria dos ovos recolhidos é: " + médiaDiaria);
		
		System.out.println("\n----[ Média de um mês ]----");
		System.out.println("Usando a média de ovos desses 3 dias decorridos " + médiaDiaria + " é possivel chegar a seguinte conclusão:");
		System.out.println("Em um mês (30 dias) os ovos recolhidos iriam ser recolhidos um total de " + ovosEmUmMês + " ovos");
		System.out.println("------------------------------");
		System.out.println("Considerando que o preço de cada ovo é de " + moeda + preço);
		System.out.println("Após um mês os lucros seriam de aproximadamente " + moeda + ovosEmUmMês*preço + " Dolares");
		
	}
	
	/*Na segunda-feira, o Fazendeiro Fred recolhe 100 ovos
	 *Na terça-feira, ele recolhe 121 ovos 
	 *Na quarta-feira, ele recolhe 117 ovos
	 *Qual é a dailyAverage (média diária) de ovos recolhidos?
	 *Quantos ovos poderiam ser esperados em uma monthlyAverage (média mensal) de 30 dias?
	 *Se um ovo pode ser vendido com um lucro de US$ 0,18, qual é o monthlyProfit (lucro mensal) total dos ovos?
	 */
}
