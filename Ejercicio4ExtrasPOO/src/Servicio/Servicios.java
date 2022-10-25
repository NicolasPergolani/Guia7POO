/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra
(String o char) que le corresponde. Dispondrá de los siguientes métodos:
• Métodos getters y setters para el número de DNI y la letra.
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
un array (vector) de caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
package Servicio;

import Entidades.NIF;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in);

    public void crearNif(NIF d1) {
        String vector[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        System.out.println("Ingrese su DNI");
        d1.setDni(leer.nextLong());
        int valor = (int) d1.getDni() % 23;
        d1.setLetra(vector[valor]);
        

    }

    public void mostrar(NIF d1) {
       // String formato = String.format("%08d", d1.getDni());
        System.out.println("Su NIF es: ");
        System.out.println(String.format("%08d", d1.getDni())+ "-" + d1.getLetra());

    }
}
