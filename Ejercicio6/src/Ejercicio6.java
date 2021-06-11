package src;

import java.util.*;

public class Ejercicio6 {

	public static void main (String [] args){
		Ejercicio6 ejer = new Ejercicio6();
	}


	int [][] matriz = {{5,6,13},{14,2,4},{21,7,6}};

	public Ejercicio6(){
		System.out.println("Matriz inicial");
		mostrarMatriz();
		multiplicarMatrizPorDos();
		System.out.println("Matriz multiplicada por dos");
		mostrarMatriz();
	}

	public void mostrarMatriz(){
		for (int i = 0; i< matriz.length ; i++ ) {
			for (int j= 0; j< matriz[0].length ;j++ ) {
				System.out.print( "*" + matriz[i][j] + "*");	
			}
			System.out.println("");
		}
	}

	public void multiplicarMatrizPorDos(){
		for (int i = 0; i< matriz.length ; i++ ) {
			for (int j= 0; j< matriz[0].length ;j++ ) {
				matriz[i][j] = matriz[i][j]*2;	
			}
		}
	}

}