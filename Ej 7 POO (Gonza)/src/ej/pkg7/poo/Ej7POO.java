package ej.pkg7.poo;

import ej.pkg7.poo.Servicios.PersonaServicio;
import ej.pkg7.poo.Utilidades.Persona;

public class Ej7POO {

    public static void main(String[] args) {
        Persona p1, p2, p3, p4;
        PersonaServicio ps = new PersonaServicio();

        p1 = ps.crearPersona();
        System.out.println("-------------------------------------------------");
        p2 = ps.crearPersona();
        System.out.println("-------------------------------------------------");
        p3 = ps.crearPersona();
        System.out.println("-------------------------------------------------");
        p4 = ps.crearPersona();
        System.out.println("-------------------------------------------------");

        mostrarIMC(p1, p2, p3, p4, ps);
        System.out.println("-------------------------------------------------");
        mostrarEdad(p1, p2, p3, p4, ps);
    }

    public static void mostrarIMC(Persona p1, Persona p2, Persona p3, Persona p4, PersonaServicio ps) {
        int contDebajo = 0, contIdeal = 0, contEncima = 0;
        switch (ps.calcularIMC(p1)) {

            case -1:
                System.out.println(p1.getNombre() + " está por debajo de su peso Ideal");
                contDebajo++;
                break;
            case 0:
                System.out.println(p1.getNombre() + " está en su peso Ideal");
                contIdeal++;
                break;
            case 1:
                System.out.println(p1.getNombre() + " está por encima de su peso Ideal");
                contEncima++;
                break;
        }

        switch (ps.calcularIMC(p2)) {

            case -1:
                System.out.println(p2.getNombre() + " está por debajo de su peso Ideal");
                contDebajo++;
                break;
            case 0:
                System.out.println(p2.getNombre() + " está en su peso Ideal");
                contIdeal++;
                break;
            case 1:
                System.out.println(p2.getNombre() + " está por encima de su peso Ideal");
                contEncima++;
                break;
        }

        switch (ps.calcularIMC(p3)) {

            case -1:
                System.out.println(p3.getNombre() + " está por debajo de su peso Ideal");
                contDebajo++;
                break;
            case 0:
                System.out.println(p3.getNombre() + " está en su peso Ideal");
                contIdeal++;
                break;
            case 1:
                System.out.println(p3.getNombre() + " está por encima de su peso Ideal");
                contEncima++;
                break;
        }

        switch (ps.calcularIMC(p4)) {

            case -1:
                System.out.println(p4.getNombre() + " está por debajo de su peso Ideal");
                contDebajo++;
                break;
            case 0:
                System.out.println(p4.getNombre() + " está en su peso Ideal");
                contIdeal++;
                break;
            case 1:
                System.out.println(p4.getNombre() + " está por encima de su peso Ideal");
                contEncima++;
                break;
        }
        System.out.println("");
        System.out.println("El (" + (100 * contDebajo) / 4 + "%) de las Personas están por debajo de su peso ideal");
        System.out.println("El (" + (100 * contIdeal) / 4 + "%) de las Personas están en su peso ideal");
        System.out.println("El (" + (100 * contEncima) / 4 + "%) de las Personas están por encima de su peso ideal");
    }

    public static void mostrarEdad(Persona p1, Persona p2, Persona p3, Persona p4, PersonaServicio ps) {
        int contMayor = 0, contMenor = 0;
        if (ps.esMayorDeEdad(p1)) {
            System.out.println(p1.getNombre() + " es MAYOR de Edad");
            contMayor++;
        } else {
            System.out.println(p1.getNombre() + " es MENOR de Edad");
            contMenor++;
        }

        if (ps.esMayorDeEdad(p2)) {
            System.out.println(p2.getNombre() + " es MAYOR de Edad");
            contMayor++;
        } else {
            System.out.println(p2.getNombre() + " es MENOR de Edad");
            contMenor++;
        }

        if (ps.esMayorDeEdad(p3)) {
            System.out.println(p3.getNombre() + " es MAYOR de Edad");
            contMayor++;
        } else {
            System.out.println(p3.getNombre() + " es MENOR de Edad");
            contMenor++;
        }

        if (ps.esMayorDeEdad(p4)) {
            System.out.println(p4.getNombre() + " es MAYOR de Edad");
            contMayor++;
        } else {
            System.out.println(p4.getNombre() + " es MENOR de Edad");
            contMenor++;
        }
        System.out.println("");
        System.out.println("El (" + (100 * contMayor) / 4 + "%) de las personas es Mayor de edad");
        System.out.println("El (" + (100 * contMenor) / 4 + "%) de las personas es Menor de edad");
    }
}
