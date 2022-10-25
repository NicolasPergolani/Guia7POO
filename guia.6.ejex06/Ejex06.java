/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejex06;

import entidad.Ahorcado;
import entidad.servicioAhorcado;

/**
 *6. Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como 
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad 
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los 
parámetros que sean necesarios:
 * @author Cesar
 */
public class Ejex06 {

    public static void main(String[] args) {
        servicioAhorcado rs = new servicioAhorcado();
        Ahorcado a1 = rs.crearjuego();
        rs.longitud(a1);
    }
}
