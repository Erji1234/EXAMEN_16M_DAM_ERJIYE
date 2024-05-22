package Examen;

import java.util.Scanner;

public class PRIMO {
	public static void main(String[]arg) {
		Scanner ent = new Scanner(System.in);
		int numero=0;
		System.out.println("Buenos días Ceinmark, soy Marta Gómez\n"
				+ "Introduce un número para averiguar si es primo o no");
		try {
		numero= Integer.parseInt(ent.nextLine());
		}catch(NumberFormatException ex) {
			System.out.println("No es un numero");
		}
	}

}
