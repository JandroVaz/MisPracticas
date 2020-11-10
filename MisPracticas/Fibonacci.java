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
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int num=0;
        System.out.println("Ejercicio de fibonacci");
        do {            
            System.out.println("Dígame un número= ");
            num = s.nextInt();
        } while ((num==0)||(num<0));
        
        int fibo0=0;
        int fibo1=1;
        int fibo3=0;
        for (int i = 0; i <= num; i++) {
            if (i==0) {
                System.out.print(fibo0+",");
            } else if (i==1){
                System.out.print(fibo1+",");
            } else{
                System.out.print(fibo0+fibo1+",");
                fibo3=fibo1;
                fibo1+=fibo0;
                fibo0=fibo3;
            }
                
        }
    }
    
}
