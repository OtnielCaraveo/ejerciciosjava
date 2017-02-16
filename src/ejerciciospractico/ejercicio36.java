/*
36.	El dueño de una tienda compra un articulo a un precio determinado. 
Obtener el precio en que lo debe vender para obtener una ganancia del 30%. 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio36 {
    int v;
    
    public void venta(){
        Scanner in= new Scanner (System.in);
        System.out.println("Costo neto: ");
        v= in.nextInt();
        System.out.println("Venta mas ganancia (30%): "+v*1.3);
       
    }
}
