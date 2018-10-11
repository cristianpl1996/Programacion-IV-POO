package clases;

// CLASE DIRECTOR.
public class Cocina {
    private PizzaBuilder pizzaBuilder;
 
    public void setPizzaBuilder(PizzaBuilder pb) { 
        pizzaBuilder = pb; 
    }
    
    public Pizza getPizza() { 
        return pizzaBuilder.getPizza(); 
    }
 
    public void construirPizza() {
       pizzaBuilder.crearNuevaPizza();
       pizzaBuilder.buildMasa();
       pizzaBuilder.buildSalsa();
       pizzaBuilder.buildRelleno();
       pizzaBuilder.mostrarPizza();
    }
}
