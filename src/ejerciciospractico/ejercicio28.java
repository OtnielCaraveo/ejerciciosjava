/*
Un alumno desea saber cual será su calificación final en la materia de Algoritmos. 
Dicha calificación se compone de los siguientes porcentajes: 

55% del promedio de sus tres calificaciones parciales. 
30% de la calificación del examen final. 
15% de la calificación de un trabajo final. 

 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio28 {
    int par1, par2, par3;
    int exfin;
    int trafin;
    
    public void calif(){
        Scanner a = new Scanner (System.in);
        System.out.print("Calificacion Parcial 1:     ");
        par1 = a.nextInt();
        Scanner e = new Scanner (System.in);
        System.out.print("Calificacion Parcial 2:     ");
        par2 = e.nextInt();
        Scanner b = new Scanner (System.in);
        System.out.print("Calificacion Parcial 3:     ");
        par3 = b.nextInt();
        Scanner c = new Scanner (System.in);
        System.out.print("Calificacion Examen Final:  ");
        exfin = c.nextInt();
        Scanner d = new Scanner (System.in);
        System.out.print("Calificacion Proyecto Final:");
        trafin = d.nextInt();
        System.out.println("CALIFICACIONES:");
        System.out.println("PARCIALES:      "+(((par1+par2+par3)/3)*.55));
        System.out.println("EXAMEN FINAL:   "+(exfin*.30));
        System.out.println("PROYECTO FINAL: "+(trafin*.15));
        System.out.println("PUNTOS TOTALES: "+((((par1+par2+par3)/3)*.55)+(exfin*.30)+(trafin*.15)));
       
    }
}
