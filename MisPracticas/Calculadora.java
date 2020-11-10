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
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);

        System.out.println("Bienvenida a la calculadora");
        int opc;
        int num = 0;
        int num2 = 0;
        int total = 0;
        int cociente = 0;
        int resto = 0;
        int divid = 0;
        boolean salir = false;
        do {
            do {
                System.out.println("1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir");
                opc = s.nextInt();
            } while ((opc > 0) && (4 < opc));
            System.out.println("Dame el primer numero= ");
            num = s.nextInt();
            System.out.println("Dame el segundo numero= ");
            num2 = s.nextInt();

            switch (opc) {
                case 1:
                    if ((num < 0) && (num2 < 0)) {
                        System.out.println(num + num2 + "=" + (num + num2) * -1);
                    } else {
                        System.out.println(num + "+" + num2 + "=" + (num + num2));
                    }

                    break;
                case 2:

                    if ((num < 0) && (num2 < 0)) {
                        System.out.println(num + num2 + "=" + (num - num2) * -1);
                    } else if (num < 0) {
                        System.out.println(num + "+" + num2 + "=" + (num + num2));
                    } else if (num2 < 0) {
                        System.out.println(num + num2 + "=" + (num + num2));
                    } else {
                        System.out.println(num + "-" + num2 + "=" + (num - num2));
                    }
                    break;
                case 3:

                    if ((num > 0) && (num2 > 0)) {
                        for (int i = 0; i < num2; i++) {
                            total = total + num;
                        }

                        System.out.println(num + "*" + num2 + "=" + total);
                    } else if (num < 0) {
                        for (int i = 0; i < num2; i++) {
                            total = total + num;
                        }

                    } else {
                        int num2v = num2 * (-1);
                        for (int i = 0; i < num2v; i++) {
                            total = total + num;
                        }
                        total = total * (-1);
                    }

                    System.out.println(num + "*" + num2 + "=" + total);

                    break;
                case 4:

                    if (num == 0) {
                        System.out.println("Solución infinita.");
                    } else if (num2 == 0) {
                        System.out.println("No tiene solución.");
                    } else if ((num < 0) || (num2 < 0)) {
                        divid = num;
                        while (divid > 0) {
                            cociente++;
                            divid = divid - num2;
                        }
                        divid = divid * (-1);
                        System.out.println(num + "/" + num2 + "=\nCociente= " + cociente + "\nResto= " + divid);

                    } else {
                        divid = num;
                        while (divid > 0) {
                            cociente++;
                            divid = divid - num2;
                        }
                        System.out.println(num + "/" + num2 + "=\nCociente= " + cociente + "\nResto= " + divid);
                    }

                    break;
                default:
                    break;
            }

            System.out.println("¿Desea salir?");
            String sal = s.next();

            if ((sal.equals("si")) || (sal.equals("salir"))) {
                salir = true;
            } else {
                salir = false;
            }
        } while (!salir);
    }

}
