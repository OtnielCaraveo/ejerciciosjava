/*
Escribir un programa para calcular el importe de una venta en un supermercado. 
El usuario debe indicar el nombre del producto, el precio por unidad y el nº de unidades y 
el programa sacará por pantalla el nombre del producto, el nº de unidades vendidas y el precio total. 
Preste especial atención a qué tipo de datos resulta más adecuado para cada representar cada cantidad.
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
public class ejercicio5 {
    String s;
    float precio;
    int cantidad;
    float total;
    public void Registro(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Nombre del articulo: ");
        s= sc.nextLine();
        Scanner in = new Scanner (System.in);
        System.out.print("Precio del articulo: ");
        precio= in.nextFloat();
        Scanner on = new Scanner (System.in);
        System.out.print("Cantidad de articulo(s): ");
        cantidad= on.nextInt();
    }
    
    public void Ticket(){
        total=precio*cantidad;
        System.out.println("-------------------------------------------------------------");
        System.out.println("--------------------------BIENVENIDO-------------------------");
        System.out.println("Articulo            Costo           Cantidad            Total");
        System.out.println(s+"               "+precio+"              "+cantidad+"                  "+total);
        System.out.print("----------------------Gracias por su compra--------------------");
    }
    
    
}
