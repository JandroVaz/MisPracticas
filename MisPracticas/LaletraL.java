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


public class LaletraL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int h;
        do {            
            System.out.println("Dame la altura");
            h = s.nextInt();
        } while ((h==0)||(h<0));
        
        for (int i = 1; i < h; i++) {
            System.out.print("*");
            for (int j = 0; j < (h/2)+1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.print(" ");
        for (int i = 0; i < (h/2)+1; i++) {
            System.out.print("*");
        }
    }
    
}
