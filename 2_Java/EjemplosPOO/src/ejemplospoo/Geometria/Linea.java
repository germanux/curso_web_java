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
public class Linea implements IImprimible{
    Linea () {        
    }
    @Override
    public void imprimir() {
        System.out.println("Linea.imprimir(): " + this.toString());
    } 
}
