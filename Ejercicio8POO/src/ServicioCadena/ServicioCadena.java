/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioCadena;

import Entidades.Cadena;

/**
 *
 * @author Pergo
 */
public class ServicioCadena {

    public void mostrarVocales(Cadena c1) {
        int cont = 0;

        for (int i = 0; i < c1.getLongitud(); i++) {
            char f1 = c1.getFrase().charAt(i);

            switch (f1) {
                case 'A':
                case 'a':
                    cont++;
                    break;
                case 'E':
                case 'e':
                    cont++;
                    break;
                case 'I':
                case 'i':
                    cont++;
                    break;
                case 'O':
                case 'o':
                    cont++;
                    break;
                case 'U':
                case 'u':
                    cont++;
                    break;
                default:
            }
        }
//         String palabra=c1.getFrase();
//         palabra=palabra.toLowerCase();
//         for (int i = 0; i < c1.getLongitud() ; i++) {
//             if (palabra.charAt(i)=='a'||palabra.charAt(i)=='e'||palabra.charAt(i)=='i'||palabra.charAt(i)=='o'||palabra.charAt(i)=='u') {
//                 cont++;
//             }
//            
//        }
        System.out.println("La cantidad de vocales en la frase es de " + cont);
    }

    public void invertirFrase(Cadena c1) {
        String f2 = "";
        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            System.out.print(c1.getFrase().charAt(i));
        }
    }

    public void vecesRepetido(Cadena c1, String letra) {
        int cont1 = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(c1.getFrase().substring(i, i + 1))) {
                cont1++;
            }

        }
        System.out.println("El caracter " + letra + " se encontro " + cont1 + " veces");
    }

    public void compararLongitud(Cadena c1, String frase1) {
        if (c1.getLongitud() > frase1.length()) {
            System.out.println("La frase es mas pequeña ");
        } else if (c1.getLongitud() == frase1.length()) {
            System.out.println("La frase es del mismo tamaño");
        } else {
            System.out.println("La frase es mas larga");
        }
    }

    public void unirFrases(Cadena c1, String frase2) {
        System.out.println("La frase unida quedaria asi:\n " + c1.getFrase() + " " + frase2);
    }

    public void reemplazar(Cadena c1, String letra1) {

        c1.setFrase(c1.getFrase().replaceAll("A", "a"));
        System.out.println((c1.getFrase().replaceAll("a", letra1)));

    }

    public boolean contiene(Cadena c1, String letra2) {
        boolean cont2 = false;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (letra2.equalsIgnoreCase(c1.getFrase().substring(i, i + 1))) {
                cont2 = true;
                break;
            }

        }
        return cont2;
    }
}
