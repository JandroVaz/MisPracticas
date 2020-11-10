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
public class LaUv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);

        System.out.println("Ejercicios de la dibujar una L\nDeme la altura= ");
        int h = s.nextInt();

        for (int i = 0; i < h - 1; i++) {
            System.out.print("*");
            for (int j = 0; j < (h / 2) + 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.print(" ");
        for (int i = 0; i < (h / 2)+1; i++) {

            System.out.print("*");

        }
    }

}
