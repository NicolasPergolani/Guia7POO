/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

/**
 *
 * @author Pergo
 */
public class Ahorcado {
    
    private char palabra[];
    private int cantLet;
    private int cantJug, cantEnc;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int cantLet, int cantJug, int cantEnc) {
        this.palabra = palabra;
        this.cantLet = cantLet;
        this.cantJug = cantJug;
        this.cantEnc = cantEnc;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
//        this.palabra = palabra;
    }

    public int getCantLet() {
        return cantLet;
    }

    public void setCantLet(int cantLet) {
        this.cantLet = cantLet;
    }

    public int getCantJug() {
        return cantJug;
    }

    public void setCantJug(int cantJug) {
        this.cantJug = cantJug;
    }

    public int getCantEnc() {
        return cantEnc;
    }

    public void setCantEnc(int cantEnc) {
        this.cantEnc = cantEnc;
    }
    

 

  
}
