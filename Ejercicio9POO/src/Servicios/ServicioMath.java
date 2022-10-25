/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Matematica;

/**
 *
 * @author Pergo
 */
public class ServicioMath {
    public double devolverMayor(Matematica m){
        double mayor;
        mayor=Math.max(m.getNum1(), m.getNum2());
        return mayor;
    }
    public void calcularPotencial(Matematica m){
        if (m.getNum1()>m.getNum2()) {
            System.out.println("La potencia es"+Math.pow(Math.round(m.getNum1()), Math.round(m.getNum2())));
            
        }else{
             System.out.println("La potencia es"+Math.pow(Math.round(m.getNum2()), Math.round(m.getNum1())));
        }
   
    }
    public void calcularRaiz(Matematica m){
        double menor;
       menor=Math.abs(Math.min(m.getNum1(), m.getNum2()));
        System.out.println("La raiz cuadrada del menor de los dos valores es: "+Math.sqrt(menor));
    }
}
