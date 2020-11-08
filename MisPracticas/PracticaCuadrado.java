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

import java.util.Scanner;
public class PracticaCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        System.out.println("Dame la altura");
        int h = s.nextInt();
        
        //tapa
        for (int i = 0; i < h; i++) {
            System.out.print(" *");
        }
        System.out.println("");
    
        //Cuerpo
        for (int i = 0; i < h-2; i++) {
            System.out.print(" *");
            for (int j = 0; j < h-2; j++) {
                System.out.print("  ");
                
            }
            System.out.println(" *");
        }
        
        //final
        
        for (int i = 0; i < h; i++) {
            System.out.print(" *");
        }
        System.out.println("");
    } 
}
