/*
68.	 Crear un programa llamado vendedores que cree un array de 18 X 10 
indicando que poseemos una empresa de 18 vendedores cada uno de los cuales 
vende 10 productos. El array almacena los ingresos obtenidos por cada vendedor 
en cada producto, de modo que un menú permite almacenar los ingresos, 
revisar el total de cada vendedor y obtener los ingresos totales
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio67 {
    int[][]venta=new int[18][10];
    int x;
    int v;
    int t=0;
    public void vendedor(){
        for (int i = 0; i < venta.length; i++) {
            for (int j = 0; j < venta[i].length; j++) {
                venta[i][j]=(int) (Math.random()*1000+50);
            }
        }
        
        System.out.println("¿?");
    }
    public void menu(){
        System.out.println("---------MENU---------");
        System.out.println("1. Modificar Ventas");
        System.out.println("2. Total Vendedor");
        System.out.println("3. Ingresos Totales");
        System.out.println("4. Salir");
        Scanner in = new Scanner (System.in);
        System.out.print("SU OPCION ES:");
        x=in.nextInt();
        while(x!=4){
            if(x==1){
                System.out.println("INGRESE VENTAS");
                for (int i = 0; i < venta.length; i++) {
                    System.out.println("VENDEDOR: " + (i+1));
                    for (int j = 0; j < venta[i].length; j++) {
                        Scanner n = new Scanner (System.in);
                        System.out.print((j+1) + " ");
                        venta[i][j]= n.nextInt();
                    }
                }
            }
            if(x==2){
                for (int i = 0; i < venta.length; i++) {
                    v=0;
                    for (int j = 0; j < venta[i].length; j++) {
                        v=v+venta[i][j];
                    }
                    System.out.println("TOTAL VENDEDOR " + (i+1) + " : " + v);
                }
            }
            if(x==3){
                for (int i = 0; i < venta.length; i++) {
                    v=0;
                    for (int j = 0; j < venta[i].length; j++) {
                        v=v+venta[i][j];
                    }
                    t=t+v;
                }
                System.out.println("INGRESO TOTAL = " + t);
            }
        Scanner on = new Scanner (System.in);   
        System.out.println("---------MENU---------");
        System.out.println("1. Modificar Ventas");
        System.out.println("2. Total Vendedor");
        System.out.println("3. Ingresos Totales");
        System.out.println("4. Salir");
        System.out.print("SU OPCION ES:");
        x=on.nextInt();
        }
    }
}
