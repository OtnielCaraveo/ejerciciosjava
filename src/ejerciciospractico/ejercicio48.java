/*
48. 	Repetir el ejercicio anterior con un número cualquiera de valores
 */
package ejerciciospractico;

import java.util.Arrays;
import java.util.Scanner;


class ejercicio48 {

    private Scanner teclado;
    private int[] sueldos;
	
    public void cargar()
    {
        teclado=new Scanner(System.in);
        System.out.print("¿Cuantos valores cargara?:");
        int cant;
        cant=teclado.nextInt();
        sueldos=new int[cant];
        for(int f=0;f<sueldos.length;f++) {
            System.out.print("v["+f+"] :");
            sueldos[f]=teclado.nextInt();
        }	
        System.out.println(" ");
    }
	
    public void imprimir() {
        Arrays.sort(sueldos);
        for(int f=0;f<sueldos.length;f++) {
            System.out.println(sueldos[f]);
        }
    }
}

