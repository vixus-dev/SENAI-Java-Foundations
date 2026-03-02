package com.Henllembart.inc;

import java.util.Random;

public class Teste {
	public static void main(String[] args) {
		Random bixa = new Random();
		boolean julio = bixa.nextBoolean();
		
		if(julio == true){
			System.out.println("João é bixa");
		}else{
			System.out.println("julio tem pau grande");
		}
		
	}
}
