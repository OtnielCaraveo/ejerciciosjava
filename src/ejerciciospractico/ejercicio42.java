/*
42.	El siguiente es el menú de un restaurante de bocadillos. 
Diseñar un algoritmo capaz de leer el número de unidades consumidas de cada 
alimento ordenado y calcular la cuenta total. 
Bocadillo de jamón (4 euros) 
Bocadillo dequeso (3 euros) 
Patatas fritas (2 euros) 
Refresco (1 euro) 
Cerveza (2 euros) 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio42 {
    int njam,jam;
    int nque,que;
    int npapa,papa;
    int nsoda,soda;
    int ncerv,cerv;
    
    public void bar(){
        Scanner an=new Scanner (System.in);
        System.out.println("Ordenes de Bocadillo de jamon: ");
        njam=  an. nextInt();
        jam=njam*4;
        Scanner en=new Scanner (System.in);
        System.out.println("Ordenes de Bocadillo de queso: ");
        nque=  en. nextInt();
        que=nque*3;
        Scanner in=new Scanner (System.in);
        System.out.println("Ordenes de Patatas fritas: ");
        npapa=  in. nextInt();
        papa=npapa*2;
        Scanner on=new Scanner (System.in);
        System.out.println("Ordenes de Refrescos: ");
        nsoda=  on. nextInt();
        soda=nsoda*1;
        Scanner un=new Scanner (System.in);
        System.out.println("Ordenes de Cervezas: ");
        ncerv=  un. nextInt();
        cerv=ncerv*2;
        System.out.println("Orden numero 01: ");
        System.out.println("NUMERO      ORDEN             PRECIO      TOTAL");
        System.out.println(njam+    "       Bocadito de Jamon      4 Euro         "+jam);
        System.out.println(nque+    "       Bocadito de Queso      3 Euro         "+que);
        System.out.println(npapa+   "       Patatas fritas         2 Euro         "+(papa));
        System.out.println(nsoda+   "       Refresco               1 Euro         "+(soda));
        System.out.println(ncerv+   "       Cerveza                2 Euro         "+(cerv));
        System.out.println(         "Total:                                       "+(jam+que+papa+soda+cerv));
        
    }
}
