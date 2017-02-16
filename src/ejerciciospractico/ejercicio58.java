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
class ejercicio58 {
    String[][] silla = new String [5][10];
    char f1='A';
    char f2='B';
    char f3='C';
    char f4='D';
    char f5='E';
    
    public void asiento(){
        Scanner in=new Scanner (System.in);
        System.out.println("Lista de asistentes: ");
        for (int x = 0; x <silla.length; x++) {
            for (int y = 0; y < silla[x].length; y++) {
                if(x==0){
                System.out.println("Asiento: "+f1+ +y+" Nombre:");
                silla[x][y]= in.nextLine();
                }
                if(x==1){
                System.out.println("Asiento: "+f2+ +y+" Nombre:");
                silla[x][y]= in.nextLine();
                }
                if(x==2){
                System.out.println("Asiento: "+f3+ +y+" Nombre:");
                silla[x][y]= in.nextLine();
                }
                if(x==3){
                System.out.println("Asiento: "+f4+ +y+" Nombre:");
                silla[x][y]= in.nextLine();
                }
                if(x==4){
                System.out.println("Asiento: "+f5+ +y+" Nombre:");
                silla[x][y]= in.nextLine();
                }
            }
        }
        for (int x = 0; x < silla.length; x++) {
            for (int y = 0; y < silla[x].length; y++) {
                if(x==0){
                System.out.println("Asiento: "+f1+ +y+" Nombre: "+ silla[x][y]);
                }
                if(x==1){
                System.out.println("Asiento: "+f2+ +y+" Nombre: "+ silla[x][y]);
                }
                if(x==2){
                System.out.println("Asiento: "+f3+ +y+" Nombre: "+ silla[x][y]);
                }
                if(x==3){
                System.out.println("Asiento: "+f4+ +y+" Nombre: "+ silla[x][y]);
                }
                if(x==4){
                System.out.println("Asiento: "+f5+ +y+" Nombre: "+ silla[x][y]);
                }
            }
        }
    }
}
