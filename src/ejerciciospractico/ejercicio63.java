/*
63.	Cree un arreglo unidimensional B de 50 posiciones con valores enteros 
aleatorios entre 1 y 500. Haga una búsqueda binaria en el  arreglo para localizar 
todos y cada uno de los valores que se encuentran en otro arreglo A = { 3, 56, 
34, 7, 87}. Indique sus posiciones en el arreglo B cuando sean localizados. 
 */
package ejerciciospractico;

/**
 *
 * @author Otniel
 */
class ejercicio63 {
    public static int busquedaBinaria (int vector[], int dato){
        int n= vector.length;
        int centro, inf=0, sup=n-1;
        while(inf<=sup){
            centro=(sup+inf)/2;
            if(vector[centro]==dato) return centro;
            else if(dato<vector[centro]){
                sup=centro-1;
            }
            else{
                inf=centro+1;
            }
        }
        return -1;
    }
    public void BIN(){
        int[] vector= {1,4,7,8,9,14,23,47,56,60,61,63,65,66,68,69,70,73,76,77,79,86,82};
        int valorBuscado = 70;
        System.out.println(busquedaBinaria(vector, valorBuscado));   
    }
}
