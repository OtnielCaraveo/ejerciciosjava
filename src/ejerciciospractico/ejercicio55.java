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
class ejercicio55 {
    
  int [][] valor = new int[5][5];
    int c;
    public void ceros(){
        
        for(int x=0; x < valor.length; x++) {
            c=0;
            for (int y=0; y < valor[x].length; y++) {
                valor[x][y]=(int)(Math.random()*9+0);
                System.out.print(valor[x][y]+" ");
                if(valor[x][y]==(int)0){
                    c=c+1;
                }
                
                }System.out.println("  CEROS "+c);
        }
            System.out.println("");
        
//            Scanner teclado=new Scanner(System.in);
//        System.out.print("¿Sumar tabla de #?:");
//        x=teclado.nextInt();
//        x=x+1;
//        y=x;
//        suma =new int[x][y];  
//        System.out.print("+ ");
//        for(int x=0; x < suma.length; x++) {
//            System.out.print(x+ " ");
//            for (int y=0; y < suma[x].length; y++) {
//            }
//            }
//        System.out.println("");
//        for(int x=0; x < suma.length; x++) {
//            System.out.print(x+ " ");
//            for (int y=0; y < suma[x].length; y++) {
//                suma[x][y]=(int)(x+y);
//                System.out.print(suma[x][y]+" ");
//        }
//            System.out.println("");
//
//        
//    }
}
    }


