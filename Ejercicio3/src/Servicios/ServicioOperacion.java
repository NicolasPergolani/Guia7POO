/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class ServicioOperacion {

    public void crearOperaciones(Operacion o1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        o1.setNum1(leer.nextDouble());
        System.out.println("Ingrese el segundo numero");
        o1.setNum2(leer.nextDouble());

    }

    public void sumarOperacion(Operacion o1) {
        System.out.println(o1.getNum1() + o1.getNum2());

    }

    public void restarOperacion(Operacion o1) {
        System.out.println(o1.getNum1() - o1.getNum2());
    }

    public void multiplicarOperacion(Operacion o1) {
        if (o1.getNum1() == 0 || (o1.getNum2() == 0)) {
            System.out.println("Uno de los valores es 0 el resultado es 0");
        } else {
            System.out.println(o1.getNum1() * o1.getNum2());
        }
        

    

    

}
      public void divisionOperacion(Operacion o1) {
        if (o1.getNum1() != 0 && (o1.getNum2() != 0)) {
          
            if (o1.getNum1()<o1.getNum2()) {
                 System.out.println(o1.getNum1() / o1.getNum2());
               
                
            }else{
                 System.out.println(o1.getNum2()/o1.getNum1());
            }
        } else {
           
              System.out.println("Uno de los valores es 0 el resultado es 0");
        }
        

    

    

}
}
