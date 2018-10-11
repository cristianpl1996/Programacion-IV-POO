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
public class PolloPizzaBuilderAdapter extends PizzaBuilder {
    
    PolloPizza pollopizza = new PolloPizza();
    
    @Override
    public void buildNombre() {
       pizza.setNombre("Pizza pollo con champiñones");
    }
    
    @Override
    public void buildMasa() { 
        pizza.setMasa("Suave"); 
    }
    
    @Override
    public void buildSalsa() { 
        pizza.setSalsa("Salsa de tomate"); 
    }
    
    @Override
    public void buildRelleno() { 
        pizza.setRelleno("Queso, champiñones");
        pollopizza.ingredientesEspeciales();
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