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
public class Antibioticos {
    
    private String NombreDelProducto;
    private String Dosis; 
    private String TipoDeAnimal;
    private long Precio; 

    public Antibioticos() {
       this.NombreDelProducto = "";
       this.Dosis = ""; 
       this.TipoDeAnimal = "";
       this.Precio = 0;
    }

    public Antibioticos(String NombreDelProducto, String Dosis, String TipoDeAnimal, long Precio) {
        this.NombreDelProducto = NombreDelProducto;
        this.Dosis = Dosis;
        this.TipoDeAnimal = TipoDeAnimal;
        this.Precio = Precio;
    }

    public String getNombreDelProducto() {
        return NombreDelProducto;
    }

    public void setNombreDelProducto(String NombreDelProducto) {
        this.NombreDelProducto = NombreDelProducto;
    }

    public String getDosis() {
        return Dosis;
    }

    public void setDosis(String Dosis) {
        this.Dosis = Dosis;
    }

    public String getTipoDeAnimal() {
        return TipoDeAnimal;
    }

    public void setTipoDeAnimal(String TipoDeAnimal) {
        this.TipoDeAnimal = TipoDeAnimal;
    }

    public long getPrecio() {
        return Precio;
    }

    public void setPrecio(long Precio) {
        this.Precio = Precio;
    }  
}
