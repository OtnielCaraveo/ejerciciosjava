/*
Escribir un programa que pida dos números y saque el mayor de ellos por pantalla
o informar si  los dos números son iguales
 */
package ejerciciospractico;

import java.util.Scanner;

class ejercicio76 {
    int x;
    int y;
    public void igual(){
        Scanner in = new Scanner (System.in);
        System.out.print("Digite un numero: ");
        x=in.nextInt();
        Scanner on = new Scanner (System.in);
        System.out.print("Digite otro numero: ");
        y=on.nextInt();
        if(x>y){
            System.out.println("El numero mayor es : " + x);
        }
        if(y>x){
            System.out.println("El numero mayor es : " + y);
        }
        if(y==x){
            System.out.println("Los dos numeros son iguales ");
        }
    }
}
