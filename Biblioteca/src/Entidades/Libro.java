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
public class Libro {
    private Scanner leer =new Scanner(System.in);
    private String titulo;
    private String autor;
    private int numPagina;
    private int ISBN;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numPagina, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPagina = numPagina;
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }

    public void setISBN(int ISBN) {
         
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPagina() {
        return numPagina;
    }

    public int getISBN() {
        return ISBN;
    }

//    @Override
//    public String toString() {
//        return "Libro" + "Titulo=" + titulo+ "\n"+ "Autor="+ autor +"\n "+ "NumPagina=" + numPagina +"\n "+ "ISBN=" + ISBN  ;
//    }

   
    
    
}
