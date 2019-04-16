/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospoo.Geometria;

/**
 *
 * @author German
 */
public class Cuadrado extends Rectangulo {
        
    public Cuadrado(float lado) {
        super(lado, lado);
    }
    public Cuadrado(float lado, String color) {
        super(lado, lado, color);
    }
   /* public float calcArea() {
        return this.base * this.base;
    }*/
}
