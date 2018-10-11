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
public class PerroCaliente {
    
    private String nombre = "";
    private String pan = "";
    private String salchicha = "";
    private String contenido = "";
    private long precio = 0;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public void setSalchicha(String salchicha) {
        this.salchicha = salchicha;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }
    
    public static void perroEspecial(String doblesalchicha, String pollo, String tocineta) {
        String dobleSalchicha = doblesalchicha;
        String Pollo = pollo;
        String Tocineta = tocineta;
        
        System.out.println("Perro Caliente");
        System.out.println(dobleSalchicha);
        System.out.println(Pollo);
        System.out.println(Tocineta);
    }

    public void mostrarPerroCaliente() {
        System.out.println("Caracteristicas del Perro Caliente");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("tipo de pan: "+this.pan);
        System.out.println("Salchicha: "+this.salchicha);
        System.out.println("Contenido: "+this.contenido);
        System.out.println("Precio: "+this.precio);
    }  
}
