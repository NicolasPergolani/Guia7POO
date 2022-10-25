/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package ejecricio5extraspoo;

import java.util.Scanner;

public class Ejecricio5ExtrasPOO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String mesSecreto[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int mesSec = (int) (Math.random() * 12);
        String mes;
        System.out.println("Ingrese el mes que desea adivinar: ");
        mes = leer.next();
        while (!mes.equalsIgnoreCase(mesSecreto[mesSec])) {
            System.out.println("Incorrecto, intente nuevamente");
            mes = leer.next();
        }
        System.out.println("Correcto, el mes secreto era: " + mesSecreto[mesSec]);

    }

}
