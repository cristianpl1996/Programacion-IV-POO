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
public class SencilloPerroCalienteBuilder extends PerroCalienteBuilder {
    @Override
    public void buildNombre() {
        perrocaliente.setNombre("Perro caliente sencillo");
    }

    @Override
    public void buildPan() {
        perrocaliente.setPan("Pan de perro caliente");
    }

    @Override
    public void buildSalchicha() {
        perrocaliente.setSalchicha("Salchicha sencilla");
    }

    @Override
    public void buildContenido() {
        perrocaliente.setContenido("Huevo de codornis, queso, ripio de papas, salsas");
    }
    
    @Override
    public void buildPrecio() {
        perrocaliente.setPrecio(6000);
    }

    @Override
    public void mostrarPerroCaliente() {
        perrocaliente.mostrarPerroCaliente();
    }    
}
