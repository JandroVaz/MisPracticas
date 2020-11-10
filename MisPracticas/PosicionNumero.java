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
public class PosicionNumero {

    /**
     * @param args the command line arguments
     */
    /*  * 26. Realiza un programa que pida primero un número y a continuación un dígito. El programa nos
 *     debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito en
 *     el número introducido.
 * */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        System.out.println("Deme un número y un dígito.");
        int numIntro = s.nextInt();
        int digito = s.nextInt();
        int longitud =0;
        int vuelta =0;
        int num = numIntro;
        int posicion = 1;
        System.out.println("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + numIntro + " en las siguientes posiciones");
        if (num==0){
            longitud++;
        }
        
        while(num>0){
        vuelta=(vuelta*10)+(num%10);
        num/=10;
        longitud++;
        }
        
        while (vuelta>0){
            if((vuelta%10)==0){
                System.out.print(posicion + " ");
            }
            vuelta/=10;
            posicion++;
        }
    }
    
}
