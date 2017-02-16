/*
Realizar un algoritmo que calcule la edad de una persona.
Modificar el ejercicio para que solicite el ingreso del año actual. 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio30 {
    String nombre;
    int nac;
    int act;
    
    public void edad(){
        Scanner in = new Scanner (System.in);
        System.out.print("Nombre: ");
        nombre = in.nextLine();
        Scanner on = new Scanner (System.in);
        System.out.print("Año de nacimiento: ");
        nac = on.nextInt();
        Scanner un = new Scanner (System.in);
        System.out.print("Año actual: ");
        act = un.nextInt();
        System.out.println( "Tu edad es: "+(act-nac)+" años.");
        
    }
}
