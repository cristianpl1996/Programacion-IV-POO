package principal;

// CLASE PRINCIPAL.

import clases.*;

public class Principal {
    public static void main(String[] args) {
        Cocina cocina = new Cocina(); // Director.
        PizzaBuilder hawai_pizzabuilder = new HawaiPizzaBuilder();
        PizzaBuilder picante_pizzabuilder = new PicantePizzaBuilder();
 
        cocina.setPizzaBuilder( picante_pizzabuilder );
        cocina.construirPizza();
 
        Pizza pizza = cocina.getPizza();
    }
}
