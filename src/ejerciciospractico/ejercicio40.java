/*
40.	Queremos conocer los datos estadísticos de una asignatura, por lo tanto,
necesitamos un algoritmo que lea el número de suspensos, aprobados, notables y 
sobresalientes de una asignatura, y nos devuelva: 
a. El tanto por ciento de alumnos que han superado la asignatura. 
b. El tanto por ciento de suspensos, aprobados, notables y sobresalientes de la asignatura. 

 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio40 {
    float x;
    float a;
    float n;
    float s;
    float t;
    public void porcent(){
        Scanner in =new Scanner (System.in);
        System.out.print("Numero de alumnos suspensos: ");
        x= in.nextFloat();
        Scanner an =new Scanner (System.in);
        System.out.print("Numero de alumnos aprobados: ");
        a= an.nextFloat();
        Scanner on =new Scanner (System.in);
        System.out.print("Numero de alumnos notables: ");
        n= on.nextFloat();
        Scanner en =new Scanner (System.in);
        System.out.print("Numero de alumnos sobresalientes: ");
        s= en.nextFloat();
        t=x+a+n+s;
        System.out.println("El porcentaje de alumnos suspensos es de : "+(x/t)*100);
        System.out.println("El porcentaje de alumnos aprobados es de : "+(a/t)*100);
        System.out.println("El porcentaje de alumnos notables es de  : "+(n/t)*100);
        System.out.println("El porcentaje de alumnos sobresalientes es de: "+(s/t)*100);
        
    }
}
