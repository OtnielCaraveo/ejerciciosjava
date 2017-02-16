/*
61.	El presidente de una compañía quiere obtener los datos de las ventas
de las 15 tiendas que tiene la corporación durante los últimos siete días. 
Quiere saber el total de ventas de cada tienda durante la semana, el total de 
ventas en la compañía por cada uno de los siete días, y el total de ventas de 
la compañía en toda la semana. (obtenga las ventas aleatorias - tipo double)
 */
package ejerciciospractico;

import java.text.DecimalFormat;

/**
 *
 * @author Otniel
 */
class ejercicio61 {
    
    double [][] tienda = new double[7][15];
    String dia;
    double a, b, c, d, e; 
    double f, g, h, i, j; 
    double k, l ,m, n, o;
    double p, q;
    DecimalFormat df = new DecimalFormat("0.00"); 
    ejercicio61() {
    }
    public void ventas(){
        System.out.println("DIA     TIENDA      VENTA");
        for (int x = 0; x < tienda.length; x++) {
            if (x!=0){
                System.out.println("DIA "+(x)+" TOTAL DE VENTAS " + df.format(q));
            }
            System.out.println("");
            q=0;
            for (int y = 0; y < tienda[x].length; y++) {
                tienda [x][y]= Math.random()*10000;
                q=tienda [x][y]+q;
                p=tienda [x][y]+p;
                System.out.print(x+1+"        "+(y+1)+"       ");
                if (y==0){
                    a=a+tienda [x][y];
                }
                if (y==1){
                    b=b+tienda [x][y];
                }
                if (y==2){
                    c=c+tienda [x][y];
                }
                if (y==3){
                    d=d+tienda [x][y];
                }
                if (y==4){
                    e=e+tienda [x][y];
                }
                if (y==5){
                    f=f+tienda [x][y];
                }
                if (y==6){
                    g=g+tienda [x][y];
                }
                if (y==7){
                    h=h+tienda [x][y];
                }
                if (y==8){
                    i=i+tienda [x][y];
                }
                if (y==9){
                    j=j+tienda [x][y];
                }
                if (y==10){
                    k=k+tienda [x][y];
                }
                if (y==11){
                    l=l+tienda [x][y];
                }
                if (y==12){
                    m=m+tienda [x][y];
                }
                if (y==13){
                    n=n+tienda [x][y];
                }
                if (y==14){
                    o=o+tienda [x][y];
                }
                System.out.println(df.format(tienda[x][y])); 
                
            }
            if (x==6){
                System.out.println("");
                System.out.println("VENTAS TOTALES POR SUCURSAL");
                System.out.println("SUCURSAL 1  = " + df.format(a));
                System.out.println("SUCURSAL 2  = " + df.format(b));
                System.out.println("SUCURSAL 3  = " + df.format(c));
                System.out.println("SUCURSAL 4  = " + df.format(d));
                System.out.println("SUCURSAL 5  = " + df.format(e));
                System.out.println("SUCURSAL 6  = " + df.format(f));
                System.out.println("SUCURSAL 7  = " + df.format(g));
                System.out.println("SUCURSAL 8  = " + df.format(h));
                System.out.println("SUCURSAL 9  = " + df.format(i));
                System.out.println("SUCURSAL 10 = " + df.format(j));
                System.out.println("SUCURSAL 11 = " + df.format(k));
                System.out.println("SUCURSAL 12 = " + df.format(l));
                System.out.println("SUCURSAL 13 = " + df.format(m));
                System.out.println("SUCURSAL 14 = " + df.format(n));
                System.out.println("SUCURSAL 15 = " + df.format(o));
                System.out.println("TOTAL DE VENTA SEMANAL = " + df.format(p));
            }
        }
    }
}
