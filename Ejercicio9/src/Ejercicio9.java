package src;

import java.util.*;

public class Ejercicio9 {

	public static void main(String[] args) {
		Ejercicio9 ejer = new Ejercicio9();
	}

	int suma [][];
	int [][] a = {{5,6,13},{14,2,4},{21,7,6}};
	int [][] b = {{9,4,3},{18,8,9},{1,9,3}};

	public Ejercicio9(){
		System.out.println("La primera matriz es");
		mostrarMatriz(a);
		System.out.println("La segunda matriz es");
		mostrarMatriz(b);
		sumarMatrices();
		System.out.println("Las matrices sumadas son:");
		mostrarMatriz(suma);
	}

	public void mostrarMatriz(int [][] matriz){
		for (int i = 0; i< matriz.length ; i++ ) {
			for (int j= 0; j< matriz[0].length ;j++ ) {
				System.out.print( "*" + matriz[i][j] + "*");	
			}
			System.out.println("");
		}
	}

	public void sumarMatrices(){
		if (a.length == b.length && a[0].length == b[0].length) {
			suma = new int [a.length][a[0].length];
			for (int i= 0;i < a.length ; i++) {
				for (int j=0;j<b.length ;j++ ) {
					suma[i][j]=a[i][j]+b[i][j];	
				}
			}
		} else {
			System.out.println("Los tamanios no conciden ");
		}
	}
}