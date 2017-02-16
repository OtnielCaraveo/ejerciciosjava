/*
Conociendo el valor de la entrada al cine, calcule el monto a pagar para una 
delegación de personas. Recuerde que deberá hacer un descuento del 3% por cantidad
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio22 {
    int entrada;
    int numero;
    int total;
    
    public void cine(){
        Scanner in = new Scanner (System.in);
        System.out.println("----BIENVENIDO CINESON----");
        System.out.println("Costo de Estrada: ");
        entrada = in.nextInt();
        Scanner on = new Scanner (System.in);
        System.out.println("Numero de boletos: ");
        numero = on.nextInt();
        if(numero>9){
            System.out.println("APLICA DESCUENTO 3%");
            total=(int) (entrada*numero*0.97);
        }
        else{
            total=(int) (entrada*numero);
        }
        System.out.println("Venta Total: " +total);
        
    }
}
