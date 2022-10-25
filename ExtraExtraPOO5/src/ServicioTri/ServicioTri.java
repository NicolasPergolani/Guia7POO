/*
 Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package ServicioTri;

import EntidadTriangulo.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class ServicioTri {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     Triangulo t = new Triangulo();

    public void datos() {
        System.out.println("Ingrese la base del triaqngulo: ");
        t.setBase(leer.nextInt());
        System.out.println("Ingrese el lado del triangulo: ");
        t.setLado(leer.nextInt());
    }

    public double area() {
        double altura, acuadrado, bcuadrado, area;
        acuadrado = Math.pow(t.getLado(), 2);
        bcuadrado = Math.pow(t.getBase(), 2);
        altura = Math.sqrt(acuadrado - (bcuadrado / 4));
        area = ((t.getBase() * altura) / 2);
        System.out.println(area);
        return area;
    }
    public double perimetro(){
        double peri;
        peri=(t.getLado()*2)+t.getBase();
        System.out.println(peri);
        return peri;
    }
    public void mostrar(){
        
    }
}
