/*
Escribir un programa que llene una matriz de 5 por 5 de valores aleatorios.
A continuación el programa debe imprimirla por pantalla. 
Opcional: El programa puede tambien imprimir las sumas de las filas y las columnas
 */
package ejerciciospractico;



/**
 *
 * @author Otniel
 */
class ejercicio49 {
    int [][] valor = new int[5][5];
    public void cinco(){
        for(int x=0; x < valor.length; x++) {
            for (int y=0; y < valor[x].length; y++) {
                valor[x][y]=(int)(Math.random()*9+1);
                System.out.print(valor[x][y]+" ");
        }
            System.out.println("");
    }
}
}
