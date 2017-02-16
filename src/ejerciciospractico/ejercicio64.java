/*
64.	En un concurso de belleza participan N señoritas candidatas y el jurado 
calificador ha establecido 4 criterios de evaluación: Belleza, Inteligencia, 
Cuerpo y Desenvolvimiento donde cada criterio tiene un puntaje de 1 a 10. 
Elabore una aplicación en Java llamada ConcursoDeBelleza que permita leer la 
cantidad de candidatas (N), los nombres de las candidatas y los criterios de 
evaluación y luego los puntajes obtenidos por cada una de las candidatas en 
cada uno de los criterios. Luego debe calcular el puntaje total obtenido por 
cada candidata, como se muestra en el siguiente ejemplo: 

                                                   Criterio                                           Puntaje
Candidata    Belleza    Inteligencia    Cuerpo    Desenvolvimiento     Total
Melisa             7.5              8.4               9.7                  9.3                     34.9
Leidi                8.2             5.7                8.2                 8.5                    30.6
Carolina           7.8             7.4                8.5                 8.0                    30.7
Isabel               7.5             6.8                9.5                 9.5                    33.3

 */
package ejerciciospractico;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio64 {
    String [] candidatas;
    int np;
    float puntos;
    float [][] b;
    DecimalFormat df = new DecimalFormat("0.00"); 
    public void ConcursoDeBelleza(){
        
        Scanner f= new Scanner(System.in);
        System.out.println("¿Numero de Participantes?");
        np= f.nextInt();
        String [] candidatas = new String [np];
        for (int i = 0; i < np; i++) {
            Scanner g= new Scanner (System.in);
            System.out.print("Ingrese nombre de participante " + (i+1)+ " : ");
            candidatas[i]= g.nextLine();
        }
        System.out.println("                            CRITERIO");
        System.out.println("Candidata   Belleza   Inteligencia      Cuerpo   Desenvolvimiento   Total");
        float [][] b= new float [np][4];
        for (int i = 0; i < np; i++) {
            
            puntos=0;
            System.out.print(  candidatas [i]+ "          ");
            for (int j = 0; j < 4; j++) {
                b[i][j]=(float) (Math.random()*10+0);
                System.out.print(df.format(b[i][j])+"          ");
                puntos=b[i][j]+puntos;
            }
            System.out.println(df.format(puntos));
        }
    }
    
}
