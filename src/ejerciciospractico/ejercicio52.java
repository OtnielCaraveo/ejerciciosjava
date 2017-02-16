/*
Escribir un programa que pida una palabra y cuente el número de vocales 
y consonantes que contiene.
 */
package ejerciciospractico;
import java.util.Scanner; 
/**
 *
 * @author Otniel
 */
class ejercicio52 {
    
    public void vocales(){ 
     Scanner sc = new Scanner( System.in); 

     System.out.print( "Ingrese una frase: "); 
     String frase = sc.nextLine(); 
     int cont[] = new int[26]; 
     int n=0;
     int c=0;

     for(int i = 0; i < frase.length(); i++){ 
         if((frase.charAt(i)=='a')||(frase.charAt(i)=='e')||(frase.charAt(i)=='i')||(frase.charAt(i)=='o'||
                 (frase.charAt(i)=='u'))){ 
             n++;
                         }
         if((frase.charAt(i)!='a')&&(frase.charAt(i)!='e')&&(frase.charAt(i)!='i')&&(frase.charAt(i)!='o')&&
                 (frase.charAt(i)!='u')){ 
             c++;
                         }
          //char c = Character.toLowerCase( frase.charAt(i)); 
          //El método charAt devuelve un valor de carácter igual al carácter situado en la posición especificada por index. 
          //El primer carácter de una cadena está en el índice 0, el segundo en el índice 1 y así sucesivamente.
          //     if(c >= 'a' && c <= 'z' ) 
          //          cont[c - 'a']++; 
             
     } 
        System.out.println("La frase "+frase+" contiene: "+ n +" vocales.");
        System.out.println("La frase "+frase+" contiene: "+ c +" consonantes.");
//     for(int i = 0; i < 26; i++) 
//          if(cont[i] > 0) 
//               System.out.println( (char)(i + 'a') + ": " + cont[i]); 
//        System.out.println("Numero de Vocales: "+ n);
    } 

}
