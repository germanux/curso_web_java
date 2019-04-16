/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospoo;

import ejemplospoo.Geometria.*;
import java.io.*;

/**
 *
 * @author German
 */
public class DesdeFicheros {
    
    public static void guardarRectangulos() {
        
        Rectangulo rec = new Rectangulo(10, 5);
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try {   // Intentamos hacer cosas con ficheros
            fichero = new FileWriter("C:/figuras/rectangulo.txt");
            pw = new PrintWriter(fichero);
            pw.println("Rectangulo: base = " + rec.getBase() 
                    + ", altura = " + rec.getAltura()
                    + ", color = " + rec.getColor());
        } catch (Exception ex) {    // Si ocurre algún error, 
                // catch() captura la excepción, con la info en ex.
            ex.printStackTrace();
        } finally { 
// Lo ejecuta siempre, tanto si ha habido error como si no       
            try {   // Anidamos try-catch dentro del finally
                if (fichero != null) {
                    fichero.close();                
                } 
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
