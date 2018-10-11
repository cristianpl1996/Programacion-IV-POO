/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Cristian Patiño
 */
public class Vendedor {
    
    private String Nombre_vendedor;
    private String Apellidos_vendedor;
    private long Identificacion_de_vendedor;

    public Vendedor() {
        Nombre_vendedor = "";
        Apellidos_vendedor = "";
        Identificacion_de_vendedor = 0;
    }

    public Vendedor(String Nombre_vendedor, String Apellidos_vendedor, long Identificacion_de_vendedor) {
        this.Nombre_vendedor = Nombre_vendedor;
        this.Apellidos_vendedor = Apellidos_vendedor;
        this.Identificacion_de_vendedor = Identificacion_de_vendedor;
    }

    public String getNombre_vendedor() {
        return Nombre_vendedor;
    }

    public void setNombre_vendedor(String Nombre_vendedor) {
        this.Nombre_vendedor = Nombre_vendedor;
    }

    public String getApellidos_vendedor() {
        return Apellidos_vendedor;
    }

    public void setApellidos_vendedor(String Apellidos_vendedor) {
        this.Apellidos_vendedor = Apellidos_vendedor;
    }

    public long getIdentificacion_de_vendedor() {
        return Identificacion_de_vendedor;
    }

    public void setIdentificacion_de_vendedor(long Identificacion_de_vendedor) {
        this.Identificacion_de_vendedor = Identificacion_de_vendedor;
    }
    
    
   
}
