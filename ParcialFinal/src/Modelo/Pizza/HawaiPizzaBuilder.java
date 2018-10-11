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
// CONCRETE BUILDER.
public class HawaiPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildNombre() {
        pizza.setNombre("Pizza Hawaiana");
    }
    
    @Override
    public void buildMasa() { 
        pizza.setMasa("Suave"); 
    }
    
    @Override
    public void buildSalsa() { 
        pizza.setSalsa("Salsa Dulce"); 
    }
    
    @Override
    public void buildRelleno() { 
        pizza.setRelleno("Piña, alcachofas, jamon"); 
    }
    
    @Override
    public void buildPrecio() {
        pizza.setPrecio(20000);
    }

    @Override
    public void mostrarPizza() {
        pizza.mostrarPizza();
    }
}