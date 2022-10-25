
package ejercicio6poo;

import Entidades.Cafetera;
import Servicios.ServicioCafetera;

/**
 *
 * @author Pergo
 */
public class Ejercicio6POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Cafetera c1 = new Cafetera();
        ServicioCafetera cs = new ServicioCafetera();
        
        cs.menu(c1);
    }
    
}
