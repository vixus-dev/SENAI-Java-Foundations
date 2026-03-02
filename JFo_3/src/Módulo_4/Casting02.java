package Módulo_4;

public class Casting02 {
    public static void main(String[] args) {
                
        //População mundial hoje
        long populacaoMundialAtual = 7_000_000_000L;
        System.out.println("População Mundial Atual: " + populacaoMundialAtual);
        
        //População mundial em 1950, Fonte: Divisão de População das Nações Unidas
        //2,52 Bilhões
        int populacaoAfrica   =   221_000_000;
        int populacaoAsia     = 1_402_000_000;
        int populacaoEuropa   =   547_000_000;
        int populacaoAmericas =   339_000_000;
        int populacaoOceania  =    13_000_000;
        long populaçãoEmCiquenta = (long)populacaoAfrica + populacaoAsia + populacaoEuropa + populacaoAmericas + populacaoOceania;
        System.out.println("População Mundial em 1950: " + (populaçãoEmCiquenta));
        
        //A população atual da Ásia é estimada em 60% da população mundial
        double percentualAsia = 0.6;
        long populacaoAsiaAtual = (long) (populacaoMundialAtual * percentualAsia);
        System.out.println("População Atual da Ásia: " +populacaoAsiaAtual);      
       
    }  
}

