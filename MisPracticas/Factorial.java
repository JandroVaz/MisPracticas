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
/*Factorial*/
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        System.out.println("Deme un número para darle su factorial.");
        int num = s.nextInt();
        int total=num;
        for (int i = 1; i <= num-1; i++) {
            System.out.print((total=i*total)+",");
        }
        
        
    }
    
}
