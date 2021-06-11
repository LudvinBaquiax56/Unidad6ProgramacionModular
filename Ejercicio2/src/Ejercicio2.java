package src;

import java.util.*;

public class Ejercicio2 {

	public static void main (String [] args){
		Ejercicio2 t = new Ejercicio2();
	}

	int[] elementos = new int[10];
	Scanner scanner = new Scanner(System.in);
	int numeroMayor;

	public Ejercicio2(){
		llenarMatriz();
		int noMaximo = elementos[0];
		for (int i = 0; i < elementos.length; i++ ) {
			elementos[i]=generarNumeroAleatorio();
		}

		for (int i = 0; i < elementos.length ; i++ ) {
			mostrarDato(i);
		}

		hallarNumeroMayor();

		System.out.println("El numero mayor es: " + numeroMayor + " y se repite " + hallarRepetido() + " veces");
	}

	/**
	* Lenna la matriz con numeros aleatorios entre 0 y 99
	*/
 	public void llenarMatriz (){
		for (int i = 0;i < elementos.length ; i++ ) {
			elementos[i]=generarNumeroAleatorio();
		}
	}

	public void mostrarDato(int i){
		System.out.println( (i+1) + ". "+ elementos[i]);
	}

	public int hallarRepetido(){
		int total=0;
		for (int i = 0; i < elementos.length ; i++ ) {
			if (numeroMayor==elementos[i]) {
				total++;
			}
		}
		return total;
	}

	public void hallarNumeroMayor(){
		numeroMayor = elementos[0];
		for (int i = 0;i< elementos.length ; i++ ) {
			if (numeroMayor < elementos[i]) {
				numeroMayor = elementos[i];
			}
		}
	}


	public int generarNumeroAleatorio(){
		return (int)(Math.random() * 99);
	}

}