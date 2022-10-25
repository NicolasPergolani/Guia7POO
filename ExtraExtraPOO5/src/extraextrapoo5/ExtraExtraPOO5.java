/*
 Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package extraextrapoo5;

import EntidadTriangulo.Triangulo;
import ServicioTri.ServicioTri;

public class ExtraExtraPOO5 {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        ServicioTri ts1 = new ServicioTri();
        ServicioTri ts2 = new ServicioTri();
        ServicioTri ts3 = new ServicioTri();
        ServicioTri ts4 = new ServicioTri();
        double cont=0;
        double vector[] = new double[4];
        int num=0;
        System.out.println("Ingrese los datos del primer triangulo");
        ts1.datos();
        vector[0] = ts1.area();
        ts1.perimetro();
        System.out.println("Ingrese los datos del segundo triangulo");
        ts2.datos();
        vector[1] = ts2.area();
        ts2.perimetro();
        System.out.println("Ingrese los datos del tercero triangulo");
        ts3.datos();
        vector[2] = ts3.area();
        ts3.perimetro();
        System.out.println("Ingrese los datos del cuarto triangulo");
        ts4.datos();
        vector[3] = ts4.area();
        ts4.perimetro();
        for (int i = 0; i < 4; i++) {
            if (cont<vector[i]) {
                cont=vector[i];
                num=i;
            }
        }
        System.out.println("El area mas grande es "+cont+" corresponde al triangulo nro: "+(num+1));
    }
      
}


