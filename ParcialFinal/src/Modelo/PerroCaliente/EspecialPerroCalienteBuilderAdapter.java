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
public class EspecialPerroCalienteBuilderAdapter extends PerroCalienteBuilder{
    
    EspecialPerro PerroCaliente = new EspecialPerro();
    
    @Override
    public void buildNombre() {
        perrocaliente.setNombre("Perro caliente especial");
    }

    @Override
    public void buildPan() {
        perrocaliente.setPan("Pan de Perro caliente");
    }

    @Override
    public void buildSalchicha() {
        perrocaliente.setSalchicha("Salchicha especial");
    }

    @Override
    public void buildContenido() {
        perrocaliente.setContenido("Huevo de codornis,queso, ripio de papas, salsas");
        PerroCaliente.ingredientesEspeciales();
    }
    
    @Override
    public void buildPrecio() {
       perrocaliente.setPrecio(9000);
    }

    @Override
    public void mostrarPerroCaliente() {
        perrocaliente.mostrarPerroCaliente();
    }  
}
