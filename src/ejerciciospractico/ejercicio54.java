/*

 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio54 {
    String f;
    char []a;
    String n;
    public void mayus(){
        Scanner sn= new Scanner (System.in);
        System.out.println("Nombre completo: ");
        f= sn.nextLine();
        char [] a= f.toCharArray();
        System.out.println("CLAVE ACCESO: ");
        for(int i=0;i<f.length();i++){
            if(a[i]==' '){
                System.out.print(a[i+1]);
                System.out.print(a[i+2]);
                System.out.print(a[i+3]);
            }
        }
            for(int i=0;i<f.length();i++){
            if(i==0){
                System.out.print(a[i]);
                System.out.print(a[i+1]);
                System.out.println(a[i+2]);
            
            }
        }
            
        
    }
}
