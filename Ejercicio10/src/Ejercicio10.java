package src;

import java.util.*;

public class Ejercicio10 {

	public static void main(String[] args) {
		Ejercicio10 ejer = new Ejercicio10();
	}

	int [][] matriz = new int [3][4];
	int [][] matrizTranspuesta;

	public Ejercicio10(){
		llenarMatriz();
		System.out.println("La matriz inicial es: ");
		mostrarMatriz(matriz);
		transponerMatriz();
		System.out.println("La matriz transpuesta es:");
		mostrarMatriz(matrizTranspuesta);
	}

	public void transponerMatriz(){
		matrizTranspuesta = new int [matriz[0].length][matriz.length];
		for (int i = 0;i<matriz.length ; i++ ) {
			for (int j=0;j<matriz[0].length; j++ ) {
				matrizTranspuesta[j][i] = matriz[i][j];
			}
		}
	}
	public void llenarMatriz(){
		for (int i = 0; i< matriz.length ; i++ ) {
			for (int j= 0; j< matriz[0].length ;j++ ) {
				matriz[i][j] = generarNumeroAleatorio();	
			}
		}
	}

	public void mostrarMatriz(int [][] matriz){
		for (int i = 0; i< matriz.length ; i++ ) {
			for (int j= 0; j< matriz[0].length ;j++ ) {
				System.out.print( "*" + matriz[i][j] + "*");	
			}
			System.out.println("");
		}
	}

	public int generarNumeroAleatorio(){
		return (int)(Math.random() * 555);
	}
}