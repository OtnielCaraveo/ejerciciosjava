/*
38.	Tres personas deciden invertir su dinero para fundar una empresa.
Cada una de ellas invierte una cantidad distinta. 
Obtener el porcentaje que cada quien invierte con respecto a la cantidad total invertida. 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio38 {
    float i1;
    float i2;
    float i3;
    float it;
    
    public void porcent(){
        Scanner in = new Scanner (System.in);
        System.out.println("Inversion persona A: ");
        i1= in.nextFloat();
        Scanner on = new Scanner (System.in);
        System.out.println("Inversion persona B: ");
        i2= on.nextFloat();
        Scanner en = new Scanner (System.in);
        System.out.println("Inversion persona C: ");
        i3= en.nextFloat();
        it= i1+i2+i3;
        System.out.println("El porcentaje de la persona A es: " +((i1/it)*100));
        System.out.println("El porcentaje de la persona B es: " +((i2/it)*100));
        System.out.println("El porcentaje de la persona C es: " +((i3/it)*100));
    }
}
