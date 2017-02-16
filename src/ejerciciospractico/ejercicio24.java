/*
Suponga que un individuo desea invertir su capital en un banco y desea saber 
cuánto dinero ganará después de un mes si el banco paga a razón de 2% mensual. 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio24 {
    int capital;
    
    public void banco(){
        Scanner in = new Scanner (System.in);
        System.out.println("-----BIENVENIDO BANCOSON-----");
        System.out.println("¿Cual es tu inversion inicial?");
        capital= in.nextInt();
        System.out.println("Tu inversion en un mes crecera a una razon del 2%: "+ (capital*1.02));
    }
}
