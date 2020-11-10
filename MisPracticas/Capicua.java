/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisPracticas;

import java.util.Scanner;

/**
 *
 * @author MARTOTITA
 */
public class Capicua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int total = 0;
        boolean capicua = false;
        /*Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras..*/

        System.out.println("Introduce un número entero de, solo se puede hasta 5 cifras: ");
        int num = s.nextInt();

        if (num < 0) {

            System.out.println("El número " + num + " es negativo.");

        } else {

            if (num == 0) {

                System.out.println("No se puede realizar debido a que el número introducido es= " + num);

            } else if (num < 10) {
                capicua = true;

            } else if ((num >= 10) && (num < 100)) {

                if ((num / 100) == (num % 10)) {
                    capicua = true;

                }

            } else if ((num >= 100) && (num < 1000)) {

                if ((num / 100) == (num % 10)) {
                    capicua = true;
                }

            } else if ((num >= 1000) && (num < 10000)) {

                if ((num / 1000) == (num % 10)) {
                    capicua = true;
                }
            } else if ((num == 10000)) {

                if ((num / 10000) == (num % 10)) {
                    capicua = true;
                }
            } else {

                System.out.print("El número " + num + " es mayor de 5 cifras");

            }

            if (capicua) {
                System.out.println("\nEl numero es capicua\n");
            } else {
                System.out.println("\nEl numero no es capicua\n");
            }

        }
    }

}
