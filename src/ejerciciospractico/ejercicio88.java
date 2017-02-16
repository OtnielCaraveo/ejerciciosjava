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
class ejercicio88 {
int x,y,z;
    void multi() {
        System.out.println("Digite un numero: ");
        Scanner in = new Scanner (System.in);
        x = in.nextInt();
        for(y=1; y<=10; y++){
            z=x*y;
            System.out.println(x +" x "+ y + " = "+z );
        }
    }
    
}
