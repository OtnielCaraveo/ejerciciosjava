/*
Un maestro desea saber que porcentaje de hombres y que porcentaje de mujeres
hay en un grupo de estudiantes. 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio29 {
    int h;
    int m;
    float total;
    public void hm(){
        Scanner in = new Scanner (System.in);
        System.out.print("¿Cuantos hombres hay en clase? ");
        h = in.nextInt();
        Scanner on = new Scanner (System.in);
        System.out.print("¿Cuantas mujeres hay en clase? ");
        m = on.nextInt();
        total = h+m;
        System.out.println("Porcentaje de hombres: "+((h/total)*100));
        System.out.println("Porcentaje de mujeres: "+((m/total)*100));
        
        
    }
    
}
