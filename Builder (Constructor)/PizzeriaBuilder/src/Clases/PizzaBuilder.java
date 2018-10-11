package clases;

// ABSTRACT BUILDER.
public abstract class PizzaBuilder {
    protected Pizza pizza;
 
    public Pizza getPizza() { 
        return pizza; 
    }
    
    public void crearNuevaPizza() { 
        pizza = new Pizza(); 
    }
 
    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
    public abstract void mostrarPizza();
}
