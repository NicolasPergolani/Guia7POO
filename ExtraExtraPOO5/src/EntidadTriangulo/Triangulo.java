/*
 Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package EntidadTriangulo;


public class Triangulo {
    private int base,lado;

    public Triangulo(int base, int lado) {
        this.base = base;
        this.lado = lado;
    }

    public Triangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", lado=" + lado + '}';
    }
    
    
}
