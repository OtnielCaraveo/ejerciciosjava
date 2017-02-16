/*
 Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas, 
el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por 
las tres ventas que realiza en el mes 
y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones. 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio26 {
    float sueldo;
    float v1, c1;
    float v2, c2;
    float v3, c3;
    
    public void ventas(){
        Scanner in = new Scanner (System.in);
        System.out.print("SUELDO BASE: ");
        sueldo = in.nextFloat();
        Scanner an = new Scanner (System.in);
        System.out.print("VENTA 1:     ");
        v1 = an.nextFloat();
        Scanner en = new Scanner (System.in);
        System.out.print("VENTA 2:     ");
        v2 = en.nextFloat();
        Scanner on = new Scanner (System.in);
        System.out.print("VENTA 3:     ");
        v3 = on.nextFloat();
        c1=(float) (v1*0.10);
        c2=(float) (v2*0.10);
        c3=(float) (v3*0.10);
        System.out.println("SUELDO BASE:"+sueldo);
        System.out.println("VENTA(+10%):"+c1);
        System.out.println("VENTA(+10%):"+c2);
        System.out.println("VENTA(+10%):"+c3);
        System.out.println("TOTAL:      "+(sueldo+c1+c2+c3));
        
    }
    
}
