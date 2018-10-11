/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Cristian Patiño
 */
public class Persona {
    
    private String Nombre;
    private String Apellidos;
    private long Telefono;

    public Persona() {
        Nombre = "";
        Apellidos = "";
        Telefono = 0;
    }

    public Persona(String Nombre, String Apellido, long Telefono) {
        this.Nombre = Nombre;
        this.Apellidos = Apellido;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }
}
