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
public class Circulo extends Figura {
    
    private float radio;

    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public float calcArea() {
        return (float)(Math.PI 
            * Math.pow(this.radio, 2));
    }
}
