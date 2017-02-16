/*
62.	Cree un arreglo unidimensional de 50 posiciones con valores enteros 
aleatorios entre 1 y 500, Ordene el  arreglo utilizando el método de Burbuja
 */
package ejerciciospractico;

/**
 *
 * @author Otniel
 */
class ejercicio62 {
    int[]a= new int[49];
    int aux;

    public void mb(){
        for (int i = 0; i < a.length; i++) {
            a[i]=(int)(Math.random()*500+1);
            System.out.println( a[i]);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if(a[j]<a[j+1]){
                      aux=a[j+1];
                      a[j+1]=a[j];
                      a[j]=aux;             
                }   
            }      
        }
                    for (int j = 0; j < a.length; j++) {
                        System.out.println(a[j]);  
                    }    
    }
}
