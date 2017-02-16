/*
Escribir un programa que pida una hora en segundos y 
la saque por pantalla en el formato “hh:mm:ss”, es decir horas, minutos y segundos
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio11 {
    int seg;
    int h;
    int m;
    int s;
    
    public void hora() {
        Scanner in = new Scanner (System.in);
        System.out.println("¿Que segundo del dia es?");
        seg=in.nextInt();
        h=seg/3600;
        m=(seg%3600)/60;
        s=(seg%3600)%60;
        System.out.println("La hora exacta es: ");
        System.out.println("HORA    MINUTO  SEGUNDOS");
        System.out.println(h+"      "+m+"       "+s);
    }
    
}
