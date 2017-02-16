/*
Informar en pantalla el promedio de cinco números
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio17 {
    int v;
    int w;
    int x;
    int y;
    int z;
    
    public void promedio(){
        Scanner an = new Scanner (System.in);
        System.out.println("Ingrese numero :");
        v = an.nextInt();
        Scanner en = new Scanner (System.in);
        System.out.println("Ingrese numero :");
        w = en.nextInt();
        Scanner in = new Scanner (System.in);
        System.out.println("Ingrese numero :");
        x = in.nextInt();
        Scanner on = new Scanner (System.in);
        System.out.println("Ingrese numero :");
        y = on.nextInt();
        Scanner un = new Scanner (System.in);
        System.out.println("Ingrese numero :");
        z = un.nextInt();
        System.out.println("El promedio es: "+(v+w+x+y+z)/5);
    }
}
