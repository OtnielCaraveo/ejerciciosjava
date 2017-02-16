/*
Escribir un programa que, dado el nombre o número del mes, y la información de si el 
año es bisiesto saque por pantalla el número de días del mes    
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio83 {
    String m;
    String m1l = "enero";
    String m1n = new String ("1");
    String m2l = new String("febrero");
    String m2n = new String ("2");
    String m3l = new String("marzo");
    String m3n = new String ("3");
    String m4l = new String("abril");
    String m4n = new String ("4");
    String m5l = new String("mayo");
    String m5n = new String ("5");
    String m6l = new String("junio");
    String m6n = new String ("6");
    String m7l = new String("julio");
    String m7n = new String ("7");
    String m8l = new String("agosto");
    String m8n = new String ("8");
    String m9l = new String("septiembre");
    String m9n = new String ("9");
    String m10l = new String("octubre");
    String m10n = new String ("10");
    String m11l = new String("noviembre");
    String m11n = new String ("11");
    String m12l = new String("diciembre");
    String m12n = new String ("12");
    String ab = new String ("s");
    public void mes(){
        Scanner in = new Scanner (System.in);
        System.out.println("Mes de busqueda?");
        m= in.nextLine();
        if((m == null ? m1l == null : m.equals(m1l))||(m == null ? m1n == null : m.equals(m1n))){
            System.out.println("ENERO tiene 31 DIAS");
        }
        if((m == null ? m2l == null : m.equals(m2l))||(m == null ? m2n == null : m.equals(m2n))){
            System.out.println("¿ES ESTE AÑO BISIESTO? (s/n)");
            Scanner on = new Scanner (System.in);
            String a = on.nextLine();
            if (a == null ? ab == null : a.equals(ab)){
                System.out.println("FEBRERO TIENE 29 DIAS EN AÑO BISIESTO");
            }
            else{ System.out.println("FEBRERO TIENE 28 DIAS");}
        }
        if((m == null ? m3l == null : m.equals(m3l))||(m == null ? m3n == null : m.equals(m3n))){
            System.out.println("MARZO TIENE 31 DIAS");
        }
        if ((m == null ? m4l == null : m.equals(m4l))||(m == null ? m4n == null : m.equals(m4n))){
            System.out.println("ABRIL TIENE 30 DIAS");
        }
        if ((m == null ? m5l == null : m.equals(m5l))||(m == null ? m5n == null : m.equals(m5n))){
            System.out.println("MAYO TIENE 31 DIAS");
        }
        if ((m == null ? m6l == null : m.equals(m6l))||(m == null ? m6n == null : m.equals(m6n))){
            System.out.println("JUNIO TIENE 30 DIAS");
        }
        if ((m == null ? m7l == null : m.equals(m7l))||(m == null ? m7n == null : m.equals(m7n))){
            System.out.println("JULIO TIENE 31 DIAS");
        }
        if ((m == null ? m8l == null : m.equals(m8l))||(m == null ? m8n == null : m.equals(m8n))){
            System.out.println("AGOSTO TIENE 31 DIAS");
        }
        if ((m == null ? m9l == null : m.equals(m9l))||(m == null ? m9n == null : m.equals(m9n))){
            System.out.println("SEPTIEMBRE TIENE 30 DIAS");
        }
        if (m.equals(m10l)||m.equals(m10n)){
            System.out.println("OCTUBRE TIENE 31 DIAS");
        }
        if (m.equals(m11l)||m.equals(m11n)){
            System.out.println("NOVIEMBRE TIENE 30 DIAS");
        }
        if (m.equals(m12l)||m.equals(m12n)){
            System.out.println("DICIEMBRE TIENE 31 DIAS");
        }
    }
}
