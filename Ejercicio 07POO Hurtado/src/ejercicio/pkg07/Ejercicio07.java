package ejercicio.pkg07;

import Entidades.Personas;
import Servicio.PersonasServicio;

public class Ejercicio07 {

    public static void main(String[] args) {
        Personas people = new Personas();
        PersonasServicio ps = new PersonasServicio();
        double IMC;
        System.out.println("===================================================");
        System.out.println("Ingrese los datos de la primera persona");
        ps.crearPersona(people);
        ps.calcularIMC(people);
        System.out.println("Su IMC (Indice de masa corportal) es " + ps.calcularIMC(people));
        System.out.println("La persona es mayor de edad? " + ps.esMayorDeEdad(people));
        System.out.println(people.toString());
        System.out.println("===================================================");
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("Ingrese los datos de la segunda persona");
        ps.crearPersona(people);
        ps.calcularIMC(people);
        System.out.println("Su IMC (Indice de masa corportal) es " + ps.calcularIMC(people));
        System.out.println("La persona es mayor de edad? " + ps.esMayorDeEdad(people));
        System.out.println(people.toString());
        System.out.println("===================================================");
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("Ingrese los datos de la tercera persona");
        ps.crearPersona(people);
        ps.calcularIMC(people);
        System.out.println("Su IMC (Indice de masa corportal) es " + ps.calcularIMC(people));
        System.out.println("La persona es mayor de edad? " + ps.esMayorDeEdad(people));
        System.out.println(people.toString());
        System.out.println("===================================================");
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("Ingrese los datos de la cuarta persona");
        ps.crearPersona(people);
        ps.calcularIMC(people);
        System.out.println("Su IMC (Indice de masa corportal) es " + ps.calcularIMC(people));
        System.out.println("La persona es mayor de edad? " + ps.esMayorDeEdad(people));
        System.out.println(people.toString());
        System.out.println("===================================================");
    }

}
