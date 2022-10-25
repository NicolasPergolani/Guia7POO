package Servicio;

import Entidades.Sopa;
import java.util.Scanner;

/**
 *
 * @author Guillote
 */
public class SopaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Sopa s = new Sopa();
    int indice = 0;

    public void llenarMatriz() {
        String matrizUno[][] = {{"p", "e", "r", "r", "o"}, {"g", "a", "t", "o", "s"},
        {"l", "i", "s", "t", "o"}, {"p", "a", "r", "t", "o"},
        {"c", "o", "b", "r", "o"}};

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                s.matriz[i][j] = matrizUno[i][j];

            }
        }
    }

    public void imprimir() {
        String vector[] = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (s.matriz[i][j] == null) {
                    s.matriz[i][j] = vector[(int) (Math.random() * 10)];
                }
                System.out.print(s.matriz[i][j]+"  ");
            }
            System.out.println("   ");
        }
        System.out.println("..............................");
        System.out.println("..............................");
    }

    public void buscarPalabra() {
        System.out.println("Que palabra desea buscar: ");
//        String palabra = leer.next();
//        String busca[] = new String[palabra.length()];
//        for (int i = 0; i < busca.length; i++) {
//            busca[i] = palabra.substring(i, i + 1);
//        }
//        for (int i = 0; i < s.matriz.length; i++) {
//            for (int k = 0; k < busca.length; k++) {
//                if (s.matriz[i][k].equalsIgnoreCase(busca[0]) && s.matriz[i][k + 1].equalsIgnoreCase(busca[1])) {
//                    System.out.println("La palabra se encuentra a partir de la fila " + (i + 1) + " ,columna 1");
//                    indice = i;
//                }
//                break;
//            }
//        }

        s.setPalabra(leer.next());
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < s.getPalabra().length(); j++) {
                if (s.matriz[i][j].equals(s.getPalabra().substring(0, 1)) && (s.matriz)[i][j + 1].equals(s.getPalabra().substring(1, 2))) {
                    indice = i;
                    System.out.println("Su palabra se encuentra en el indice " + (i + 1));
                }
                break;
            }
        }

    }

    public void reemplazar() {
        System.out.println("Ingresá la palabra nueva");
        String p = leer.next();

        for (int i = 0; i < p.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                s.matriz[indice][j] = " " + p.substring(j, j + 1) + " ";
            }
        }
        System.out.println("..............................");
        System.out.println("..............................");
    }

    public void matrizInvertida() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(s.matriz[j][i]);
            }
            System.out.println("");

        }
        System.out.println("..............................");
        System.out.println("..............................");
    }
}
