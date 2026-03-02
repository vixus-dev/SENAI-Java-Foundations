package Lição_3;

public class Exercicio3 {

	public static void main(String[] args) {
		//Definindo as Variaveis
		String StrA = "Java";
		String StrB = "Java";
		String StrC = new String("Java");
		String StrD = "java";
		
		//Realizando as Comparações
		System.out.println("strA == strB :" + (StrA == StrB));
		// ➥ realiza a comparação das Strings por isso true
		System.out.println("StrA.equals(StrB :" + (StrA.equals(StrB))); 
		// ➥ realiza a comparação dos valores internos das Strings por isso true
		System.out.println("StrA == StrC :" + (StrA == StrC)); 
		// ➥ realiza a comparação das Strings porém o Valor interno de StrC é diferente de StrA
		System.out.println("StrA.equals(StrC :" + (StrA.equals(StrC))); 
		// ➥ realiza a comparação do Valor interno de ambas das Strings por isso True
		System.out.println("StrA.equals(StrD) :" + (StrA.equals(StrD))); 
		// ➥ compara o valor interno das Strings porem dá diferente pois StrD possui a primeira letra em minuscula
		System.out.println("StrA.equalsIgnoreCase(StrD) :" + (StrA.equalsIgnoreCase(StrD)));
		// ➥ compara o valor interno das Strings porem ignorando os "Cáracteres em maiusculo ou minisculo"

	}
}
