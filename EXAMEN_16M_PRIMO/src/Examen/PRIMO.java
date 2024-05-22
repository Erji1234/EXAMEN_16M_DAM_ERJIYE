package Examen;

import java.util.Scanner;

public class PRIMO {
	public static void main(String[]arg) {
		Scanner ent = new Scanner(System.in);
		int numero=0;
		System.out.println("Buenos días Ceinmark, soy Marta Gómez\n"
				+ "Introduce un número para averiguar si es primo o no");
		numero= Integer.parseInt(ent.nextLine());
	
		if (numero <= 1) {
            System.out.println("El número debe ser mayor que 1.");
        } else {
            boolean esPrimo = true;
            System.out.print("Divisores de " + numero + ": ");

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.print(i + " ");
                }
                if (i != 1 && i != numero && numero % i == 0) {
                    esPrimo = false;
                }
            }
            
            System.out.println();
            if (esPrimo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        }
	}

}
