/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Clases.*;
/**
 *
 * @author Cristian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Concesionario concesionario = new Concesionario();
      CocheBuilder cocheAudi = new CocheAudi();
      CocheBuilder cocheBMW = new CocheBMW();
      CocheBuilder cocheTesla = new CocheTesla();
      
      concesionario.setCocheBuilder(cocheBMW);
      concesionario.construirCoche();
      
      Coche coche = concesionario.getCoche();
    }
    
}
