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
public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);

        System.out.println("Digame el divisor y el diviendo=");
        int divid = s.nextInt();
        int divis = s.nextInt();
        int coci = 0;
        while (divid > 0) {
            coci++;
            divid = divid - divis;
        }
        
        System.out.println("Cociente= "+coci);
        System.out.println("Resto= "+(-divid));
    }

}
