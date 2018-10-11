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
// CONCRETE BUILDER, ADAPTER
public class EspecialHamburguesaBuilderAdapter extends HamburguesaBuilder {
    
    EspecialHamburguesa Hamburguesa = new EspecialHamburguesa();
    
     
    @Override
    public void buildNombre() {
        hamburguesa.setNombre("Hamburguesa especial");
    }

    @Override
    public void buildPan() {
        hamburguesa.setPan("Pan para hamburguesa");
    }

    @Override
    public void buildHamburguesa() {
        hamburguesa.setHamburguesa("Hamburguesa especial");
    }

    @Override
    public void buildContenido() {
     
        hamburguesa.setContenido("Huevo de codornis, lechuga, queso, ripio de papas, salsas");
        this.Hamburguesa.ingredientesEspeciales();
    }

    @Override
    public void buildPrecio() {
        hamburguesa.setPrecio(10000);
    }

    @Override
    public void mostrarHamburguesa() {
        hamburguesa.MostrarHamburguesa();
    } 
}
