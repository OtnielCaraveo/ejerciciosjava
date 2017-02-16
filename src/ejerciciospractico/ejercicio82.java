/*
Escribir un programa que pida la calificación de un examen 
(un nº real entre 0 y 10) e imprima la calificación en formato 
“Suspenso”, si la nota es menor que 5, “Aprobado” si está entre 5 
inclusive y 7 sin incluir, “Notable” si está entre 7 inclusive y 9 
sin incluir, “Sobresaliente” si está entre 9 inclusive 
y 10 sin incluir y “Matrícula de honor” si la nota es igual a 10.  
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio82 {
    float alt;
    public void exam(){
        Scanner in = new Scanner (System.in);
        System.out.print("Ingrese la calificacion del examen.");
        alt = in.nextFloat();
        if(alt<5){
            System.out.println("SUSPENSO");
        }
        if(alt>=5&&alt<7){
            System.out.println("APROBADO");
        }
        if(alt>=7&&alt<9){
            System.out.println("NOTABLE");
        }
        if(alt>=9&&alt<10){
            System.out.println("SOBRESALIENTE");
        }
        if(alt==10){
            System.out.println("MATRICULA DE HONOR");
        }
    }
}
