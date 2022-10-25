/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class ServicioLibro {

    public void llenarLibro(Libro l1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el valor del ISBN");
        l1.setISBN(leer.nextInt());
        System.out.println("Ingrese el Titulo del libro");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese el Autor del libro");
        l1.setAutor(leer.next());
        System.out.println("Ingrese el numero de Paginas");
        l1.setNumPagina(leer.nextInt());

    }

}
