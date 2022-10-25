/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *6. Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como 
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad 
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los 
parámetros que sean necesarios:
 * @author Cesar
 */
public class Ahorcado {
    String lineas[];
    private char[] palabra;
    private int cantlet;
    private int cantjug;
    private int encontradas;

    public Ahorcado(String[] lineas, char[] palabra, int cantlet, int cantjug, int encontradas) {
        this.lineas = lineas;
        this.palabra = palabra;
        this.cantlet = cantlet;
        this.cantjug = cantjug;
        this.encontradas = encontradas;
    }

    public Ahorcado() {
    }

    public String[] getLineas() {
        return lineas;
    }

    public void setLineas(String[] lineas) {
        this.lineas = lineas;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getCantlet() {
        return cantlet;
    }

    public void setCantlet(int cantlet) {
        this.cantlet = cantlet;
    }

    public int getCantjug() {
        return cantjug;
    }

    public void setCantjug(int cantjug) {
        this.cantjug = cantjug;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

   
    
    }
