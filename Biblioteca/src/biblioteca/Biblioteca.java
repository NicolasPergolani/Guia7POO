/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package biblioteca;

import Entidades.Libro;
import Entidades.ServicioLibro;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro l1 = new Libro();
        Libro l2 = new Libro();
        ServicioLibro llenado = new ServicioLibro();
        llenado.llenarLibro(l1);
        System.out.println(l1);

        

    }

}
