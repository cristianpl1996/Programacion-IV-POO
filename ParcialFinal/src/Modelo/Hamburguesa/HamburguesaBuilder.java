/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Cristian
 */
// ABSTRACT BUILDER.
public abstract class HamburguesaBuilder {
    
    protected Hamburguesa hamburguesa;
 
    public Hamburguesa getHamburguesa() { 
        return hamburguesa; 
    }
    
    public void crearNuevaHamburguesa() { 
        hamburguesa = new Hamburguesa(); 
    }
    
    public abstract void buildNombre();
    public abstract void buildPan();
    public abstract void buildHamburguesa();
    public abstract void buildContenido();
    public abstract void buildPrecio();
    public abstract void mostrarHamburguesa(); 
    
}
