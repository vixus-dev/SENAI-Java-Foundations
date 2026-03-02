package Lição_4;

public class ConversaoExplicitaEX {
	//Narrowing Conversion / Conversão de Estreitamento ou Type Casting
    public static void main(String[] args) {
        // double para int (perda da parte decimal)
        double meuDouble = 9.78;
        int meuInt = (int) meuDouble; // Conversão explícita: double (8 bytes) para int (4 bytes)
        System.out.println("double para int (truncamento): " + meuInt); // Saída: 9 (o .78 é descartado)

        // long para int (possível perda de dados se o long for muito grande)
        long meuLong = 123456789123L; // Um número grande
        int outroInt = (int) meuLong; // Conversão explícita
        System.out.println("long para int (possível perda): " + outroInt); // Saída: 588147139 (diferente do original devido ao estouro)
        
     // float para int (perda da parte decimal)
        float meuFloat = 7.99f;
        int meuIntNovo = (int) meuFloat; // Conversão explícita
        System.out.println("float para int (truncamento): " + meuIntNovo); // Saída: 7

        // int para byte (possível perda de dados se o int for muito grande)
        int meuIntPequeno = 120; // byte vai de -128 a 127
        byte meuByte = (byte) meuIntPequeno; // Conversão explícita
        System.out.println("int para byte: " + meuByte); // Saída: 120

        int meuIntGrande = 130; // Fora do intervalo de byte
        byte outroByte = (byte) meuIntGrande; // Conversão explícita
        System.out.println("int (130) para byte: " + outroByte); // Saída: -126 (resultado inesperado devido ao estouro/wrap-around)
    }
}


