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
/*Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.
*/
public class MultiplosDe3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        System.out.println("Deme un número=");
        int num = s.nextInt();
        
        for (int i = 1; i <= num; i++) {
            if((i%3)==0){
                System.out.print(i+",");
            }
        }
    }
    
}
