/*
Una tienda ofrece un descuento del 15% sobre el total de la compra y un 
cliente desea saber cuanto deberá pagar finalmente por su compra. 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio27 {
    int venta;
    
    public void descuento(){
        Scanner in = new Scanner (System.in);
        System.out.print("VENTA: ");
        venta= in.nextInt();
        System.out.println("15%:   "+(venta*.15));
        System.out.println("TOTAL: "+ (venta*.85));
    }
    
}
