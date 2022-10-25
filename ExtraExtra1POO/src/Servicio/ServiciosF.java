/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Fraccion;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class ServiciosF {

    Scanner leer = new Scanner(System.in);
    Fraccion f = new Fraccion();

    public void ingresarNumeros() {
        System.out.println("Vamos a ingresar las fracciones");
        System.out.println("Primer nominador");
        f.setNumerador1(leer.nextInt());
        System.out.println("Primer denominador");
        f.setDenominador1(leer.nextInt());
        System.out.println("Segundo nominador");
        f.setNumerador2(leer.nextInt());
        System.out.println("Segundo denominador");
        f.setDenominador2(leer.nextInt());
    }

    public void Menu() {
        int opcion;
        do {
            System.out.println("Menu de Operaciones entre Fracciones");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    Sumar();
                    break;
                case 2:
                    Restar();
                    break;
                case 3:
                    Multiplicar();
                    break;
                case 4:
                    Dividir();
                    break;
                case 5:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 5));

    }

    public void Sumar() {
        int mayor, menor, mcm = 0, otra = 0, otraMas = 0;
        if (f.getDenominador1() != f.getDenominador2()) {
//            double denominadorComun = f.getDenominador1() * f.getDenominador2();
            mayor = Math.max(f.getDenominador1(), f.getDenominador2());
            menor = Math.min(f.getDenominador1(), f.getDenominador2());
            if (mayor % menor == 0) {
                mcm = mayor;
                if (mayor == f.getDenominador1()) {
                    otra = (mcm / menor) * f.getNumerador2();
                    otraMas = f.getNumerador1();
                } else if (mayor == f.getDenominador2()) {
                    otra = (mcm / menor) * f.getNumerador1();
                    otraMas = f.getNumerador2();
                }
                //otra=f.getDenominador1();

            } else {
                mcm = mayor * menor;
                if (f.getDenominador1()>f.getDenominador2()) {
                    otra = (mcm / mayor) * f.getNumerador1();
                    otraMas=(mcm/menor) * f.getNumerador2();
                }else if(f.getDenominador2()>f.getDenominador1()){
                    otra = (mcm / menor) * f.getNumerador1();
                    otraMas=(mcm/mayor) * f.getNumerador2();
                }

                

            }
        } else if (f.getDenominador1() == f.getDenominador2()) {
            mcm = f.getDenominador1();
            otra=f.getNumerador1();
            otraMas=f.getNumerador2();
        }
        System.out.println("La fraccion es igual: ");
        System.out.println(otra + otraMas);
        System.out.println("-");
        System.out.println(mcm);
//        double fraccion=f.getNumerador1()+f.getNumerador2();

    }
    public void Restar(){
         int mayor, menor, mcm = 0, otra = 0, otraMas = 0;
        if (f.getDenominador1() != f.getDenominador2()) {
//            double denominadorComun = f.getDenominador1() * f.getDenominador2();
            mayor = Math.max(f.getDenominador1(), f.getDenominador2());
            menor = Math.min(f.getDenominador1(), f.getDenominador2());
            if (mayor % menor == 0) {
                mcm = mayor;
                if (mayor == f.getDenominador1()) {
                    otraMas = (mcm / menor) * f.getNumerador2();
                    otra = f.getNumerador1();
                } else if (mayor == f.getDenominador2()) {
                    otra = (mcm / menor) * f.getNumerador1();
                    otraMas = f.getNumerador2();
                }
                //otra=f.getDenominador1();

            } else {
                mcm = mayor * menor;
                if (f.getDenominador1()>f.getDenominador2()) {
                    otra = (mcm / mayor) * f.getNumerador1();
                    otraMas=(mcm/menor) * f.getNumerador2();
                }else if(f.getDenominador2()>f.getDenominador1()){
                    otra = (mcm / menor) * f.getNumerador1();
                    otraMas=(mcm/mayor) * f.getNumerador2();
                }

                

            }
        } else if (f.getDenominador1() == f.getDenominador2()) {
            mcm = f.getDenominador1();
            otra=f.getNumerador1();
            otraMas=f.getNumerador2();
        }
        System.out.println("La resta de las fracciones es igual: ");
        System.out.println(otra - otraMas);
        System.out.println("-");
        System.out.println(mcm);
    }
    public void Multiplicar(){
        
        int aca=f.getNumerador1()*f.getNumerador2(),masAca=f.getDenominador2()*f.getDenominador1();
        
        System.out.println("La multiplicacion de las fracciones es igual a: ");
        System.out.println(aca);
        System.out.println("-");
        System.out.println(masAca);
        
        if (aca==masAca) {
            System.out.println("El resultado es de 1");
            
            
        }
        if (aca>masAca) {
            
        }
        
    }
    public void Dividir(){
        
        int aca=f.getNumerador1()*f.getNumerador2(),masAca=f.getDenominador2()*f.getDenominador1();
        
        System.out.println("La division de las fracciones es igual a: ");
        System.out.println(aca);
        System.out.println("-");
        System.out.println(masAca);
        
        if (aca==masAca) {
            System.out.println("El resultado es de 1");
            
            
        }
        if (aca>masAca) {
            
        }
        
    }
}
