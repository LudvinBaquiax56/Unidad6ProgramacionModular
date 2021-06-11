package src;

import java.util.*;

public class Ejercicio3 {

	public static void main (String [] args){
		Ejercicio3 ejercicio = new Ejercicio3();
	}

	int[] elementos = new int[8];
	Scanner scanner = new Scanner(System.in);

	public Ejercicio3(){
		pedirNumeros();
		pedirNumeroBusqueda();

	}

	public void pedirNumeros(){
		for (int i = 0;i < elementos.length ; i++ ) {
			System.out.println("Ingrese el numero " + ( i+ 1));
			elementos[i] = scanner.nextInt();
		}
	}

	public void pedirNumeroBusqueda(){
		System.out.println("Ingrese un numero a buscar");
		int numeroBuscar = scanner.nextInt();
		System.out.println("El resultado es " + hallarNumero(numeroBuscar));
	}

	/**
	* Halla un valor en la matriz
	*/
	public boolean hallarNumero(int numero){
		for (int i = 0;i< elementos.length ; i++ ) {
			if (numero ==elementos[i]) {
				return true;
			}
		}
		return false;
	}
}