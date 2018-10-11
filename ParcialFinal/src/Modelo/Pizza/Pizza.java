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
public class Pizza {
    
    private String nombre = "";
    private String masa = "";
    private String salsa = "";
    private String relleno = "";
    private long precio = 0;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public void setMasa(String masa) { 
        this.masa = masa; 
    }
    
    public void setSalsa(String salsa) { 
        this.salsa = salsa; 
    }
    
    public void setRelleno(String relleno) { 
        this.relleno = relleno; 
    }
    
    public void setPrecio(long precio) { 
        this.precio = precio; 
    }
    
    public static void PolloPizza(String maizdulce, String quesocheddar, String tomatecherry) {
        String maizDulce = maizdulce;
        String quesoCheddar = quesocheddar;
        String tomateCherry = tomatecherry;
        
        System.out.println("Pizza");
        System.out.println(maizDulce);
        System.out.println(quesoCheddar);
        System.out.println(tomateCherry);
    }
    
    public void mostrarPizza() {
        System.out.println("Caracteristicas de la Pizza");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Masa: "+this.masa);
        System.out.println("Salsa: "+this.salsa);
        System.out.println("Relleno: "+this.relleno);
        System.out.println("Precio: "+this.precio);
    }
}