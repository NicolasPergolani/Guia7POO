/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Servicio {

    Scanner leer = new Scanner(System.in);

    public void crear(int a, int b, int c, Raices r) {
        System.out.println("Ingrese el valor de A");
        r.setA(leer.nextInt());
        System.out.println("Ingrese el valor de B");
        r.setB(leer.nextInt());
        System.out.println("Ingrese el valor de C");
        r.setC(leer.nextInt());
    }

    public double getDiscriminante(Raices r) {
        double discriminante;
        discriminante = Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
        System.out.println("El discriminante es: " + discriminante);
        return discriminante;
    }

    public boolean tieneRaices(Raices r) {

        return (getDiscriminante(r) > 0);
    }

    public boolean tieneRaiz(Raices r) {

        return (getDiscriminante(r) == 0);
    }

    public void obtenerRaices(Raices r) {
        double formula1 = 0, formula2 = 0;

        if (tieneRaices(r)) {
            formula1 = ((-r.getB()) + (Math.sqrt(getDiscriminante(r)))) / 2 * r.getA();
            formula2 = ((-r.getB()) - (Math.sqrt(getDiscriminante(r)))) / 2 * r.getA();
        }

        System.out.println("El resultado con el positivo es: " + formula1);
        System.out.println("El resultado con el negativo es: " + formula2);
    }

    public void obtenerRaiz(Raices r) {

        double formula = 0;
        if (tieneRaiz(r) == true) {
            formula = ((-r.getB()) + (Math.sqrt(getDiscriminante(r)))) / 2 * r.getA();
            System.out.println("============================");
            System.out.println("El resultado es: " + formula);
        }

    }

    public void calcular(Raices r) {
        if (getDiscriminante(r) < 0) {
            System.out.println("No tiene raices");
        } else if (tieneRaices(r)) {
            obtenerRaices(r);

        } else {
            obtenerRaiz(r);

        }

    }

}
