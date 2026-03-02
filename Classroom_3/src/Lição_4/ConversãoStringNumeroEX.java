package Lição_4;

public class ConversãoStringNumeroEX {
    public static void main(String[] args) {
        // String para numérico
        String strNumero = "123";
        int numInteiro = Integer.parseInt(strNumero);
        System.out.println("String para int: " + numInteiro); // Saída: 123

        String strDecimal = "45.67";
        double numDecimal = Double.parseDouble(strDecimal);
        System.out.println("String para double: " + numDecimal); // Saída: 45.67
        
        // Numérico para String
        int idade = 30;
        String strIdade1 = String.valueOf(idade);
        String strIdade2 = "" + idade; // Forma mais comum e concisa
        System.out.println("int para String (valueOf): " + strIdade1); // Saída: 30
        System.out.println("int para String (concatenação): " + strIdade2); // Saída: 30

        double peso = 75.5;
        String strPeso = String.valueOf(peso);
        System.out.println("double para String: " + strPeso); // Saída: 75.5
    }
}        


