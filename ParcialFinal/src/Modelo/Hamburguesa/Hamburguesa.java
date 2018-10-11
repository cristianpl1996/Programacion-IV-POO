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
// CLASE PRODUCTO.
public class Hamburguesa {
    
    private String nombre = "";
    private String pan = "";
    private String hamburguesa = "";
    private String contenido = "";
    private long precio = 0;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public void setHamburguesa(String hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }
    
    public static void hamburguesaEspecial(String doblecarne, String pollo, String tocineta) {
        String dobleCarne = doblecarne;
        String Pollo = pollo;
        String Tocineta = tocineta;
        
        System.out.println("Hamburguesa");
        System.out.println(dobleCarne);
        System.out.println(Pollo);
        System.out.println(Tocineta);
    }
    
    public void MostrarHamburguesa() {
        System.out.println("Caracteristicas de la hamburguesa");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Tipo de pan: "+this.pan);
        System.out.println("Hamburguesa: "+this.hamburguesa);
        System.out.println("Contenido: "+this.contenido);
    }
}
