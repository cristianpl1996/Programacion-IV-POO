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
public abstract class PerroCalienteBuilder {
    
    protected PerroCaliente perrocaliente;
 
    public PerroCaliente getPerroCaliente() { 
        return perrocaliente; 
    }
    
    public void crearNuevoPerroCaliente() { 
        perrocaliente = new PerroCaliente(); 
    }
    
    public abstract void buildNombre();
    public abstract void buildPan();
    public abstract void buildSalchicha();
    public abstract void buildContenido();
    public abstract void buildPrecio();
    public abstract void mostrarPerroCaliente();    
}
