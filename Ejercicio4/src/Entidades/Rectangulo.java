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
public class Rectangulo {
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    public void datos(Rectangulo r1){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la base");
        r1.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura");
        r1.setAltura(leer.nextDouble());
    }
    public void superficie (Rectangulo r1){
        System.out.println("La superfici del rectangulo es de: "+r1.getBase()*r1.getAltura());
    }
    public void perimetro (Rectangulo r1){
        System.out.println("El perimetro del rectangulo es de: "+((r1.getBase()+r1.getAltura()))*2);
    }
    public void mostrar (Rectangulo r1){
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                if (i > 0 && i < r1.getAltura()-1 && j > 0 && j < r1.getBase()-1) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }

            }
            System.out.println("");
        }

    }
}
