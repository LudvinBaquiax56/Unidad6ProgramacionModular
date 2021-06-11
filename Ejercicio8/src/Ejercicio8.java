package src;

import java.util.*;

public class Ejercicio8 {

	public static void main (String [] args){
		Ejercicio8 ejer = new Ejercicio8();
	}

	String[] arregloA = new String[5];
	String[] arregloB = new String[5];
	Scanner scanner = new Scanner(System.in);

	public Ejercicio8(){
		System.out.println("Ingrese los elementos del primer arreglo");
		ingresarElementos(arregloA);
		System.out.println("Ingrese los elementos del segundo arreglo");
		ingresarElementos(arregloB);
		compararArreglos();
	}

	public void ingresarElementos(String[] arreglo){
		for (int i = 0; i<arreglo.length ; i++ ) {
			System.out.println("Ingrese la palabra No." + (i+1));
			arreglo[i] = scanner.next();
		}
	}

	public void compararArreglos(){
		for (int i=0; i<arregloA.length; i++ ) {
			System.out.print("El indice es: " +(i+1) +",");
			if (arregloA[i].length() == arregloB[i].length()) {
				System.out.println("El tamanio es: " + arregloA[i].length());
				System.out.println("Iguales en tamanio");
			}else{
				System.out.println("Tamanio, Palabra A: " + arregloA[i].length() + " Palabra B:" + arregloB[i].length());
				System.out.println("Diferentes en tamanio");
			}
		}
	}

}