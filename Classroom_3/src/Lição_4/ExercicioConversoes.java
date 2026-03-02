package Lição_4;

public class ExercicioConversoes {
    public static void main(String[] args) {
       		// --- Exercício 1 ---
        System.out.println("--- Exercício 1 ---");
        // Seu código aqui
        int valorInt = 25;
        double valorDouble = valorInt; // Conversão implícita
        
        System.out.println("Valor int: " + valorInt);
        System.out.println("Valor double: " + valorDouble);
        // Comentário: A conversão é implícita porque um int (tipo menor) está sendo convertido para um double (tipo maior), e não há perda de dados.
        
     // --- Exercício 2 ---
        System.out.println("\n--- Exercício 2 ---");
        // Variaveis
        double precoComCentavos = 19.99;
        int precoInteiro = (int) precoComCentavos; // Conversão Explicita
        //Impressão do código
        System.out.println("O preço Inteiro é: " + precoInteiro);
        System.out.println("O preço com Centavos é: " + precoComCentavos);
     // Comentário: A conversão é Explicita porque um double (tipo maior) está sendo convertido para um int (tipo menor), acontece a perca dos numeros decimais
        
     // --- Exercício 3 ---
        System.out.println("\n--- Exercício 3 ---");
        // Variaveis
        int numeroGrande = 200;
        byte numeoroPequeno = (byte)numeroGrande; // Conversão Explicita
        //impressão do código
        System.out.println("O Numero grande tem valor de: " + numeroGrande);
        System.out.println("O Numero grande convertido para 'byte' tem o valor de: " + numeoroPequeno);
        //Comentário: A conversão é Explicita porque um int (tipo maior) está sendo convertido para um byte (tipo menor),
        //devido ao int ser maior que o byte, quando o valor passa de 127, ele retorna para -127 somando as casas excecedentes
        
       // --- Exercício 4 ---
        System.out.println("\n--- Exercício 4 ---");
        // Strings
        String stringNumeroInteiro = "42";
        String stringNumeroDecimal = "10.5";
        //Variaveis
        int idadeConvertida = Integer.parseInt(stringNumeroInteiro);
        double pesoConvertido = Double.parseDouble(stringNumeroDecimal);
        //Comentário: aqui está convertendo as Strings em valores numéricos usando .parse[variavel](string)
        
        //impressão do código
        System.out.println(idadeConvertida + 1); // somando 1 ao valor de idadeConvertida
        System.out.println(pesoConvertido * 2.0); // duplica o valor de pesoConvertido
        
       // --- Exercício 5 ---
        System.out.println("\n--- Exercício 5 ---");
        //variaveis
        int quantidadeProdutos = 7;
        double temperaturaAtual = 24.7;
        //Strings
        String stringquantidade = String.valueOf(quantidadeProdutos);
        String stringTemperatura = String.valueOf(temperaturaAtual);
        //Comentário: aqui está transformando o valor das variaveis em uma string usando Sting.valueOf(Variavel)
        
        //impressão do código
        System.out.println("A quantidade de produtos é: " + stringquantidade);
        System.out.println("A temperatura atual é: " + stringTemperatura);
        
        System.out.println(""); // pulando uma linha (preguiça de usar \n)
        
        //impressão do tamanho das strings, tambem confirmando que as variaveis foram transformadas em strings
        System.out.println("O tamanho da stringquantidade é: " + stringquantidade.length());
        System.out.println("O tamanho da stingTemperatura é: " + stringTemperatura.length());


    }
}
