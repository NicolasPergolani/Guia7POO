/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8poo;

import Entidades.Cadena;
import ServicioCadena.ServicioCadena;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Ejercicio8POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena c1 = new Cadena();
        ServicioCadena s1 = new ServicioCadena();
        System.out.println("Ingrese una frase");
        c1.setFrase(leer.next());
        c1.setLongitud(c1.getFrase().length());
        s1.mostrarVocales(c1);
        s1.invertirFrase(c1);
        System.out.println("Ingrese la letra que desea consultar");
        s1.vecesRepetido(c1, leer.next());
        System.out.println("Ingrese la frase a comparar");
        s1.compararLongitud(c1, leer.next());
        System.out.println("Ingrese la frase que desea unir");
        s1.unirFrases(c1, leer.next());
        System.out.println("Ingrese la letra a reemplazar");
        s1.reemplazar(c1, leer.next());
        System.out.println("Que letra desea corroborar si se encuentra en la frase inicial");
        System.out.println(s1.contiene(c1, leer.next()));
    }
    
}
