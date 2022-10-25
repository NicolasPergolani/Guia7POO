/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12poo;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Ejercicio12POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        // TODO code application logic here
        Persona p =new Persona();
        p.crearPersona();
        p.calcularEdad(p.getNacimiento());
        System.out.println("Ingrese su edad");
        int edad=leer.nextInt();
        System.out.println("Sos mas viejo que el anterior????");
        System.out.println(p.menorQue(edad, p.getNacimiento()));
        p.mostrarPersona(edad);
        System.out.println(p.toString());
    }
    
}
