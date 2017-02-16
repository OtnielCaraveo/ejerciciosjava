/*
43.	El coste de un automóvil nuevo para un comprador es la suma total del 
coste del vehículo, del porcentaje de la ganancia del vendedor y de los impuestos 
locales o estatales aplicables (sobre el precio de venta). Suponer una ganancia 
del vendedor del 12% en todas las unidades y un impuesto del 6% y diseñar un 
algoritmo para leer el coste total del automóvil e imprimir el coste para el consumidor. 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio43 {
    int valor;
    
    public void auto(){
        Scanner in = new Scanner(System.in);
        System.out.println("Costo del vehiculo:     ");
        valor= in.nextInt();
        System.out.println("+ ganancia vendedor (12%): "+(valor*.12));
        System.out.println("+ impuestos (6%)         : "+(valor*.06));
        System.out.println("Total                    : "+(valor+(valor*.12)+(valor*.06)));
        
               
    }
}
