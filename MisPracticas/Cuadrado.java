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
public class Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int h;
        do {
            System.out.println("Dame la altura: ");
            h = s.nextInt();
        } while ((h == 0) || (h < 0));

        //tapa
        for (int i = 0; i < h; i++) {
            System.out.print("*");
        }
        System.out.println("");

        //paredes
        for (int i = 0; i < h - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < h - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        //base
        for (int i = 0; i < h; i++) {
            System.out.print("*");
        }
        System.out.println("");

    }

}
