package src;

import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args){
		Ejercicio4 ejercicio = new Ejercicio4();
		ejercicio.Ejercicio4();
	}
	
	int[] elementos = new int[10];
	int numeroMayor;

	public void Ejercicio4 (){
		llenarMatriz();
		for (int i = 0; i < elementos.length ; i++ ) {
			mostrarDato(i);
		}
		System.out.println("---------------------------");
		hallarNumeroMayor();
		System.out.println("El numero mayor es:" + numeroMayor);
		mostrarDiferencia();
	}

	public void llenarMatriz (){
		for (int i = 0;i < elementos.length ; i++ ) {
			elementos[i]=generarNumeroAleatorio();
		}
	}

	public void mostrarDato(int i){
		System.out.println( (i+1) +".El numero aleatorio generado es: " + elementos[i]);
	}

	public void hallarNumeroMayor(){
		numeroMayor = elementos[0];
		for (int i = 0;i< elementos.length ; i++ ) {
			if (numeroMayor < elementos[i]) {
				numeroMayor = elementos[i];
			}
		}
	}

	public void mostrarDiferencia(){
		for (int i=0;i<elementos.length ; i++ ) {
			System.out.println("El numero: " + elementos[i] + "con el numero mayor es " 
				+ hallarDiferencia(numeroMayor,elementos[i]));
		}
	}

	public int hallarDiferencia(int numeroA, int numeroB){
		return numeroA - numeroB;
	}

	public int generarNumeroAleatorio(){
		return (int)(Math.random() * 1000);
	}
}