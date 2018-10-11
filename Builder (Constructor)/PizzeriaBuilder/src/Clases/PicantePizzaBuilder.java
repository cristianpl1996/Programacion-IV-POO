package clases;

// CONCRETE BUILDER.
public class PicantePizzaBuilder extends PizzaBuilder {
    @Override
    public void buildMasa() { 
        pizza.setMasa("cocida"); 
    }
    
    @Override
    public void buildSalsa() { 
        pizza.setSalsa("picante"); 
    }
    
    @Override
    public void buildRelleno() { 
        pizza.setRelleno("pimienta+salchichón"); 
    }

    @Override
    public void mostrarPizza() {
        pizza.mostrarPizza();
    }
}
