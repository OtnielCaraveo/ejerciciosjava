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
public class ejercicio85 {
int x,r,d,v;
int can;

    void doble() {
        v=0;
        System.out.println("Todo o Nada");
        System.out.println("Cantidad a apostar: ");
        Scanner in = new Scanner (System.in);
        can = in.nextInt();
        do{
            v=v+1;
        
        System.out.println("Elija: ");
        System.out.println("1 = CARA ");
        System.out.println("2 = CRUZ ");
        Scanner on = new Scanner (System.in);
        x= on.nextInt();
        int y = (int) ((float)Math.random()*3+1);
            System.out.println("y = " + y);
            if(y==x){
                 d= can *2;
            }else{
                d=can=0;
            }
            
        System.out.println("Dinero total : "+d);
            System.out.println("Veces Jugadas: " +v );
            System.out.println("¿Jugar otra vez?");
            System.out.println("(1) Si");
            System.out.println("(2) No");
            Scanner an = new  Scanner (System.in);
            r= an.nextInt();
            
        } while(r==1 && d!=0);
        System.out.println("Dinero total : "+d);
            System.out.println("Veces Jugadas: " +v );
    }
    
}
