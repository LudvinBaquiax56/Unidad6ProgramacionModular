package src;

import java.util.*;

public class Ejercicio11 {

	public static void main(String[] args) {
		Ejercicio11 ejer = new Ejercicio11();
	} 

	String [] nombres = new String[6];
	double [] notas = new double[6];
	String [] resultados = new String[6];
	Scanner scanner = new Scanner(System.in);

	public Ejercicio11(){
		pedirDatos();
		validarNotas();
		mostrarResultados();
	}

	public void pedirDatos(){
		System.out.println("Ingrese los datos de los estudiantes: ");
		for (int i = 0; i<nombres.length ; i ++ ) {
			System.out.println("Ingrese el nombre del estudiante No. " + (i+1));
			nombres[i] = scanner.next();
			
			do{
				if (!(notas[i]>=0 && notas[i] <= 10)) {
					System.out.println("Error nota invalida");
				}
				System.out.println("Ingrese la nota del estudiante " + nombres[i]);
				notas[i] = scanner.nextDouble();
			} while (!(notas[i]>=0 && notas[i] <= 10)); 
		}
		System.out.println("");
	}

	public void validarNotas(){
		for (int i = 0; i < notas.length ; i++ ) {
			if (notas[i]>=0 && notas[i] <= 4.99) {
				resultados[i] = "Suspenso";
			} else if (notas[i]>=5 && notas[i] <= 6.99) {
				resultados[i] = "Bien";
			} else if (notas[i]>=7 && notas[i] <= 8.99) {
				resultados[i] = "Notable";
			} else if (notas[i]>=9 && notas[i] <= 10){
				resultados[i] = "Notable";
			}
		}
	}

	public void mostrarResultados(){
		for (int i=0; i<nombres.length ; i++ ) {
			System.out.println("Nombre: " + nombres[i] +", Nota: " + notas[i] + ", Resultado: " + resultados[i]);	
		}
	}
}