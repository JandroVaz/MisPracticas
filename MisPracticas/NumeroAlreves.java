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
public class NumeroAlreves {

    /**
     * @param args the command line arguments
     */
    /*Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        System.out.println("Deme un número");
        int num1 = s.nextInt();
        int num=num1;
        int vuelta =0;
        
        while (num>0){
        vuelta=(vuelta*10)+(num%10);
        
        num/=10;
        }
        
        System.out.println("El número dado "+num1+" dado la vuelta es "+vuelta);
    }
    
}
