/*
 Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejercicio11poo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Ejercicio11POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dia ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        System.out.println(fecha);
        Date fechaActual= new Date();     
        long miliFecha=fecha.getTime();
        long miliFechaActual=fechaActual.getTime();
        long resta=miliFechaActual-miliFecha;
        Date restF=new Date();
        restF.setTime(resta);
        System.out.println(restF);
        System.out.println("Pasaron "+(fechaActual.getYear()-fecha.getYear())+" años");
        System.out.println("Pasaron "+(fechaActual.getMonth()-fecha.getMonth())+" meses");
        System.out.println("Pasaron "+(fechaActual.getDate()-fecha.getDate())+" dias");
    }

}
