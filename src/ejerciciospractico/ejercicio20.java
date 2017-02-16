/*
Ídem para el área de un círculo (se deberá ingresar la medida del diámetro). 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio20 {
    int dia;
    int rad;
    
    public void circulo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese diametro del circulo: ");
        dia= in.nextInt();
        rad=dia/2;
        System.out.println("El area del circulo es: "+ (3.1416*rad*rad));
                
    }
}
