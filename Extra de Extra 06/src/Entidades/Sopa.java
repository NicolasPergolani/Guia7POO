package Entidades;

/**
 *
 * @author Guillote
 */
public class Sopa {
    
    public String matriz[][]=new String[10][10];
    private String palabra;

    public Sopa(String palabra) {
        this.palabra = palabra;
    }

    public Sopa() {
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "Sopa{" + "matriz=" + matriz + ", palabra=" + palabra + '}';
    }


}
