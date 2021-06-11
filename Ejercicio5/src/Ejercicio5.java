package src;

import java.util.*;

public class Ejercicio5 {

	public static void main (String [] args){
		Ejercicio5 ejer = new Ejercicio5();
	}
	
	int[] alumnos = new int[100];
	int a[] = {5, 7, 2, 3, 9, 5, 6, 8, - 50};
	int b[] = {6,-50};
	int c[] = {1, 5, 4, 7, 6, 2, 7, 8, 3, 2, 9, 4, 5, 3, 6, 6, 8, 8, - 50};

	public Ejercicio5(){
		inicializarArreglo(a);
		System.out.println("Promedio del primer caso es: " + calcularPromedio());

		inicializarArreglo(b);
		System.out.println("Promedio del segundo caso es: " + calcularPromedio());

		inicializarArreglo(c);
		System.out.println("Promedio del primer caso es: " + calcularPromedio());
	}
	
	public void inicializarArreglo(int[] arreglo){
		for (int i = 0; i< arreglo.length ; i++ ) {
			alumnos[i]=arreglo[i];
		}
	}

	public double calcularPromedio(){
		int totalNotas=0;
		int contador = 0;
		while (alumnos[contador] != -50 || contador == alumnos.length) {
			totalNotas= totalNotas + alumnos[contador];
			contador++;
		}
		
		return totalNotas/(double)contador;
	}
}