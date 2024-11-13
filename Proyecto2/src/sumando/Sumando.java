package sumando;

import java.util.*;

public class Sumando {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Introduce el numero: ");
		num1 = sc.nextInt(); sc.nextLine();
		
		System.out.print("Introduce el numero: ");
		num2 = sc.nextInt();
		
		System.out.println("Suma es " + (num1 + num2));
	}

}
