package src;

import java.util.*;

public class Ejercicio7 {

	public static void main (String [] args){
		Ejercicio7 ejer = new Ejercicio7();
	}

	int [][] matriz = new int [4][3];

	public Ejercicio7(){
		llenarMatriz();
		mostrarMatriz();
		int suma = sumarFilasPares();
		System.out.println("La suma de todos los números que estan en una fila par es: " + suma);
	}

	public void mostrarMatriz(){
		for (int i = 0; i< matriz.length ; i++ ) {
			for (int j= 0; j< matriz[0].length ;j++ ) {
				System.out.print( "*" + matriz[i][j] + "*");	
			}
			System.out.println("");
		}
	}

	public void llenarMatriz(){
		for (int i = 0; i< matriz.length ; i++ ) {
			for (int j= 0; j< matriz[0].length ;j++ ) {
				matriz[i][j] = generarNumeroAleatorio();	
			}
		}
	}

	public int sumarFilasPares(){
		int total = 0;
		for (int i = 0; i< matriz.length ; i++ ) {
			if (i%2==0) {
				for (int j= 0; j< matriz[0].length ;j++ ) {
					total += matriz[i][j];
				}	
			}
		}
		return total;
	}

	public int generarNumeroAleatorio(){
		return (int)(Math.random() * 555);
	}
}