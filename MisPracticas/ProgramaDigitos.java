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
public class ProgramaDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        System.out.println("Deme un número= ");
        int num = s.nextInt();
        int cont=1;
        while (num>10) {            
            num/=10;
            cont++;
        }
        
        System.out.println("El número dado tiene "+cont+" digitos");
    }
    
}
