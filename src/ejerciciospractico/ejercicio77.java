/*
Escribir un programa que pida un número e indique si se trata de un número par (IMPAR)
 */
package ejerciciospractico;

import java.util.Scanner;

class ejercicio77 {
    int x;
    public void par(){
        Scanner in= new Scanner (System.in);
        System.out.println("INGRESE UN NUMERO:");
        x=in.nextInt();
        if((x%2)!=0){
            System.out.println("EL NUMERO "+x+" ES IMPAR.");
        }
        else{
            System.out.println("EL NUMERO "+x+" ES PAR.");
        }
    }
}
