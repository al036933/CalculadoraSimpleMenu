package es.cristian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int opcion, n1 = 0, n2 = 0, resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("MENÚ");
        System.out.println("=====================");
        System.out.println("1.- Sumar. ");
        System.out.println("2.- Restar. ");
        System.out.println("0.- Salir. ");
        System.out.print("Elige una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.print("Primer sumando: ");
            n1 = entrada.nextInt();
            System.out.print("Segundo sumando: ");
            n2 = entrada.nextInt();
            resultado = n1+n2;
            System.out.println("" + n1 + " + " + n2 + " = " + resultado);
        } else if (opcion == 2) {
            System.out.print("Primer minuendo: ");
            n1 = entrada.nextInt();
            System.out.print("Segundo sustraendo: ");
            n2 = entrada.nextInt();
            resultado = n1-n2;
            System.out.println("" + n1 + " - " + n2 + " = " + resultado);
        }

        entrada.close();
    }
}
