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
public class MultiplosDe5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.

        for (int i = 0; i < 100; i++) {
            if(i%5==0){
                System.out.println("Múltiplos de 5= "+i);
            }
        }
    }
    
}
