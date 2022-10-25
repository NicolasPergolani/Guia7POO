package ej.pkg7.poo.Servicios;

import ej.pkg7.poo.Utilidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String nombre, sexo;
    int edad;
    double peso, altura;

    public Persona crearPersona() {
        //NOMBRE
        System.out.println("Ingrese el nombre de la persona");
        nombre = leer.next();
        //SEXO
        System.out.println("Ingrese el Sexo [M (Mujer) / H (Hombre) / O (otro)]");
        sexo = leer.next();
        while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("O")) {
            System.out.println("El caracter introducido no es valido");
            System.out.println("Por favor, vuelva a ingresarlo");
            sexo = leer.next();
        }
        //EDAD
        System.out.println("Ingrese la edad");
        edad = leer.nextInt();
        while (edad < 0) {
            System.out.println("Ingrese nuevamente la edad");
            edad = leer.nextInt();
        }
        //PESO
        System.out.println("Ingrese el peso de la persona");
        peso = leer.nextDouble();
        //ALTURA
        System.out.println("Ingrese la altura de la persona");
        altura = leer.nextDouble();

        return new Persona(nombre, sexo, edad, peso, altura);
    }

    public int calcularIMC(Persona p) {
        double IMC;
        IMC = (p.getPeso() / (p.getAltura() * p.getAltura()));
        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(Persona p) {
        return (p.getEdad() >= 18);
    }

}
