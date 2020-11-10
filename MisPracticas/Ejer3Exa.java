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
/*Ejercicio 3 (4,5 puntos): Un centro de investigación de la flora urbana necesita
una aplicación que muestre cuál es el árbol más alto. Para ello se introducirá por
teclado la altura (en centímetros) de cada árbol (terminando cuando el usuario
escriba “FIN PROGRAMA”). Los árboles se identifican mediante etiquetas con
números únicos consecutivos, comenzando en 0.*/
public class Ejer3Exa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);
        int cont = 0;
        int h1 = 1;
        boolean salir = false;
        System.out.println("Se mostrará el árbol más alto segun las alturas dadas.");
        //booleano utilizado para salir del do while
        do {
            System.out.println("Deme la altura(El número debe ser positivo)=");
            int h = s.nextInt();

            if (h < 0) {
                System.out.println("Debe introducir un número positivo.");
                salir = false;
            } else {
                if (h > h1) {
                    h1 = h;
                    cont++;
                } else {
                    cont++;
                }
            }

            System.out.println("¿Quiere salir?(1.si/2.no)");
            int sal = s.nextInt();
            if (sal == 1) {
               salir=true;
            } else if (sal==2){
                salir=false;
            }
        } while (!salir);

        System.out.println("El árbol más grande mide= " + h1 + " corresponde a la etiqueta " + cont);
    }

}
