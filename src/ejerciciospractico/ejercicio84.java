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
class ejercicio84 {
    int ingreso, ganancia, pipas, costo, nomina, gasto, mes,f;
    int gtotal=0;
    String m;
    int [] vector= new int [mes];
    public void gasolinera() {
        Scanner n = new Scanner (System.in);
        System.out.println("MESES FACTURADOS");
        mes=n.nextInt();
        
        for (int i = 0; i < mes; i++) {
            System.out.print("NOMBRE DE MES" +(i+1)+" : ");
            Scanner mes = new Scanner (System.in);
            m= mes.nextLine();
            Scanner a = new Scanner (System.in);
            System.out.print("INGRESO TOTAL: ");
            ingreso=a.nextInt();
            Scanner b = new Scanner (System.in);
            System.out.print("CANTIDAD DE PIPAS: ");
            pipas=b.nextInt();
            Scanner c = new Scanner (System.in);
            System.out.print("COSTO POR UNIDAD DE PIPAS: ");
            costo=c.nextInt();
            Scanner d = new Scanner (System.in);
            System.out.print("NOMINAS DE EMPLEADOS: ");
            nomina=d.nextInt();
            Scanner e = new Scanner (System.in);
            System.out.print("GASTOS IMPREVISTOS: ");
            gasto=e.nextInt();
            f=pipas*costo;
            ganancia= ingreso-(f+nomina+gasto);
            System.out.println(ganancia);
            gtotal= gtotal+ganancia;
            System.out.println("GANACIA TOTAL = " + gtotal);
        }
        
    }
    
}
