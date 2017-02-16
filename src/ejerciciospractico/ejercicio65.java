/*
65.	Elabore una aplicación en Java llamada EstadisticasTemperatura que 
permita leer los nombres de N ciudades y sus temperaturas (a una determinada 
hora y día) en N meses y mostrar los resultados y estadísticas, como se muestra
en el siguiente ejemplo:
                                                 Mes                                                                  Temperatura
Ciudad            Enero                Febrero                 Marzo              Abril        Promedio/ciudad
Piura                 12.5 		      13.8                     14.2                 11.3               12.95
Sullana             11.8                      12.5                     13.2                 8.5                 11.50
Talara               17.0                      16.0                    15.5                 14.0                15.63
Paita                 17.5                      16.5                    15.5                 14.5                 16.00
                    ----------------   ------------------   -----------------       ------------     -----------
Temperatura          14.7                      14.7                     14.6                  12.1
promedio por mes

 */
package ejerciciospractico;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio65 {
    int t,n;
    String [] ciudad;
    String [] mes;
    int nc;
    int nm;
    float puntos;
    float [][] cime;
    DecimalFormat df = new DecimalFormat("0.0"); 
    public void EstadisticasTemperatura(){
        
        Scanner f= new Scanner(System.in);
        System.out.println("¿Numero de Ciudades?");
        nc= f.nextInt();
        String [] ciudad = new String [nc];
        for (int i = 0; i < nc; i++) {
            Scanner g= new Scanner (System.in);
            System.out.print("Ingrese nombre de la ciudad " + (i+1)+ " : ");
            ciudad[i]= g.nextLine();
        }
        Scanner h= new Scanner(System.in);
        System.out.println("¿Numero de Meses de estudio?");
        nm= h.nextInt();
        String [] mes = new String [nm];
        for (int i = 0; i < nm; i++) {
            Scanner sn= new Scanner (System.in);
            System.out.print("Ingrese nombre del mes " + (i+1)+ " : ");
            mes[i]= sn.nextLine();
        }
        float [][] cime= new float [nc][nm];
        for (int i = 0; i < cime.length; i++) {
            for (int j = 0; j < cime[i].length; j++) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Temperatura de la ciudad "+ ciudad[i]+ " en el mes de "+ mes[j]+" : ");
            cime[i][j]=sc.nextFloat();
            } 
        }
        
        System.out.print("CIUDAD/MES   ");
        for (int i = 0; i < nm; i++) {
            System.out.print(mes [i] + "          ");
        }
        System.out.println("PROMEDIO");
        
        for (int i = 0; i < nc; i++) {
            puntos=0;
            System.out.print(  ciudad [i]+ "          ");
            for (int j = 0; j < nm; j++) {
                System.out.print(df.format(cime[i][j])+"          ");
                puntos=((cime[i][j]+ puntos));
            }
            System.out.println(df.format(puntos/nm));
        }
    } 
}

