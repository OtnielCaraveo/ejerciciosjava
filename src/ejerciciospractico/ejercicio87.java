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
class ejercicio87 {
int x,y,z=0;
    void contra() {
        System.out.println("Ingrese contraseña: ");
        System.out.println("clave 1234");
        do{
            Scanner in = new Scanner (System.in);
            x= in.nextInt();
                    if(x==1234){
                        z=4;
                    }else{
                        System.out.println("Vuelva a intentar");
                        z=z+1;
                    }
        }while(z<3);
        if(z>3){
            System.out.println("Contraseña correcta");
        }else{
            System.out.println("Contraseña incorrecta tres veces, sistema bloqueado");
        }
    }
    
}
