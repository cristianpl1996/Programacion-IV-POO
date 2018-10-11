/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Cristian
 */
// CONCRETE BUILDER.
public class CocheAudi extends CocheBuilder {
    
    @Override
    public void buildMotor() {
       coche.setCilindrada(2995);
       coche.setPotencia(300);
    }

    @Override
    public void buildCarroceria() {  
        coche.setTipo("Audi A7 Sportback 3.0 TFSI quattro S tronic 7 vel.");
        coche.setNumero_Asientos(5);
    }    

    @Override
    public void mostrarCoche() {
        coche.mostrarCoche();
    }
}
