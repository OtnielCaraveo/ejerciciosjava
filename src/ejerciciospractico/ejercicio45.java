/*
45.	Dada una velocidad indicada en metros por segundo convertir la misma a kilómetros por hora. 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio45 {
    float vel;
    float velh;
    
    public void km(){
        Scanner in = new Scanner (System.in);
        System.out.println("Velocidad Actual (metros/segundo)");
        vel= in.nextFloat();
        velh= (vel/1000)*3600;
        System.out.println("Tu Velocidad en kilometros por hora es "+velh);
        
    }
    
}
