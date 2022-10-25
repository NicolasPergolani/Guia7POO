/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------

31

Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
 */
package ServiciosAhorcado;

import Entidades.Ahorcado;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearJuego(Ahorcado a) {

        System.out.println("Ingrese la frase para jugar");
        a.setFrase(leer.next());
        String[] frase = new String[a.getFrase().length()];
        for (int i = 0; i < a.getFrase().length(); i++) {
            frase[i] = a.getFrase().substring(i, i + 1);
        }
        a.setVectorAhorcado(frase);
        a.setCantLetrasEncontradas(0);
        a.setJugadas(6);

    }

    public String[] menu(Ahorcado a, String[] vectorPalabras) {

        System.out.println("Ingrese 1 para cargar letra");
        System.out.println("Ingrese 2 para arriesgar");
        int opcion = leer.nextInt();
        if (opcion == 1) {
            return cargarLetra(a, vectorPalabras);
        } else if (opcion == 2) {
            System.out.println("Ingrese la frase o palabra a arriesgar");
            String arriesgar = leer.next();
            a.setJugadas(0);
            if (arriesgar.equalsIgnoreCase(a.getFrase())) {
                return a.getVectorAhorcado();
            } else {
                System.out.println("Siga intentando");
            }

        }
        return vectorPalabras;

    }
//    public void cargarLetra(Ahorcado a){
//        System.out.println("Ingrese la letra");
//        String letra=leer.next();
//        
//        for (int i = 0; i < a.getVectorAhorcado().length; i++) {
//            if (letra.equalsIgnoreCase(a.getVectorAhorcado()[i])) {
//                int  posicion=i;
//            }
//        }
//    }

    public String[] iniciarVectorAhorcado(Ahorcado a) {
        String[] vectorPalabras = new String[a.getFrase().length()];
//        Arrays.fill(vectorPalabras, "- ");

        for (int i = 0; i < vectorPalabras.length; i++) {
            if (a.getVectorAhorcado()[i].equalsIgnoreCase(" ")) {
                vectorPalabras[i] = " ";
            } else {
                vectorPalabras[i] = "-";
            }
        }
        return vectorPalabras;
    }

    public String[] cargarLetra(Ahorcado a, String[] vectorPalabras) {

        System.out.println("Ingrese la letra");

        String letra = leer.next();
        while (letra.length() > 1) {
            System.out.println("Ingrese solo 1 letra soperutano");
            letra = leer.next();
        }
        int cont = 0;
        for (int i = 0; i < a.getVectorAhorcado().length; i++) {
            if (letra.equalsIgnoreCase(a.getVectorAhorcado()[i])) {
                vectorPalabras[i] = a.getVectorAhorcado()[i];
                cont++;
            }
        }
        if (cont == 0) {
            a.setJugadas(a.getJugadas() - 1);
        }

        return vectorPalabras;
    }

    public void mostrar(Ahorcado a, String[] vectorPalabras) {
        for (int i = 0; i < vectorPalabras.length; i++) {
            System.out.print((vectorPalabras[i]) + " ");
        }
        System.out.println(" ");
    }

//    public void juego(Ahorcado a) {
//
//    }
}
