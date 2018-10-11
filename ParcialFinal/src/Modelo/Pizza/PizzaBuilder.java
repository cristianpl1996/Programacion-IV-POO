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
public abstract class PizzaBuilder {
    protected Pizza pizza;
 
    public Pizza getPizza() { 
        return pizza; 
    }
    
    public void crearNuevaPizza() { 
        pizza = new Pizza(); 
    }
 
    public abstract void buildNombre();    
    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
    public abstract void buildPrecio();
    public abstract void mostrarPizza();
}
