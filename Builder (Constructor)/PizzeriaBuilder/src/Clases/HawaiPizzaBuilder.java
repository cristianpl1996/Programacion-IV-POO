package clases;

// CONCRETE BUILDER.
public class HawaiPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildMasa() { 
        pizza.setMasa("suave"); 
    }
    
    @Override
    public void buildSalsa() { 
        pizza.setSalsa("dulce"); 
    }
    
    @Override
    public void buildRelleno() { 
        pizza.setRelleno("chorizo+alcachofas"); 
    }

    @Override
    public void mostrarPizza() {
        pizza.mostrarPizza();
    }
}
