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
public class CocheBMW extends CocheBuilder{
    
    @Override
    public void buildMotor() {
       coche.setCilindrada(4395);
       coche.setPotencia(560);
    }

    @Override
    public void buildCarroceria() {  
        coche.setTipo("BMW Serie 5 2016.");
        coche.setNumero_Asientos(5);
    } 

    @Override
    public void mostrarCoche() {
        coche.mostrarCoche();
    }
}
