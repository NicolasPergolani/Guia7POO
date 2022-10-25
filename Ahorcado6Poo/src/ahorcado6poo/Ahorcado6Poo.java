/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado6poo;

import Ahorcado.Ahorcado;
import ServicioAhorcado.ServicioA;

/**
 *
 * @author Pergo
 */
public class Ahorcado6Poo {

 public static void main(String[] args) {
        ServicioA rs = new ServicioA();
        Ahorcado a = rs.crearJuego();
        rs.longitud(a);
    }
}


