/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9poo;

import Entidades.Matematica;
import Servicios.ServicioMath;

/**
 *
 * @author Pergo
 */
public class Ejercicio9POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica m = new Matematica();
        m.setNum1(Math.random() * 10);
        m.setNum2(Math.random() * 10);
        ServicioMath s = new ServicioMath();
        System.out.println("Los numeros son " + m.getNum1()+ " "+" "+ m.getNum2());
        System.out.println("El numero mas grande es " + s.devolverMayor(m));
        s.calcularPotencial(m);
        s.calcularRaiz(m);
    }

}
