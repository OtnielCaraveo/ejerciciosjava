/*
Escribir un programa que permita jugar a doble o nada: El jugador apuesta una 
cantidad y tira una moneda. Si sale cara imprimir “obtiene el doble de 
la cantidad apostada”. Si sale cruz la “pierde todo”. 
 */
package ejerciciospractico;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class ejercicio79 {
    int can;
    public void doble(){
        Timer timer = new Timer();
        
        Scanner in = new Scanner (System.in);
        System.out.println("Cantidad Apostada: ");
        can= in.nextInt();
        int x= (int) (Math.random()*1+0);
        System.out.print("LA MONEDA HA CAIDO EN.");
        TimerTask task = new TimerTask(){
            @Override
            public void run() {
                
                
                 System.out.print("..");   
                
            }
        };
        timer.schedule(task, 100, 1000);
        if(x==0){
            System.out.println("CARA");
            System.out.println("FELICIDADES, DOBLO SU CANTIDAD A: " + can*2);
        }
        else{
            System.out.println("CRUZ");
            System.out.println("HA PERDIDO TODO SU DINERO.");
        }
    }
}
