/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10poo;

import java.util.Arrays;

/**
 *
 * @author Pergo
 */
public class Ejercicio10POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vectorA []=new int[50];
        double vectorB []=new double[20];
        for (int i = 0; i < 50; i++) {
            vectorA[i]=(int) (Math.random()*10);
            System.out.print(vectorA[i]);
        }
        System.out.println("    ");
        System.out.println("------------------------");
        Arrays.sort(vectorA, 0, 50);
        for (int i = 0; i < 50; i++) {
            System.out.print(vectorA[i]);
        }
        System.out.println("    ");
        System.out.println("------------------------");
        for (int i = 0; i < 20; i++) {
            if (i<=10) {
                vectorB[i]=vectorA[i];
            }else{
                vectorB[i]=0.5;
            }
            
            System.out.print(vectorB[i]);
            
        }
    }
    
}
