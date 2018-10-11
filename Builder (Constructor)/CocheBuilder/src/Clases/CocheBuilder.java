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
// ABSTRACT BUILDER.
 public abstract class CocheBuilder {
    
    protected Coche coche;
    
    public void crearNuevoCoche() {
        coche = new Coche();
    }
    
    public Coche getCoche() {
        return coche;
    }
    
    public abstract void buildMotor();
    public abstract void buildCarroceria();
    public abstract void mostrarCoche();
}
