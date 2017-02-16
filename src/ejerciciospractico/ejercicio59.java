/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospractico;

/**
 *
 * @author Otniel
 */
class ejercicio59 {
    int [][] prom = new int[8][20];
    float r=0;
    int p=0;
    public void promedio(){
        System.out.println("Unidad  Control Calif.");
        for(int x=0; x<prom.length; x++){
            if(x>0){
                System.out.println("Calificacion Promedio: "+(p/20));
                System.out.println("Numero de Reprobados: "+r);
                System.out.println("Porcentaje Reprobados: "+(r/20)*100);
                r=0;
                p=0;
                    System.out.println("Unidad  Control Calif.");
            }
            for(int y=0; y<prom[x].length; y++){
         prom[x][y]=(int)(Math.random()*100+0);
            p=p+prom[x][y];
                System.out.println((x+1)+"        "+(y+1)+"      "+(prom[x][y]));
        if(prom[x][y]<70){
            r=r+1;
        }
    }
    
}
        System.out.println("Calificacion Promedio: "+(p/20));
                System.out.println("Numero de Reprobados: "+r);
                System.out.println("Porcentaje Reprobados: "+(r/20)*100);
    }
}