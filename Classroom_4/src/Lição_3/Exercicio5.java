package Lição_3;

public class Exercicio5 {

	public static void main(String[] args) {
		//definindo String
		String caminhoArquivo = "/home/usuario/documentos/relatorio.pdf";
		//Imprimindo as Ordens
		System.out.println("primeira aparição de ' / ' : " + caminhoArquivo.indexOf('/'));
		System.out.println("ultima aparição de '/' :" + caminhoArquivo.lastIndexOf('/'));
		System.out.println("nome do arquivo: " + caminhoArquivo.substring(25));
		System.out.println("Extensão do arquivo: " + caminhoArquivo.substring(caminhoArquivo.length()-4));
		System.out.println("índice do ultimo . :" + caminhoArquivo.lastIndexOf("."));
		System.out.println("começa com \"\\home\" : " + caminhoArquivo.contains(caminhoArquivo.substring(1,5)));
		System.out.println("termina com \'.pdf\': " + caminhoArquivo.contains(caminhoArquivo.substring(caminhoArquivo.length() -4)));
	}
}
