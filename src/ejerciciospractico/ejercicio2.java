/*
 Escribir un programa que pida una cantidad en pesos y la convierta en dólares
 */
package ejerciciospractico;

import java.util.Scanner;


public class ejercicio2 {
    
    final float tasaCambio=19.25f;
    float cantidadPesos;

    public void pedirCantidadPesos(){
    Scanner in= new Scanner (System.in);
    System.out.print("Dame la cantidad de pesos:");
    cantidadPesos= in.nextFloat();
}
    public void convertirPesoaDolar(){
        System.out.println ("Los "+ cantidadPesos + " pesos en dolares es... " + cantidadPesos/tasaCambio);
                    
    }
}