/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Scanner;

/**
 * 6. Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá
 * contener como atributos, un vector con la palabra a buscar, la cantidad de
 * letras encontradas y la cantidad jugadas máximas que puede realizar el
 * usuario. Definir los siguientes métodos con los parámetros que sean
 * necesarios:
 *
 * @author Cesar
 */
public class servicioAhorcado {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Scanner leer2 = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearjuego() {

        Ahorcado a1 = new Ahorcado();
        System.out.println("Ingrese la palabra para jugar: ");
        String p1 = leer.nextLine();
        a1.setPalabra(p1.toCharArray());
        //char[] aCaracteres = sCadena.toCharArray();

        System.out.println("Ingrese cantidad de intentos");
        a1.setCantjug(leer2.nextInt());

        a1.setCantlet(p1.length());

        a1.setEncontradas(0);
       
        return a1;
    }

    public void longitud(Ahorcado a1) {
      
        for (int i = 0; i < a1.getCantlet(); i++) {

            if (a1.getPalabra()[i] == ' ') {
             a1.setLineas()[i]=" ";
            } else {
               a1.setLineas()[i] = ("_ ");
            }
        }

    }

    public void buscar(Ahorcado a1) {

        System.out.println("Ingrese una letra: ");
        char palabra2 = leer.next().charAt(0);

        for (int i = 0; i < a1.getCantlet(); i++) {
            if (a1.getPalabra()[i] == palabra2) {

                System.out.println("Se encontro la letra en la posicion " + i);

            }

        }
    }

    public void encontradas(Ahorcado a1, String lineas[]) {
        System.out.println("Ingrese una letra: ");
        char palabra2 = leer.next().charAt(0);

        for (int i = 0; i < a1.getCantlet(); i++) {
            if (a1.getPalabra()[i] == palabra2) {
                lineas[i] = String.valueOf(palabra2);
            }  
//            } else {
//                lineas[i] = "_ ";
//            }
        }
        for (int i = 0; i < a1.getCantlet(); i++) {
            System.out.print(lineas[i]);
        }
    }

}
