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
public class Multiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        System.out.println("Multiplicación de números, dime los 2 números que quires multiplicar.");
        int mult1 = s.nextInt();
        int mult2 = s.nextInt();
        int total=0;
        for (int i = 1; i <= mult2; i++) {
            total=total+mult1;
        }
        
        System.out.println("Resultado= "+total);
    }
    
}
