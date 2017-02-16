/*
60.Realizar un programa que dentro de un String que contenga tu nombre completo, 
convierta las mayúsculas a minúsculas, minúsculas a mayúsculas. 
Imprima las dos cadenas. Imprima también solo tu apellido paterno.
 */
package ejerciciospractico;

/**
 *
 * @author Otniel
 */
class ejercicio60 {
    String n= "Otniel Eliezer Caraveo Carvajal";
    char []a;
    String y;
    String z;
    public void mods(){
        
        String x=n.toLowerCase();
        System.out.println("x = " + x);
        String y=n.toUpperCase();
        System.out.println("y = " + y);
        String z=n.substring(15,22);
        System.out.println("z = " + z);
        
        
    }
    
}
