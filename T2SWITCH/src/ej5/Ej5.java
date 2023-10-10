package ej5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		String n1;
		String a;
		// Declaro las variable
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca su letra del carnet de conducir: ");
		// System out para preguntar por los dos números
		n1 = sc.nextLine();
		a = switch (n1) {
		case "E" -> "Remolque";
		case "D" -> "Autobuses";
		case "C" -> "Camiones";
		case "A" -> "Motocicletas";
		case "B" -> "Automoviles";
		default -> "Categoría no completada";
		};
		System.out.println(a);
		sc.close();
		
	}

}
