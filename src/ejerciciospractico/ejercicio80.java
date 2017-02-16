/*
Escribir un programa que lea tres valores enteros, imprimir el máximo y el mínimo de ellos.
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio80 {
    int x;
    int y;
    int z;
    public void may(){
        Scanner a = new Scanner (System.in);
        System.out.print("Ingrese Numero A: ");
        x= a.nextInt();
        Scanner b = new Scanner (System.in);
        System.out.print("Ingrese Numero B: ");
        y= b.nextInt();
        Scanner c = new Scanner (System.in);
        System.out.print("Ingrese Numero C: ");
        z= c.nextInt();
        if((x>=y)&&(x>=z)){
            System.out.println("EL NUMERO MAYOR ES A: "+x);
        }
        if(y>=x&&y>=z){
            System.out.println("EL NUMERO MAYOR ES B: "+y);
        }
        if(z>=y&&z>=x){
            System.out.println("EL NUMERO MAYOR ES C: "+z);
        }
        if((x<=y)&&(x<=z)){
            System.out.println("EL NUMERO MENOR ES A: "+x);
        }
        if(y<=x&&y<=z){
            System.out.println("EL NUMERO MENOR ES B: "+y);
        }
        if(z<=y&&z<=x){
            System.out.println("EL NUMERO MENOR ES C: "+z);
        }
        
    }
}
