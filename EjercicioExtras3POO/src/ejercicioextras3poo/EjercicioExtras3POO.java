/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextras3poo;

import Entidades.Raices;
import Servicio.Servicio;

/**
 *
 * @author Pergo
 */
public class EjercicioExtras3POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Raices r=new Raices();
       Servicio rs=new Servicio();
       rs.crear(3, 5, 7, r);
       rs.calcular(r);
    }
    
}
