/*
 Se posee un monto de dinero de $120, se gasta en supermercado $49,5 
y luego en verdulería 12,10. Mostrar el saldo. 
 */
package ejerciciospractico;

/**
 *
 * @author Otniel
 */
class ejercicio12 {
    int dinero=120;
    double gasto=49.50;
    double verdura=12.10;
    
    void saldo() {
        System.out.println("Saldo: "+((dinero-gasto)-verdura));
    }
    
}
