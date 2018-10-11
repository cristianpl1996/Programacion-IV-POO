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
// CLASE DIRECTOR.
public class Concesionario {
    
    private CocheBuilder cochebuilder;

    public void setCocheBuilder(CocheBuilder cb) {
        this.cochebuilder = cb;
    }

    public Coche getCoche() {
        return cochebuilder.getCoche();
    }

    public void construirCoche()
    {
        cochebuilder.crearNuevoCoche();
        cochebuilder.buildMotor();
        cochebuilder.buildCarroceria();
        cochebuilder.mostrarCoche();
    }  
}
