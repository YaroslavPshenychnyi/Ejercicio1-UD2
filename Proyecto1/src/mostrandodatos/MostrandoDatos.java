package mostrandodatos;

import java.util.Scanner;

public class MostrandoDatos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, apellido;
		
		System.out.print("Introduce tu nombre: ");
		nombre = sc.nextLine();
		System.out.print("Introduce tu apellido: ");
		apellido = sc.nextLine();
		
		System.out.println("Tu nombre es " + nombre);
		System.out.println("Tu apellido es " + apellido);
	}

}
