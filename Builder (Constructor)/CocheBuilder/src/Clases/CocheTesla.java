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
public class CocheTesla extends CocheBuilder {
    
    @Override
    public void buildMotor() {
       coche.setPotencia(560);
    }

    @Override
    public void buildCarroceria() {  
        coche.setTipo("Tesla Model S.");
        coche.setNumero_Asientos(4);
    }   

    @Override
    public void mostrarCoche() {
        coche.mostrarCoche();
    }
}
