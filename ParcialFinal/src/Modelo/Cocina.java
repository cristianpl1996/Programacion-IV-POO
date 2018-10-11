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
// CLASE DIRECTOR.
public class Cocina { 
    private PizzaBuilder pizzabuilder;
    private PerroCalienteBuilder perrocalientebuilder;
    private HamburguesaBuilder hamburguesabuilder;
 
    public void setPizzaBuilder(PizzaBuilder pb) { 
        this.pizzabuilder = pb; 
    }
    
    public Pizza getPizza() { 
        return this.pizzabuilder.getPizza(); 
    }
    
    public void setPerroCalienteBuilder(PerroCalienteBuilder pcb) { 
        this.perrocalientebuilder = pcb; 
    }
    
    public PerroCaliente getPerroCaliente() { 
        return this.perrocalientebuilder.getPerroCaliente(); 
    }
    
    public void setHamburguesaBuilder(HamburguesaBuilder hb) { 
        this.hamburguesabuilder = hb; 
    }
    
    public Hamburguesa getHambuguesa() { 
        return this.hamburguesabuilder.getHamburguesa(); 
    }
 
    public void construirPizza() {
       this.pizzabuilder.crearNuevaPizza();
       this.pizzabuilder.buildNombre();
       this.pizzabuilder.buildMasa();
       this.pizzabuilder.buildSalsa();
       this.pizzabuilder.buildRelleno();
       this.pizzabuilder.buildPrecio();
       this.pizzabuilder.mostrarPizza();
    }
    
    public void construirPerroCaliente() {
       this.perrocalientebuilder.crearNuevoPerroCaliente();
       this.perrocalientebuilder.buildNombre();
       this.perrocalientebuilder.buildPan();
       this.perrocalientebuilder.buildSalchicha();
       this.perrocalientebuilder.buildContenido();
       this.perrocalientebuilder.buildPrecio();
       this.perrocalientebuilder.mostrarPerroCaliente();
    }
    
    public void construirHamburguesa() {
       this.hamburguesabuilder.crearNuevaHamburguesa();
       this.hamburguesabuilder.buildNombre();
       this.hamburguesabuilder.buildPan();
       this.hamburguesabuilder.buildHamburguesa();
       this.hamburguesabuilder.buildContenido();
       this.hamburguesabuilder.buildPrecio();
       this.hamburguesabuilder.mostrarHamburguesa();
    }
}
