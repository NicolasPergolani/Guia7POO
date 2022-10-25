/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejex6poo;

/**
 *
 * @author Pergo
 */
public class Ejex6POO {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        entidad.servicioAhorcado rs = new entidad.servicioAhorcado();
        entidad.Ahorcado a1 = rs.crearjuego();
        rs.longitud(a1);
        rs.buscar(a1);
        rs.encontradas(a1);
    }
}