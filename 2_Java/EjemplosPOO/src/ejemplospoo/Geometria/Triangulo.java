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
public class Triangulo extends FiguraConLados {
    
    public float calcArea() {
        return this.base * this.altura / 2;
    }
}
