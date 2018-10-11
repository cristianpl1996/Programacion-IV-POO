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
public class PicantePizzaBuilder extends PizzaBuilder {
    @Override
    public void buildNombre() {
       pizza.setNombre("Pizza picante");
    }
    
    @Override
    public void buildMasa() { 
        pizza.setMasa("Cocida"); 
    }
    
    @Override
    public void buildSalsa() { 
        pizza.setSalsa("Salsa picante"); 
    }
    
    @Override
    public void buildRelleno() { 
        pizza.setRelleno("Pimienta, salchichón"); 
    }

    @Override
    public void buildPrecio() {
        pizza.setPrecio(25000);
    }
    
    @Override
    public void mostrarPizza() {
        pizza.mostrarPizza();
    }   
}