/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian Patiño
 */
public class MetodosPersona {
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List<Persona> contacto = new ArrayList<>();
    Persona persona = new Persona();
    
    public boolean listaContactosVacia() {
        return this.contacto.isEmpty();
    }
    
    public void agregarContactos() throws IOException{
        int i = 1;
        String Nombre = "", Apellidos = "", telefono = "", Respuesta = "";
        long Telefono = 0;
        do {
            System.out.println("========= CONTACTO[" + i + "] ===========");
            System.out.println("Digite el nombre: ");
            Nombre = this.reader.readLine();
            System.out.println("Digite los apellidos: ");
            Apellidos = this.reader.readLine(); 
            System.out.println("Digite el telefono: ");
            telefono = this.reader.readLine();
            Telefono = Long.parseLong(telefono);
            this.persona = new Persona(Nombre, Apellidos, Telefono);  
            this.contacto.add(persona);
            System.out.println("Desea ingresar mas contactos? [S/N]: ");
            Respuesta = this.reader.readLine();
            i++;
        } while (Respuesta.equalsIgnoreCase("s")); 
    }

    public void buscarPorNombre(String nombre) throws IOException {
        for (Persona persona : this.contacto) {
            if (persona.getNombre().equals(nombre)) {
                System.out.println("==== CONTACTO ENCONTRADO ====");
                mostrarContacto(persona);
                break;
            }
        }
    }
    
    public void buscarPorApellidos(String apellidos) throws IOException {
        for (Persona persona : this.contacto) {
            if (persona.getApellidos().equals(apellidos)) {
                System.out.println("==== CONTACTO ENCONTRADO ====");
                mostrarContacto(persona);
                break;
            }
        }
    }
    
     public void buscarPorTelefono(long Telefono) throws IOException {
        for (Persona persona : this.contacto) {
            if (persona.getTelefono()== Telefono) {
                System.out.println("==== CONTACTO ENCONTRADO ====");
                mostrarContacto(persona);
                break;
            }
        }
    }
    
    public boolean eliminarContacto(String nombre) throws IOException {
        boolean bandera = false;
        for (Persona persona : this.contacto) {
            if (persona.getNombre().equals(nombre)) {
                bandera = true;
                contacto.remove(persona);
                break;
            }
        }
        return bandera;
    }
    
    public void listarContactos(){
        System.out.println("==== LISTA DE CONTACTOS ====");
        for (Persona persona : this.contacto) {
            mostrarContacto(persona);
        }
    }
    
    private void mostrarContacto(Persona persona) { 
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellidos());
        System.out.println("Telefono: " + persona.getTelefono());
    }
}
