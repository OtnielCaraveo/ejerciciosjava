/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio86 {
int x,y;
int z=0;
    void juego() {
        y = (int) ((float)Math.random()*11+0);
        System.out.println("Dame un numero del 0 al 10 ");
        do{
            Scanner in = new Scanner (System.in);
            x= in.nextInt();
            System.out.println("Intente otra vez");
            z=z+1;
        }while(x!=y);
        System.out.println("Felicidades lo hizo en " + z +" intentos");
    }
    
}
