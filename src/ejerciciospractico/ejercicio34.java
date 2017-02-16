/*
34.	En un hospital existen tres áreas: Ginecología, Pediatría, Traumatologia. 
El presupuesto anual del hospital se reparte conforme a la sig. tabla: 
Área Porcentaje del presupuesto 
Ginecología 40% 
Traumatologia 30% 
Pediatría 30% 
35.	Obtener la cantidad de dinero que recibirá cada área, para cualquier monto presupuestal.

 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio34 {
    int pre;
    
    public void hp(){
        Scanner in = new Scanner (System.in);
        System.out.print("Ingrese Total de Presupuesto Anual: ");
        pre = in.nextInt();
        System.out.println("El presupuesto se dividira en: ");
        System.out.println("40% Ginecologia:    "+(pre*.40));
        System.out.println("30% Traumatologia:  "+(pre*.30));
        System.out.println("30% Pediatria:      "+(pre*.30));
        
    }
    
}
