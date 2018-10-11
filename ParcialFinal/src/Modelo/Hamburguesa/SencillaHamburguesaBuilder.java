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
public class SencillaHamburguesaBuilder extends HamburguesaBuilder {
    @Override
    public void buildNombre() {
        hamburguesa.setNombre("Hamburguesa sencilla");
    }

    @Override
    public void buildPan() {
        hamburguesa.setPan("Pan para hamburguesa");
    }

    @Override
    public void buildHamburguesa() {
        hamburguesa.setHamburguesa("Hamburguesa sencilla");
    }

    @Override
    public void buildContenido() {
        hamburguesa.setContenido("Huevo de codornis, lechuga, queso, ripio de papas, salsas");
    }

    @Override
    public void buildPrecio() {
        hamburguesa.setPrecio(8000);
    }

    @Override
    public void mostrarHamburguesa() {
        hamburguesa.MostrarHamburguesa();
    } 
}
