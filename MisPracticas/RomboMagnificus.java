/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisPracticas;

/**
 *
 * @author MARTOTITA
 */
import java.awt.GridBagConstraints;
import java.util.Scanner;

public class RomboMagnificus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);

        System.out.println("Deme la altura de la figura: ");
        int h = s.nextInt();

        //parte de arriba
        for (int i = 0; i <= h; i++) {

            for (int c = h - i; 0 < c; c--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println("");

        }

        //parte de abajo
        for (int i = 0; i<=h; i++) {

            for (int c = 0; c <= i; c++) {
                System.out.print(" ");
            }

            for (int j = h-i-1; 0 < j; j--) {
                System.out.print(" *");
            }
            System.out.println("");

        }

    }

}
