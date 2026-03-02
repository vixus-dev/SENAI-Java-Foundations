package Lição_4;

public class ConversaoImplicitaEX {
	//Widening Conversion / Conversão de Ampliação
    public static void main(String[] args) {
        // int para long
        int meuInt = 100;
        long meuLong = meuInt; // Conversão implícita: int (4 bytes) para long (8 bytes)
        System.out.println("int para long: " + meuLong); // Saída: 100

        // int para double
        int outroInt = 25;
        double meuDouble = outroInt; // Conversão implícita: int (4 bytes) para double (8 bytes)
        System.out.println("int para double: " + meuDouble); // Saída: 25.0

     // float para double
        float meuFloat = 3.14f;
        double outroDouble = meuFloat; // Conversão implícita: float (4 bytes) para double (8 bytes)
        System.out.println("float para double: " + outroDouble); // Saída: 3.140000104904175 (precisão do float)

        // byte para int
        byte meuByte = 5;
        int meuIntNovo = meuByte; // Conversão implícita: byte (1 byte) para int (4 bytes)
        System.out.println("byte para int: " + meuIntNovo); // Saída: 5
    }
}
