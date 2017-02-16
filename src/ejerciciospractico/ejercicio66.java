/*
66.	Suponga que se desea desarrollar un programa para:
1. Leer una lista de calificaciones de un examen
2. Encontrar su media
3. Escribir una lista de las calificaciones mayores que la media
4. Ordenar la lista de las calificaciones en orden ascendente.
 */
package ejerciciospractico;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio66 {
    int cal;
    float[]ex;
    double sum=0;
    double m=0;
    int sup=0;
    float aux=0;
    DecimalFormat df= new DecimalFormat ("0.0");
    public void calificacion(){
        Scanner in= new Scanner (System.in);
        System.out.print("Cantidad de Calificaciones: ");
        cal = in.nextInt();
        float ex[]=new float[cal];
        
        for (int i = 0; i < cal; i++) {
            ex[i]=(float) (Math.random()*9+0);
            System.out.println("Calificacion Alumno "+ 
                    (i+1) + " : "+ df.format(ex[i]));
            sum=(sum+ex[i]);
        }
        m= (sum/cal);
        System.out.println("La media es: " + df.format(m));
        System.out.println("CALIFICACIONES SOBRE MEDIA:");
        for (int i = 0; i < cal; i++) {
        if (ex[i]>m){
                System.out.println("[ "+i+" ] : "+df.format(ex[i]));
            } 
        }
        for (int i = 0; i < ex.length-1; i++) {
            for (int j = 0; j < ex.length-1; j++) {
                if(ex[j]<ex[j+1]){
                      aux= ex[j+1];
                      ex[j+1]=ex[j];
                      ex[j]=aux;             
                }   
            }      
        }
        System.out.println("--CALIFICACIONES EN ORDEN--");
                    for (int j = 0; j < ex.length; j++) {
                        System.out.println(df.format(ex[j]));  
                    }
    }
}
