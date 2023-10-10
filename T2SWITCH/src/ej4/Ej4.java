package ej4;

import java.util.Scanner;

public class Ej4 {
	
	public static void main(String[] args) {
			String n1;
			String n2;
			boolean cond1;
			boolean cond2;
			int a;
			int b;
			// Declaro las variable
			Scanner sc = new Scanner(System.in);
			// Abro el scanner
			System.out.println("Introduzca el resultado de la primera tirada: ");
			// System out para preguntar por los dos números
			n1 = sc.nextLine();
			// n1 = scanner para introducir el primer número con el teclado
			System.out.println("Introduzca el resultado de la segunda tirada: ");
			n2 = sc.nextLine();
			// n2 = scanner para introducir el segundo número con el teclado	
			a = switch (n1) {
			case "UNO" -> 1;
			case "DOS" -> 2;
			case "TRES" -> 3;
			case "CUATRO" -> 4;
			case "CINCO" -> 5;
			case "SEIS" -> 6;
			default -> 0;
			};
			b = switch (n2) {
			case "UNO" -> 1;
			case "DOS" -> 2;
			case "TRES" -> 3;
			case "CUATRO" -> 4;
			case "CINCO" -> 5;
			case "SEIS" -> 6;
			default -> 0;
			};
			cond1 = a==0;
			cond2 = a==0;
			
			if (cond1 || cond2)
			System.out.println("Algún dato está mal introducido");
			else{
			System.out.println("La suma de ambas tiradas es: " + (a+b));
			
			sc.close();
			
			}
	}}
	
				
		
