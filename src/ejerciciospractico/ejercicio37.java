/*
37.Todos los lunes, miércoles y viernes, una persona corre la misma ruta y
cronometra los tiempos obtenidos.
Determinar el tiempo promedio que la persona tarda en recorrer la ruta en una semana cualquiera. 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio37 {
    int time1;
    int time2;
    int time3;
    
    public void average(){
        Scanner in =new Scanner(System.in);
        System.out.print("Tiempo Lunes: ");
        time1 = in.nextInt();
        Scanner on =new Scanner(System.in);
        System.out.print("Tiempo Lunes: ");
        time2 = on.nextInt();
        Scanner an =new Scanner(System.in);
        System.out.print("Tiempo Lunes: ");
        time3 = an.nextInt();
        System.out.println("Promedio: "+(time1+time2+time3)/3);
    }
}
