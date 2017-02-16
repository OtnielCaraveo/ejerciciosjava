/*
 Escribir un programa que pida una cantidad en pesos y la convierta en dólares
 */
package ejerciciospractico;

import java.util.Scanner;


public class ejercicio3 {
    float cantidadPesos;
    float tasaCambio;
    
    public void Cambio(){
    Scanner on= new Scanner (System.in);
    System.out.println("¿Cual es la tasa de cambio? (un dollar a pesos) ");
    tasaCambio= on.nextFloat();
}

    public void pedirCantidadPesos(){
    Scanner in= new Scanner (System.in);
    System.out.print("Dame la cantidad de pesos:");
    cantidadPesos= in.nextFloat();
}
    public void convertirPesoaDolar(){
        System.out.println ("Los "+ cantidadPesos + " pesos en dolares es... " + cantidadPesos/tasaCambio);
                    
    }
}