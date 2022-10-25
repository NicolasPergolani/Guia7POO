/*

• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa 
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la 
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. 
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene 
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es 
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package Servicio;

import Entidades.Personas;
import java.util.Scanner;

public class PersonasServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

    public void crearPersona(Personas people) {
        String genero;
        System.out.println("Ingrese su nombre y apellido");
        people.setNombre(leer.next());
        System.out.println("Ingrese su edad");
        people.setEdad(leer.nextInt());
        do  {
            System.out.println("Ingrese una condición de sexo válida. (H - hombre)(M-Mujer)(O-Otro)");
            genero = leer.next();
            people.setSexo(genero);
        }while (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M") && !genero.equalsIgnoreCase("O"));
        System.out.println("Ingrese su peso");
        people.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura");
        people.setAltura(leer.nextDouble());
    }
    
    public double calcularIMC(Personas people){
        double IMC, retorno=0;
        
        IMC = (people.getPeso())/(people.getAltura());
        
        if (IMC < 20){
            retorno = -1;
        }else if (IMC >=20 && IMC <=25){
            retorno = 0;
        }else if (IMC > 25){
            retorno = 1;
        }
        return retorno;
    }
    
    public boolean esMayorDeEdad(Personas people){
        boolean edad = false;
        if (people.getEdad() < 18){
            edad = false;
        }else{
            edad = true;
        }
        return edad;
    }
}
