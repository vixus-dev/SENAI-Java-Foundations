package Lição_5;
public class ExercicioMath4 {

	public static void main(String[] args) {
		//definindo Variaveis
        double anguloGraus = 30.0;
        double anguloEmRadianos = Math.toRadians(anguloGraus);
        double AnguloRadianos = Math.PI / 2;
        
        //imprimido os Valores
        System.out.println("Angulo em Graus: " + anguloGraus);
        System.out.println("seno do angulo: " +Math.sin(anguloEmRadianos));
        System.out.println("cosseno do angulo: " +Math.cos(anguloEmRadianos));
        System.out.println("angulo de PI/2 em graus: " +Math.toDegrees(AnguloRadianos));
        
    }
}
