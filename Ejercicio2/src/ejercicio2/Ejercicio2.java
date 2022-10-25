/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package ejercicio2;

import Circunferencia.Circunferencia;
import Servicios.Area;
import Servicios.Perimetro;

/**
 *
 * @author Pergo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circunferencia r1 = new Circunferencia();
       r1.crearCircunferencia();
       Area rs = new Area();
       Perimetro r2 = new Perimetro();
       rs.areaCircunferencia(r1);
       r2.perimetroCircunferencia(r1);
       
    }
    
}
