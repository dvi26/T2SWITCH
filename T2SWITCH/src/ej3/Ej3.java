package ej3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int n1;
		int n2;
		final String n3;
		// Declaro las variable
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca dos números: ");
		// System out para preguntar por la ntoa
		n1 = sc.nextInt();
		// n1 = scanner para introducir la nota con el teclado
		n2 = sc.nextInt();
		// n2 = scanner para introducir la nota con el teclado
		System.out.println("A. SUMAR LOS NÚMEROS ");
		System.out.println("B. RESTAR LOS NÚMEROS ");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS ");
		System.out.println("D. DIVIDIR LOS NÚMEROS ");
		System.out.println("Seleccione una opción ");
		n3 = sc.nextLine();
		
		
		
		
		switch (n3) {
		case ("A"):
			System.out.println("El día de la semana es Lunes");
			break;
		/* switch con expresión n1, que compara el número introducido con el case 1
		 *  y si es alguno de ellos haga el system out diciendo que es Lunes. Además
		 *  añado el break para que si es el caso no haga el resto de comandos
		 */
		case ("B"):
			System.out.println("El día de la semana es Martes");
			break;
		/* switch con expresión n1, que compara el número introducido con el case 2
		 *  y si es alguno de ellos haga el system out diciendo que es Martes. Además
		 *  añado el break para que si es el caso no haga el resto de comandos
		 */
		case "C":
			System.out.println("El día de la semana es Miércoles");
			break;
		/* switch con expresión n1, que compara el número introducido con el case 3
		 *  y si es alguno de ellos haga el system out diciendo que es Miércoles. Además
		 *  añado el break para que si es el caso no haga el resto de comandos
		 */
		case "D":
			System.out.println("El día de la semana es Jueves");
			break;
		/* switch con expresión n1, que compara el número introducido con el case 4
		 *  y si es alguno de ellos haga el system out diciendo que es Jueves. Además
		 *  añado el break para que si es el caso no haga el resto de comandos
		 */
		default:
			System.out.println("Opción incorrecta");
		// default para que si n1 no es igual a algun case, haga el system out diciendo que el número no es válido
			
		sc.close();
		// cierro el scanner
	
	}

}}
