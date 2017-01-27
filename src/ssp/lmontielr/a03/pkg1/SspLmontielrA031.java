/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssp.lmontielr.a03.pkg1;

import java.util.Scanner;

/**
 *
 * @author Montiel
 */
public class SspLmontielrA031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        // Declaracion de variables 
        double a, sen , cos;
        // a= angulo, sen= seno, cos= coseno 
        Scanner T= new Scanner(System.in);
        System.out.println("Intorduce el angulo desde 0 a 360");
        a= T.nextDouble();
        double b = Math.toRadians(a) ;
        sen = Math.sin(b) ;
        cos = Math.cos(b) ;
         //Mostrar resultado
        System.out.println("El seno del angulo es " + sen);
        
        System.out.println("El coseno del angulo es " + cos);
    }
    
}
