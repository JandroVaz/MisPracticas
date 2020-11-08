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

/*Crear una aplicación que solicite al usuario una fecha
(día, mes y año) y muestre la fecha correspondiente al día siguiente.
Ejemplo 1: 31/01/2019 → 01/02/2019
Ejemplo 2: 31/12/2018 → 01/01/2019
Recuerda que el año 0 no ha existido. Se pasó desde el año -1 al año 1.
Refleja ésto en tu programa.*/
import java.util.Scanner;

public class Ejer1Exa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);

        int dia;
        int mes;
        int año;
        boolean datos = true;
        System.out.println("Programa que muestra la fecha del día siguiente dada por el usuario.");
        do {
            System.out.println("Deme una fecha(dia/mes/año)= ");
            dia = s.nextInt();
            mes = s.nextInt();
            año = s.nextInt();
            System.out.println("---------");
            System.out.print(dia + "/" + mes + "/" + año);
            if (dia == 0) {
                datos = false;
                System.out.println("\n[FECHA ERRONEA] El día no puede ser 0.");
            } else if (mes == 0) {
                datos = false;
                System.out.println("\n[FECHA ERRONEA] El mes no puede ser 0.");
            } else if ((año == 0) || (año == 0000) || (año == 000) || (año == 00)) {
                datos = false;
                System.out.println("\n[FECHA ERRONEA] El año no puede ser 0.");
            } else if ((dia > 31) || (mes > 12)) {
                datos = false;
                System.out.println("\n [FECHA ERRONEA] El día no puede ser superior a 31 y el mes no puede ser superior a 12");
            }

            if ((dia == 31) && (mes < 12)) {
                dia = 01;
                mes++;
            } else if ((dia == 31) && (mes == 12)) {
                dia = 01;
                mes = 01;
                año++;
            } else {
                dia++;
            }
        } while (!datos);
        System.out.print("--->");
        System.out.println(dia + "/" + mes + "/" + año);
    }

}
