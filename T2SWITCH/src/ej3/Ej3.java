package ej3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		int op1;
		int op2;
		int op3;
		int op4;
		// Declaro las variable
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca dos números: ");
		// System out para preguntar por los dos números
		n1 = sc.nextInt();
		// n1 = scanner para introducir el primer número con el teclado
		n2 = sc.nextInt();
		// n2 = scanner para introducir el segundo número con el teclado
		System.out.println("A. SUMAR LOS NÚMEROS (1) ");
		System.out.println("B. RESTAR LOS NÚMEROS (2) ");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS (3) ");
		System.out.println("D. DIVIDIR LOS NÚMEROS (4)");
		System.out.println("Seleccione una opción: ");
		// System out para declarar las opciones, y el último para decir al usuario que seleccione una
		n3 = sc.nextInt();
		// n3= scanner para introducir la opción deseada
		op1 = n1+n2;
		op2 = n1-n2;
		op3 = n1*n2;
		op4= n1/n2;
		// las cuatro operaciones según las opciones

		switch (n3) {
		case (1):
			System.out.println("La suma es: " + op1);
			break;
		/* switch con expresión n1, que compara el número introducido con el case 1
		 *  y si es haga el system out diciendo que es cuanto es la suma. Además
		 *  añado el break para que si es el caso no haga el resto de comandos
		 */
		case (2):
			System.out.println("La resta es: " + op2);
			break;
		/* switch con expresión n1, que compara el número introducido con el case 2
		 *  y si es haga el system out diciendo cuanto es la resta. Además
		 *  añado el break para que si es el caso no haga el resto de comandos
		 */
		case 3:
			System.out.println("La multiplicación es: " + op3);
			break;
		/* switch con expresión n1, que compara el número introducido con el case 3
		 *  y si es haga el system out diciendo cuanto es la multiplicación. Además
		 *  añado el break para que si es el caso no haga el resto de comandos
		 */
		case 4:
			System.out.println("La división 4 es: " + op4);
			break;
		/* switch con expresión n1, que compara el número introducido con el case 4
		 *  y si es haga el system out diciendo cuanto es la división. Además
		 *  añado el break para que si es el caso no haga el resto de comandos
		 */
		default:
			System.out.println("Opción incorrecta");
		// default para que si n1 no es igual a algun case, haga el system out diciendo que el número no es válido
			
		sc.close();
		// cierro el scanner
	
	}

}}
