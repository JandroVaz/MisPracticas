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
public class Primos2y100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        //Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
        
        for (int i = 2; i <= 100; i++) {
            if((i%2)==0){
                System.out.println(i);
            }
        }
    }
    
}
