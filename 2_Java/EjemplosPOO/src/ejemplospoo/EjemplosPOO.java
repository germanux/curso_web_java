/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospoo;

import ejemplospoo.Geometria.Circulo;
import ejemplospoo.Geometria.Rectangulo;
import ejemplospoo.Geometria.Triangulo;

/**
 *
 * @author German
 */
public class EjemplosPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo();
        rec.setAltura(10);
        rec.setBase(5);
        rec.setColor("Azul");
        System.out.println("Area rectangulo: " 
                + rec.calcArea());
        
        Triangulo tri = new Triangulo();
        tri.setAltura(10);
        tri.setBase(5);
        System.out.println("Area Triangulo: " 
                + tri.calcArea());
        
        Circulo cir = new Circulo();
        cir.setRadio(10);
        System.out.println("Area Circulo: " 
                + cir.calcArea());
    }    
}
