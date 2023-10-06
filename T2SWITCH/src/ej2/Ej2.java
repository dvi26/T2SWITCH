package ej2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		int n1;
		// Declaro la variable
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un número(1 a 7): ");
		// System out para preguntar por el número
		n1 = sc.nextInt();
		// n1 = scanner para introducir el número con el teclado
		switch (n1){
		case 1:
			System.out.println("El día de la semana es Lunes");
			break;
		/* switch con expresión n1, que compara el número introducido con el case 1
		 *  y si es alguno de ellos haga el system out diciendo que es Lunes. Además
		 *  añado el break para que si es el caso no haga el resto de comandos
		 */
		case 2:
			System.out.println("El día de la semana es Martes");
			break;
		/* switch con expresión n1, que compara el número introducido con el case 2
		 *  y si es alguno de ellos haga el system out diciendo que es Martes. Además
		 *  añado el break para que si es el caso no haga el resto de comandos
		 */
		case 3:
			System.out.println("El día de la semana es Miércoles");
			break;
		/* switch con expresión n1, que compara el número introducido con el case 3
		 *  y si es alguno de ellos haga el system out diciendo que es Miércoles. Además
		 *  añado el break para que si es el caso no haga el resto de comandos
		 */
		case 4:
			System.out.println("El día de la semana es Jueves");
			break;
		/* switch con expresión n1, que compara el número introducido con el case 4
		 *  y si es alguno de ellos haga el system out diciendo que es Jueves. Además
		 *  añado el break para que si es el caso no haga el resto de comandos
		 */
		case 5:
			System.out.println("El día de la semana es Viernes");
			break;
		/*switch con expresión n1, que compara el número introducido con el case 5
		 *  y si es alguno de ellos haga el system out diciendo que es Viernes. Además
		 *  añado el break para que si es el caso no haga el resto de comandos
		*/
		case 6:
			System.out.println("El día de la semana es Sábado");
			break;
		/* switch con expresión n1, que compara el número introducido con el case 6
		 *  y si es alguno de ellos haga el system out diciendo que es Sábado. Además
		 *  añado el break para que si es el caso no haga el resto de comandos
		*/
		case 7:
			System.out.println("El día de la semana es Domingo");
			break;
		/* switch con expresión n1, que compara el número introducido con el case 7
		 *  y si es alguno de ellos haga el system out diciendo que es Domingo. Además
		 *  añado el break para que si es el caso no haga el resto de comandos
		*/
		default:
			System.out.println("El número introducido no es válido");
		// default para que si n1 no es igual a algun case, haga el system out diciendo que el número no es válido
			
		sc.close();
		// cierro el scanner
	

	}

}}
