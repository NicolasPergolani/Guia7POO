/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Persona {
    private String nombre;
    private Date nacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nacimiento=" + nacimiento + '}';
    }
    public void crearPersona(){
     
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre");
        nombre=leer.next();
        System.out.println("Ingrese dia de nacimiento ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año nacimiento");
        int anio = leer.nextInt();
        Date nacimiento = new Date(anio - 1900, mes - 1, dia);
        this.nacimiento=nacimiento;
        System.out.println("Me llamo "+nombre+" naci el "+nacimiento.toLocaleString());
    }
    public void calcularEdad(Date nacimiento){
        Date fechaActual= new Date(); 
      if (fechaActual.getMonth()> getNacimiento().getMonth()){
            System.out.println("Usted tiene:" +((fechaActual.getYear() - getNacimiento().getYear()))+ " anios");
        }else{
             System.out.println("Usted tiene:" +(((fechaActual.getYear() - getNacimiento().getYear())-1))+ " anios");
        }

        
    }
    public boolean menorQue (int edad, Date nacimiento){
        boolean verdad=false;
        
        
        if (edad>nacimiento.getYear()) {
            verdad=true;
            
        
        }
        
        
        return verdad;
    }
    public void mostrarPersona(int edad){
        System.out.println("Zulma Lobato tiene "+edad+" años");
        
    }
}
