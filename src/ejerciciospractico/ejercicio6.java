/*
Escribir un programa que calcule la nómina de un trabajador de la manera siguiente.
El trabajador cobra un precio fijo por hora y se le retiene un 5% en concepto de IRPF.
El programa debe pedir el nombre del trabajador, las horas trabajadas y el precio que cobra por hora.
Como salida debe imprimir el sueldo bruto, la retención y el sueldo neto.
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
public class ejercicio6 {
    String n;
    int horas;
    float paga;
    float sb, ret, sn;
    
    public void data(){
        Scanner in = new Scanner (System.in);
        System.out.print("Nombre del Trabajador: ");
        n = in.nextLine();
        Scanner on = new Scanner (System.in);
        System.out.print("Horas Trabajadas: ");
        horas = on.nextInt();
        Scanner en = new Scanner (System.in);
        System.out.print("Pago por hora: ");
        paga = in.nextFloat();   
    }
    
    public void print(){
        sb=horas*paga;
        ret=(float) (sb*0.05);
        sn=sb-ret;
        System.out.println("---------------------------------------------");
        System.out.println("---------------NOMINA DE PAGO----------------");
        System.out.println("Trabajador: "+n);
        System.out.println("Sueldo bruto:             "+sb);
        System.out.println("IRPF:                    -"+ret);
        System.out.println("Sueldo neto:              "+sn);
        
    }
}
