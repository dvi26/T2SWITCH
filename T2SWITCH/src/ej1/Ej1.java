package ej1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		int n1;
		// Declaro la variable
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca tu nota (1 a 10): ");
		// System out para preguntar por la ntoa
		n1 = sc.nextInt();
		// n1 = scanner para introducir la nota con el teclado
		switch (n1){
		case 0,1,2,3,4:
			System.out.println("INSUFICIENTE");
			break;
		/* switch con expresión n1, que compara la nota introducida con el case (0,1,2,3,4)
		 *  y si es alguno de ellos haga el system out diciendo que es INSUFICIENTE. Además
		 *  añado el break para que si es alguno no haga el resto de comandos
		 */
		case 5:
			System.out.println("SUFICIENTE");
			break;
		/* switch con expresión n1, que compara la nota introducida con el case (0,1,2,3,4)
		 *  y si es alguno de ellos haga el system out diciendo que es INSUFICIENTE. Además
		 *  añado el break para que si es alguno no haga el resto de comandos
		 */
		case 6:
			System.out.println("BIEN");
			break;
		/* switch con expresión n1, que compara la nota introducida con el case (0,1,2,3,4)
		 *  y si es alguno de ellos haga el system out diciendo que es INSUFICIENTE. Además
		 *  añado el break para que si es alguno no haga el resto de comandos
		 */
		case 7,8:
			System.out.println("NOTABLE");
			break;
		/* switch con expresión n1, que compara la nota introducida con el case (0,1,2,3,4)
		 *  y si es alguno de ellos haga el system out diciendo que es INSUFICIENTE. Además
		 *  añado el break para que si es alguno no haga el resto de comandos
		 */
		case 9,10:
			System.out.println("SOBRESALIENTE");
			break;
		/* switch con expresión n1, que compara la nota introducida con el case (0,1,2,3,4)
		 *  y si es alguno de ellos haga el system out diciendo que es INSUFICIENTE. Además
		 *  añado el break para que si es alguno no haga el resto de comandos
		*/
		default:
			System.out.println("El número introducido no es válido");
		// default para que si n1 no es igual a algun case, haga el system out diciendo que el número no es válido
			
		sc.close();
		// cierro el scanner
	

	}

}}
