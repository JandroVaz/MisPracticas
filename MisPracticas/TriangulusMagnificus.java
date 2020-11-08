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
public class TriangulusMagnificus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int h=0;
        do {
            System.out.println("Deme la altura");
            h = s.nextInt();
        } while ((h==0)||(h<0));

        int cont1 = 0;
        for (int i = 1; i <= h; i++) {
            int cont = 0;
            for (int j = 1; j <= i; j++) {
                cont++;
                cont1++;
                System.out.print(cont);
            }
            System.out.println("");
        }

        for (int i = 1; i <= h; i++) {
            int cont = 0;
            for (int j = 0; j <= h - i - 1; j++) {
                cont++;
                cont1++;
                System.out.print(cont);
            }
            System.out.println("");
        }

        System.out.println("Números puestos= " + cont1);

    }

}
