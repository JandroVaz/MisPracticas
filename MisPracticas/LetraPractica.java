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
public class LetraPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);

        System.out.println("Deme la altura.");
        int h = s.nextInt();
        //Tapon

        if (h % 2 == 0) {
            for (int i = 0; i < h - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        } else {

            for (int i = 0; i < h; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //Columna
        if (h % 2 == 0) {
            for (int i = 0; i < h - 1; i++) {
                System.out.print(" ");
                for (int j = 1; j < (h - 1) / 2; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else {
            for (int i = 0; i < h; i++) {
                System.out.print(" ");
                for (int j = 0; j < (h) / 2; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        //base
        if (h % 2 == 0) {
            for (int i = 0; i < h - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        } else {

            for (int i = 0; i < h; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
